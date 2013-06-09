// $ANTLR ANTLRVersion> LogoLexer.java generatedTimestamp>

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, INT=29, WS=30, ID=31, PLUS=32, MINUS=33, 
		MUL=34, DIV=35, OP_BOOL=36, OP_INT=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'LOOP'", "'DONNE'", "']'", "'POUR'", "'['", "'('", "':'", "'LC'", "'false'", 
		"'RE'", "'SI'", "'HASARD'", "'REPETE'", "'VE'", "'TG'", "'FIN'", "'true'", 
		"'FPOS'", "'\"'", "'LOCALE'", "'ET'", "')'", "'BC'", "'TANTQUE'", "'FCC'", 
		"'AV'", "'TD'", "'OU'", "INT", "WS", "ID", "'+'", "'-'", "'*'", "'/'", 
		"'='", "OP_INT"
	};
	public static final String[] ruleNames = {
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "INT", "WS", "ID", "PLUS", "MINUS", "MUL", "DIV", 
		"OP_BOOL", "OP_INT"
	};


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 29: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2%\u00e5\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\1"+
		"\0\1\0\1\0\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\2\1\2\1\3\1\3\1\3\1\3\1\3"+
		"\1\4\1\4\1\5\1\5\1\6\1\6\1\7\1\7\1\7\1\b\1\b\1\b\1\b\1\b\1\b\1\t\1\t\1"+
		"\t\1\n\1\n\1\n\1\13\1\13\1\13\1\13\1\13\1\13\1\13\1\f\1\f\1\f\1\f\1\f"+
		"\1\f\1\f\1\r\1\r\1\r\1\16\1\16\1\16\1\17\1\17\1\17\1\17\1\20\1\20\1\20"+
		"\1\20\1\20\1\21\1\21\1\21\1\21\1\21\1\22\1\22\1\23\1\23\1\23\1\23\1\23"+
		"\1\23\1\23\1\24\1\24\1\24\1\25\1\25\1\26\1\26\1\26\1\27\1\27\1\27\1\27"+
		"\1\27\1\27\1\27\1\27\1\30\1\30\1\30\1\30\1\31\1\31\1\31\1\32\1\32\1\32"+
		"\1\33\1\33\1\33\1\34\1\34\1\34\5\34\u00be\b\34\n\34\f\34\u00c1\t\34\3"+
		"\34\u00c3\b\34\1\35\4\35\u00c6\b\35\13\35\f\35\u00c7\1\35\1\35\1\36\1"+
		"\36\5\36\u00ce\b\36\n\36\f\36\u00d1\t\36\1\37\1\37\1 \1 \1!\1!\1\"\1\""+
		"\1#\1#\1$\1$\1$\1$\1$\1$\1$\3$\u00e4\b$\0%\1\1\uffff\3\2\uffff\5\3\uffff"+
		"\7\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff"+
		"\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff"+
		"!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff"+
		"/\30\uffff\61\31\uffff\63\32\uffff\65\33\uffff\67\34\uffff9\35\uffff;"+
		"\36\0=\37\uffff? \uffffA!\uffffC\"\uffffE#\uffffG$\uffffI%\uffff\1\0\5"+
		"\1\619\1\609\3\t\n\r\r  \2AZaz\3\609AZaz\u00ec\0\1\1\0\0\0\0\3\1\0\0\0"+
		"\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0"+
		"\0\0\0\21\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0"+
		"\0\33\1\0\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0"+
		"\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0"+
		"\0\0\63\1\0\0\0\0\65\1\0\0\0\0\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0"+
		"\0\0\0?\1\0\0\0\0A\1\0\0\0\0C\1\0\0\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0"+
		"\1K\1\0\0\0\3P\1\0\0\0\5V\1\0\0\0\7X\1\0\0\0\t]\1\0\0\0\13_\1\0\0\0\r"+
		"a\1\0\0\0\17c\1\0\0\0\21f\1\0\0\0\23l\1\0\0\0\25o\1\0\0\0\27r\1\0\0\0"+
		"\31y\1\0\0\0\33\u0080\1\0\0\0\35\u0083\1\0\0\0\37\u0086\1\0\0\0!\u008a"+
		"\1\0\0\0#\u008f\1\0\0\0%\u0094\1\0\0\0\'\u0096\1\0\0\0)\u009d\1\0\0\0"+
		"+\u00a0\1\0\0\0-\u00a2\1\0\0\0/\u00a5\1\0\0\0\61\u00ad\1\0\0\0\63\u00b1"+
		"\1\0\0\0\65\u00b4\1\0\0\0\67\u00b7\1\0\0\09\u00c2\1\0\0\0;\u00c5\1\0\0"+
		"\0=\u00cb\1\0\0\0?\u00d2\1\0\0\0A\u00d4\1\0\0\0C\u00d6\1\0\0\0E\u00d8"+
		"\1\0\0\0G\u00da\1\0\0\0I\u00e3\1\0\0\0KL\5L\0\0LM\5O\0\0MN\5O\0\0NO\5"+
		"P\0\0O\2\1\0\0\0PQ\5D\0\0QR\5O\0\0RS\5N\0\0ST\5N\0\0TU\5E\0\0U\4\1\0\0"+
		"\0VW\5]\0\0W\6\1\0\0\0XY\5P\0\0YZ\5O\0\0Z[\5U\0\0[\\\5R\0\0\\\b\1\0\0"+
		"\0]^\5[\0\0^\n\1\0\0\0_`\5(\0\0`\f\1\0\0\0ab\5:\0\0b\16\1\0\0\0cd\5L\0"+
		"\0de\5C\0\0e\20\1\0\0\0fg\5f\0\0gh\5a\0\0hi\5l\0\0ij\5s\0\0jk\5e\0\0k"+
		"\22\1\0\0\0lm\5R\0\0mn\5E\0\0n\24\1\0\0\0op\5S\0\0pq\5I\0\0q\26\1\0\0"+
		"\0rs\5H\0\0st\5A\0\0tu\5S\0\0uv\5A\0\0vw\5R\0\0wx\5D\0\0x\30\1\0\0\0y"+
		"z\5R\0\0z{\5E\0\0{|\5P\0\0|}\5E\0\0}~\5T\0\0~\177\5E\0\0\177\32\1\0\0"+
		"\0\u0080\u0081\5V\0\0\u0081\u0082\5E\0\0\u0082\34\1\0\0\0\u0083\u0084"+
		"\5T\0\0\u0084\u0085\5G\0\0\u0085\36\1\0\0\0\u0086\u0087\5F\0\0\u0087\u0088"+
		"\5I\0\0\u0088\u0089\5N\0\0\u0089 \1\0\0\0\u008a\u008b\5t\0\0\u008b\u008c"+
		"\5r\0\0\u008c\u008d\5u\0\0\u008d\u008e\5e\0\0\u008e\"\1\0\0\0\u008f\u0090"+
		"\5F\0\0\u0090\u0091\5P\0\0\u0091\u0092\5O\0\0\u0092\u0093\5S\0\0\u0093"+
		"$\1\0\0\0\u0094\u0095\5\"\0\0\u0095&\1\0\0\0\u0096\u0097\5L\0\0\u0097"+
		"\u0098\5O\0\0\u0098\u0099\5C\0\0\u0099\u009a\5A\0\0\u009a\u009b\5L\0\0"+
		"\u009b\u009c\5E\0\0\u009c(\1\0\0\0\u009d\u009e\5E\0\0\u009e\u009f\5T\0"+
		"\0\u009f*\1\0\0\0\u00a0\u00a1\5)\0\0\u00a1,\1\0\0\0\u00a2\u00a3\5B\0\0"+
		"\u00a3\u00a4\5C\0\0\u00a4.\1\0\0\0\u00a5\u00a6\5T\0\0\u00a6\u00a7\5A\0"+
		"\0\u00a7\u00a8\5N\0\0\u00a8\u00a9\5T\0\0\u00a9\u00aa\5Q\0\0\u00aa\u00ab"+
		"\5U\0\0\u00ab\u00ac\5E\0\0\u00ac\60\1\0\0\0\u00ad\u00ae\5F\0\0\u00ae\u00af"+
		"\5C\0\0\u00af\u00b0\5C\0\0\u00b0\62\1\0\0\0\u00b1\u00b2\5A\0\0\u00b2\u00b3"+
		"\5V\0\0\u00b3\64\1\0\0\0\u00b4\u00b5\5T\0\0\u00b5\u00b6\5D\0\0\u00b6\66"+
		"\1\0\0\0\u00b7\u00b8\5O\0\0\u00b8\u00b9\5U\0\0\u00b98\1\0\0\0\u00ba\u00c3"+
		"\5\60\0\0\u00bb\u00bf\7\0\0\0\u00bc\u00be\7\1\0\0\u00bd\u00bc\1\0\0\0"+
		"\u00be\u00c1\1\0\0\0\u00bf\u00bd\1\0\0\0\u00bf\u00c0\1\0\0\0\u00c0\u00c3"+
		"\1\0\0\0\u00c1\u00bf\1\0\0\0\u00c2\u00ba\1\0\0\0\u00c2\u00bb\1\0\0\0\u00c3"+
		":\1\0\0\0\u00c4\u00c6\7\2\0\0\u00c5\u00c4\1\0\0\0\u00c6\u00c7\1\0\0\0"+
		"\u00c7\u00c5\1\0\0\0\u00c7\u00c8\1\0\0\0\u00c8\u00c9\1\0\0\0\u00c9\u00ca"+
		"\6\35\0\0\u00ca<\1\0\0\0\u00cb\u00cf\7\3\0\0\u00cc\u00ce\7\4\0\0\u00cd"+
		"\u00cc\1\0\0\0\u00ce\u00d1\1\0\0\0\u00cf\u00cd\1\0\0\0\u00cf\u00d0\1\0"+
		"\0\0\u00d0>\1\0\0\0\u00d1\u00cf\1\0\0\0\u00d2\u00d3\5+\0\0\u00d3@\1\0"+
		"\0\0\u00d4\u00d5\5-\0\0\u00d5B\1\0\0\0\u00d6\u00d7\5*\0\0\u00d7D\1\0\0"+
		"\0\u00d8\u00d9\5/\0\0\u00d9F\1\0\0\0\u00da\u00db\5=\0\0\u00dbH\1\0\0\0"+
		"\u00dc\u00e4\5<\0\0\u00dd\u00de\5<\0\0\u00de\u00e4\5=\0\0\u00df\u00e4"+
		"\5=\0\0\u00e0\u00e1\5>\0\0\u00e1\u00e4\5=\0\0\u00e2\u00e4\5>\0\0\u00e3"+
		"\u00dc\1\0\0\0\u00e3\u00dd\1\0\0\0\u00e3\u00df\1\0\0\0\u00e3\u00e0\1\0"+
		"\0\0\u00e3\u00e2\1\0\0\0\u00e4J\1\0\0\0\6\0\u00bf\u00c2\u00c7\u00cf\u00e3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}