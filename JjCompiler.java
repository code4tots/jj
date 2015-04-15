import java.util.HashMap;
import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JjCompiler {

	public static void main(String[] args) {
		JjLexer lexer = new JjLexer(new ANTLRInputStream("print('hello');"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JjParser parser = new JjParser(tokens);
		Listener listener = new Listener();
		ParserRuleContext tree = parser.start();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, tree);
	}


	public static class Listener extends JjBaseListener {

	}

}

