// Generated from Jj.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JjLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, STR=17, 
		NAME=18, CMT=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "STR", "NAME", 
		"CMT", "WS"
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


	public JjLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\6\22V\n\22\r\22\16\22W\3\22\3\22\7\22\\\n\22\f\22\16\22_\13\22\5"+
		"\22a\n\22\3\22\3\22\6\22e\n\22\r\22\16\22f\3\22\3\22\3\22\3\22\7\22m\n"+
		"\22\f\22\16\22p\13\22\3\22\3\22\3\22\3\22\3\22\7\22w\n\22\f\22\16\22z"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0082\n\22\f\22\16\22\u0085"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u008d\n\22\f\22\16\22\u0090"+
		"\13\22\3\22\5\22\u0093\n\22\3\23\6\23\u0096\n\23\r\23\16\23\u0097\3\24"+
		"\3\24\7\24\u009c\n\24\f\24\16\24\u009f\13\24\3\24\3\24\3\25\6\25\u00a4"+
		"\n\25\r\25\16\25\u00a5\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2"+
		"\b\3\2\62;\3\2$$\3\2))\7\2&&\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\u00bc"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2"+
		"\2\t\62\3\2\2\2\13\67\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3"+
		"\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33K\3\2\2\2\35M\3\2\2\2\37"+
		"P\3\2\2\2!R\3\2\2\2#\u0092\3\2\2\2%\u0095\3\2\2\2\'\u0099\3\2\2\2)\u00a3"+
		"\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7\177\2\2.\6\3\2\2\2/\60\7k\2\2\60\61\7"+
		"h\2\2\61\b\3\2\2\2\62\63\7g\2\2\63\64\7n\2\2\64\65\7u\2\2\65\66\7g\2\2"+
		"\66\n\3\2\2\2\678\7y\2\289\7j\2\29:\7k\2\2:;\7n\2\2;<\7g\2\2<\f\3\2\2"+
		"\2=>\7=\2\2>\16\3\2\2\2?@\7]\2\2@\20\3\2\2\2AB\7.\2\2B\22\3\2\2\2CD\7"+
		"_\2\2D\24\3\2\2\2EF\7<\2\2F\26\3\2\2\2GH\7\60\2\2H\30\3\2\2\2IJ\7*\2\2"+
		"J\32\3\2\2\2KL\7+\2\2L\34\3\2\2\2MN\7<\2\2NO\7?\2\2O\36\3\2\2\2PQ\7?\2"+
		"\2Q \3\2\2\2RS\7^\2\2S\"\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2X`\3\2\2\2Y]\7\60\2\2Z\\\t\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`Y\3\2\2\2`a\3\2\2\2a\u0093\3\2\2"+
		"\2bd\7\60\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\u0093"+
		"\3\2\2\2hn\t\3\2\2im\n\3\2\2jk\7^\2\2km\t\3\2\2li\3\2\2\2lj\3\2\2\2mp"+
		"\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2q\u0093\t\3\2\2rx\t\4"+
		"\2\2sw\n\4\2\2tu\7^\2\2uw\t\4\2\2vs\3\2\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\u0093\t\4\2\2|}\7t\2\2}\u0083\t\3"+
		"\2\2~\u0082\n\3\2\2\177\u0080\7^\2\2\u0080\u0082\t\3\2\2\u0081~\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0093\t\3\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u008e\t\4\2\2\u0089\u008d\n\4\2\2\u008a\u008b\7^\2"+
		"\2\u008b\u008d\t\4\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\t\4\2\2\u0092U\3\2\2\2\u0092b\3\2\2\2\u0092"+
		"h\3\2\2\2\u0092r\3\2\2\2\u0092|\3\2\2\2\u0092\u0087\3\2\2\2\u0093$\3\2"+
		"\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098&\3\2\2\2\u0099\u009d\7%\2\2\u009a"+
		"\u009c\n\6\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\b\24\2\2\u00a1(\3\2\2\2\u00a2\u00a4\t\7\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\b\25\2\2\u00a8*\3\2\2\2\23\2W]`flnvx\u0081\u0083"+
		"\u008c\u008e\u0092\u0097\u009d\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}