import json, sys

from antlr4 import CommonTokenStream, ParseTreeWalker
from antlr4.InputStream import InputStream

from JjListener import JjListener
from JjLexer import JjLexer
from JjParser import JjParser

LIST = '__list__'
DICT = '__dict__'
GET = '__get__'
SET = '__set__'

class BaseListener(JjListener):

  def Result(self, x):
    return x

  def Push(self, value):
    self.stack[-1].append(value)

  def Pop(self):
    return self.stack[-1].pop()

  def MultiPop(self, n):
    xs = self.stack[-1][-n:]
    del self.stack[-1][-n:]
    return xs

  def PushStack(self):
    self.stack.append([])

  def PopStack(self):
    return self.stack.pop()

  def enterStart(self, ctx):
    self.stack = [[]]
  def exitStart(self, ctx):
    assert len(self.stack) == 1, self.stack
    self.result = self.Result(self.Block(self.stack[0]))

  def enterB(self, ctx):
    self.PushStack()
  def exitB(self, ctx):
    self.Push(self.Scope(self.Block(self.PopStack())))

  def exitIfElse(self, ctx):
    self.Push(self.If(*self.MultiPop(3)))

  def exitIf_(self, ctx):
    self.Push(self.If(*(self.MultiPop(2) + [self.Str('')])))

  def exitWhile_(self, ctx):
    self.Push(self.While(*self.MultiPop(2)))

  def exitStr(self, ctx):
    self.Push(self.Str(''.join(str(eval(n.getText())) for n in ctx.STR())))

  def exitName(self, ctx):
    self.Push(self.Name(ctx.NAME().getText()))

  def enterList(self, ctx):
    self.PushStack()
  def exitList(self, ctx):
    self.Push(self.Call(self.Name(LIST), self.PopStack()))

  def enterDict(self, ctx):
    self.PushStack()
  def exitList(self, ctx):
    self.Push(self.Call(self.Name(DICT), self.PopStack()))

  def exitAttr(self, ctx):
    self.Push(self.Call(self.Name(GET), [self.Pop(), self.Str(ctx.NAME().getText())]))

  def exitGetItem(self, ctx):
    self.Push(self.Call(self.Name(GET), self.MultiPop(2)))

  def exitDecl(self, ctx):
    self.Push(self.Decl(ctx.NAME().getText(), self.Pop()))

  def exitAssign(self, ctx):
    self.Push(self.Assign(ctx.NAME().getText(), self.Pop()))

  def exitAttrAssign(self, ctx):
    x, v = self.MultiPop(2)
    self.Push(self.Call(self.Name(SET), [x, self.Str(ctx.NAME().getText()), v]))

  def exitSetItem(self, ctx):
    self.Push(self.Call(self.Name(SET), self.MultiPop(3)))

  def exitLambda(self, ctx):
    names = [n.getText() for n in ctx.NAME()]
    self.Push(self.Lambda(names, self.Pop()))

class ToTreeListener(BaseListener):

  def Block(self, stmts):
    return {'type': 'block', 'stmts': stmts}

  def Scope(self, body):
    return {'type': 'block', 'body': body}

  def If(self, cond, a, b):
    return {'type': 'if', 'cond': cond, 'a': a, 'b': b}

  def While(self, cond, body):
    return {'type': 'while', 'cond': cond, 'body': body}

  def Str(self, s):
    return {'type': 'str', 'value': s}

  def Name(self, s):
    return {'type': 'name', 'value': s}

  def Call(self, f, args):
    return {'type': 'call', 'f': f, 'args': args}

  def Decl(self, name, value):
    return {'type': 'decl', 'name': name, 'value': value}

  def Assign(self, name, value):
    return {'type': 'assign', 'name': name, 'value': value}

  def Lambda(self, names, body):
    return {'type': 'lambda', 'names': names, 'body': body}

class ToJsonListener(ToTreeListener):

  def Result(self, x):
    return json.dumps(x)

def Parse(string, listener=None):
  listener = listener or ToTreeListener()
  tree = JjParser(CommonTokenStream(JjLexer(InputStream(string)))).start()
  ParseTreeWalker().walk(listener, tree)
  return listener.result

def Main(string, command):
  listener = (ToJsonListener if command == 'json' else
              ToTreeListener)()
  return Parse(string, listener)

if __name__ == '__main__':
  print(Main(sys.stdin.read(), sys.argv[1] if len(sys.argv) > 0 else None))
