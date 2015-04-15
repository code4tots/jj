// Generated from Jj.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JjParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, STR=17, 
		NAME=18, CMT=19, WS=20;
	public static final int
		RULE_start = 0, RULE_b = 1, RULE_ifElse = 2, RULE_if_ = 3, RULE_while_ = 4, 
		RULE_h = 5, RULE_s = 6, RULE_e = 7;
	public static final String[] ruleNames = {
		"start", "b", "ifElse", "if_", "while_", "h", "s", "e"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if'", "'else'", "'while'", "';'", "'['", "','", 
		"']'", "':'", "'.'", "'('", "')'", "':='", "'='", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "STR", "NAME", "CMT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Jj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JjParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JjParser.EOF, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << STR) | (1L << NAME))) != 0)) {
				{
				{
				setState(16);
				s();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BContext extends ParserRuleContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << STR) | (1L << NAME))) != 0)) {
				{
				{
				setState(25);
				s();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitIfElse(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__2);
			setState(34);
			e(0);
			setState(35);
			b();
			setState(36);
			match(T__3);
			setState(37);
			s();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_Context extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			e(0);
			setState(41);
			b();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_Context extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__4);
			setState(44);
			e(0);
			setState(45);
			b();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HContext extends ParserRuleContext {
		public HContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h; }
	 
		public HContext() { }
		public void copyFrom(HContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfHybridContext extends HContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public IfHybridContext(HContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterIfHybrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitIfHybrid(this);
		}
	}
	public static class BlockHybridContext extends HContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BlockHybridContext(HContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterBlockHybrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitBlockHybrid(this);
		}
	}
	public static class IfElseHybridContext extends HContext {
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public IfElseHybridContext(HContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterIfElseHybrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitIfElseHybrid(this);
		}
	}
	public static class WhileHybridContext extends HContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public WhileHybridContext(HContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterWhileHybrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitWhileHybrid(this);
		}
	}

	public final HContext h() throws RecognitionException {
		HContext _localctx = new HContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_h);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BlockHybridContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				b();
				}
				break;
			case 2:
				_localctx = new IfElseHybridContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				ifElse();
				}
				break;
			case 3:
				_localctx = new IfHybridContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				if_();
				}
				break;
			case 4:
				_localctx = new WhileHybridContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				while_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoOpContext extends SContext {
		public NoOpContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterNoOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitNoOp(this);
		}
	}
	public static class ExprStmtContext extends SContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExprStmtContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitExprStmt(this);
		}
	}
	public static class HStmtContext extends SContext {
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public HStmtContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterHStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitHStmt(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_s);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new HStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				h();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				e(0);
				setState(55);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new NoOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ParContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitPar(this);
		}
	}
	public static class LambdaContext extends EContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(JjParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JjParser.NAME, i);
		}
		public LambdaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitLambda(this);
		}
	}
	public static class CallContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public CallContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitCall(this);
		}
	}
	public static class DictContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public DictContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitDict(this);
		}
	}
	public static class AssignContext extends EContext {
		public TerminalNode NAME() { return getToken(JjParser.NAME, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public AssignContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitAssign(this);
		}
	}
	public static class StrContext extends EContext {
		public List<TerminalNode> STR() { return getTokens(JjParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(JjParser.STR, i);
		}
		public StrContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitStr(this);
		}
	}
	public static class GetItemContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public GetItemContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterGetItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitGetItem(this);
		}
	}
	public static class NameContext extends EContext {
		public TerminalNode NAME() { return getToken(JjParser.NAME, 0); }
		public NameContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitName(this);
		}
	}
	public static class AttrContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode NAME() { return getToken(JjParser.NAME, 0); }
		public AttrContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitAttr(this);
		}
	}
	public static class ListContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public ListContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitList(this);
		}
	}
	public static class HExprContext extends EContext {
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public HExprContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterHExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitHExpr(this);
		}
	}
	public static class SetItemContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public SetItemContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterSetItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitSetItem(this);
		}
	}
	public static class AttrAssignContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode NAME() { return getToken(JjParser.NAME, 0); }
		public AttrAssignContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterAttrAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitAttrAssign(this);
		}
	}
	public static class DeclContext extends EContext {
		public TerminalNode NAME() { return getToken(JjParser.NAME, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public DeclContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JjListener ) ((JjListener)listener).exitDecl(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new DeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(NAME);
				setState(62);
				match(T__13);
				setState(63);
				e(6);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(NAME);
				setState(65);
				match(T__14);
				setState(66);
				e(5);
				}
				break;
			case 3:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						match(STR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(NAME);
				}
				break;
			case 5:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(T__6);
				setState(82);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << STR) | (1L << NAME))) != 0)) {
					{
					setState(74);
					e(0);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(75);
						match(T__7);
						setState(76);
						e(0);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(T__8);
				}
				break;
			case 6:
				{
				_localctx = new DictContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__0);
				setState(98);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << STR) | (1L << NAME))) != 0)) {
					{
					setState(86);
					e(0);
					setState(87);
					match(T__9);
					setState(88);
					e(0);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << STR) | (1L << NAME))) != 0)) {
						{
						{
						setState(89);
						e(0);
						setState(90);
						match(T__9);
						setState(91);
						e(0);
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(100);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__11);
				setState(102);
				e(0);
				setState(103);
				match(T__12);
				}
				break;
			case 8:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(T__15);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(106);
					match(NAME);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				b();
				}
				break;
			case 9:
				{
				_localctx = new HExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				h();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AttrAssignContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(T__10);
						setState(118);
						match(NAME);
						setState(119);
						match(T__14);
						setState(120);
						e(5);
						}
						break;
					case 2:
						{
						_localctx = new SetItemContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(122);
						match(T__6);
						setState(123);
						e(0);
						setState(124);
						match(T__8);
						setState(125);
						match(T__14);
						setState(126);
						e(4);
						}
						break;
					case 3:
						{
						_localctx = new AttrContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(128);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(129);
						match(T__10);
						setState(130);
						match(NAME);
						}
						break;
					case 4:
						{
						_localctx = new GetItemContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(131);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(132);
						match(T__6);
						setState(133);
						e(0);
						setState(134);
						match(T__8);
						}
						break;
					case 5:
						{
						_localctx = new CallContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(136);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(137);
						match(T__11);
						setState(146);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__11) | (1L << T__15) | (1L << STR) | (1L << NAME))) != 0)) {
							{
							setState(138);
							e(0);
							setState(143);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__7) {
								{
								{
								setState(139);
								match(T__7);
								setState(140);
								e(0);
								}
								}
								setState(145);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(148);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7\66\n\7\3\b\3\b\3\b\3\b\3\b\5\b=\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\6\tG\n\t\r\t\16\tH\3\t\3\t\3\t\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\5"+
		"\tU\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\5"+
		"\te\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\5"+
		"\tu\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13"+
		"\t\5\t\u0095\n\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\t\2\3\20\n\2"+
		"\4\6\b\n\f\16\20\2\2\u00b0\2\25\3\2\2\2\4\32\3\2\2\2\6#\3\2\2\2\b)\3\2"+
		"\2\2\n-\3\2\2\2\f\65\3\2\2\2\16<\3\2\2\2\20t\3\2\2\2\22\24\5\16\b\2\23"+
		"\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27"+
		"\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\36\7\3\2\2\33\35\5\16\b\2\34"+
		"\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3"+
		"\2\2\2!\"\7\4\2\2\"\5\3\2\2\2#$\7\5\2\2$%\5\20\t\2%&\5\4\3\2&\'\7\6\2"+
		"\2\'(\5\16\b\2(\7\3\2\2\2)*\7\5\2\2*+\5\20\t\2+,\5\4\3\2,\t\3\2\2\2-."+
		"\7\7\2\2./\5\20\t\2/\60\5\4\3\2\60\13\3\2\2\2\61\66\5\4\3\2\62\66\5\6"+
		"\4\2\63\66\5\b\5\2\64\66\5\n\6\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2"+
		"\2\2\65\64\3\2\2\2\66\r\3\2\2\2\67=\5\f\7\289\5\20\t\29:\7\b\2\2:=\3\2"+
		"\2\2;=\7\b\2\2<\67\3\2\2\2<8\3\2\2\2<;\3\2\2\2=\17\3\2\2\2>?\b\t\1\2?"+
		"@\7\24\2\2@A\7\20\2\2Au\5\20\t\bBC\7\24\2\2CD\7\21\2\2Du\5\20\t\7EG\7"+
		"\23\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2Iu\3\2\2\2Ju\7\24\2\2K"+
		"T\7\t\2\2LQ\5\20\t\2MN\7\n\2\2NP\5\20\t\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2"+
		"\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2\2\2UV\3\2\2\2Vu\7\13"+
		"\2\2Wd\7\3\2\2XY\5\20\t\2YZ\7\f\2\2Za\5\20\t\2[\\\5\20\t\2\\]\7\f\2\2"+
		"]^\5\20\t\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2"+
		"\2ca\3\2\2\2dX\3\2\2\2de\3\2\2\2ef\3\2\2\2fu\7\4\2\2gh\7\16\2\2hi\5\20"+
		"\t\2ij\7\17\2\2ju\3\2\2\2ko\7\22\2\2ln\7\24\2\2ml\3\2\2\2nq\3\2\2\2om"+
		"\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2ru\5\4\3\2su\5\f\7\2t>\3\2\2\2t"+
		"B\3\2\2\2tF\3\2\2\2tJ\3\2\2\2tK\3\2\2\2tW\3\2\2\2tg\3\2\2\2tk\3\2\2\2"+
		"ts\3\2\2\2u\u0099\3\2\2\2vw\f\6\2\2wx\7\r\2\2xy\7\24\2\2yz\7\21\2\2z\u0098"+
		"\5\20\t\7{|\f\5\2\2|}\7\t\2\2}~\5\20\t\2~\177\7\13\2\2\177\u0080\7\21"+
		"\2\2\u0080\u0081\5\20\t\6\u0081\u0098\3\2\2\2\u0082\u0083\f\f\2\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0098\7\24\2\2\u0085\u0086\f\13\2\2\u0086\u0087\7"+
		"\t\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7\13\2\2\u0089\u0098\3\2\2\2\u008a"+
		"\u008b\f\n\2\2\u008b\u0094\7\16\2\2\u008c\u0091\5\20\t\2\u008d\u008e\7"+
		"\n\2\2\u008e\u0090\5\20\t\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u008c\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\7\17\2\2\u0097v\3\2\2\2\u0097{\3\2\2\2\u0097\u0082\3\2\2\2\u0097"+
		"\u0085\3\2\2\2\u0097\u008a\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\21\3\2\2\2\u009b\u0099\3\2\2\2\21\25\36"+
		"\65<HQTadot\u0091\u0094\u0097\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}