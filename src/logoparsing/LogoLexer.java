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
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, INT=35, WS=36, ID=37, OP_BOOL=38, OP_INT=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'LOOP'", "'DONNE'", "'POUR'", "']'", "'-'", "'*'", "'['", "'('", "':'", 
		"'LC'", "'RC'", "'false'", "'RE'", "'SI'", "'HASARD'", "'REPETE'", "'VE'", 
		"'TG'", "'FIN'", "'FPOS'", "'true'", "'\"'", "'RET'", "'LOCALE'", "'ET'", 
		"')'", "'+'", "'BC'", "'TANTQUE'", "'FCC'", "'AV'", "'TD'", "'OU'", "'/'", 
		"INT", "WS", "ID", "'='", "OP_INT"
	};
	public static final String[] ruleNames = {
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "WS", "ID", "OP_BOOL", "OP_INT"
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
		case 35: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2\'\u00f0\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2"+
		"%\7%\2&\7&\1\0\1\0\1\0\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\2\1\2\1\2\1\2"+
		"\1\2\1\3\1\3\1\4\1\4\1\5\1\5\1\6\1\6\1\7\1\7\1\b\1\b\1\t\1\t\1\t\1\n\1"+
		"\n\1\n\1\13\1\13\1\13\1\13\1\13\1\13\1\f\1\f\1\f\1\r\1\r\1\r\1\16\1\16"+
		"\1\16\1\16\1\16\1\16\1\16\1\17\1\17\1\17\1\17\1\17\1\17\1\17\1\20\1\20"+
		"\1\20\1\21\1\21\1\21\1\22\1\22\1\22\1\22\1\23\1\23\1\23\1\23\1\23\1\24"+
		"\1\24\1\24\1\24\1\24\1\25\1\25\1\26\1\26\1\26\1\26\1\27\1\27\1\27\1\27"+
		"\1\27\1\27\1\27\1\30\1\30\1\30\1\31\1\31\1\32\1\32\1\33\1\33\1\33\1\34"+
		"\1\34\1\34\1\34\1\34\1\34\1\34\1\34\1\35\1\35\1\35\1\35\1\36\1\36\1\36"+
		"\1\37\1\37\1\37\1 \1 \1 \1!\1!\1\"\1\"\1\"\5\"\u00d1\b\"\n\"\f\"\u00d4"+
		"\t\"\3\"\u00d6\b\"\1#\4#\u00d9\b#\13#\f#\u00da\1#\1#\1$\1$\5$\u00e1\b"+
		"$\n$\f$\u00e4\t$\1%\1%\1&\1&\1&\1&\1&\1&\1&\3&\u00ef\b&\0\'\1\1\uffff"+
		"\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff"+
		"\21\t\uffff\23\n\uffff\25\13\uffff\27\f\uffff\31\r\uffff\33\16\uffff\35"+
		"\17\uffff\37\20\uffff!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff"+
		"+\26\uffff-\27\uffff/\30\uffff\61\31\uffff\63\32\uffff\65\33\uffff\67"+
		"\34\uffff9\35\uffff;\36\uffff=\37\uffff? \uffffA!\uffffC\"\uffffE#\uffff"+
		"G$\0I%\uffffK&\uffffM\'\uffff\1\0\5\1\619\1\609\3\t\n\r\r  \2AZaz\3\60"+
		"9AZaz\u00f7\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0"+
		"\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0\0\25"+
		"\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37\1\0"+
		"\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1\0\0"+
		"\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\0\65\1\0\0\0\0\67\1"+
		"\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1\0\0\0\0A\1\0\0\0\0C\1\0\0"+
		"\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0\0K\1\0\0\0\0M\1\0\0\0\1O\1\0\0\0\3"+
		"T\1\0\0\0\5Z\1\0\0\0\7_\1\0\0\0\ta\1\0\0\0\13c\1\0\0\0\re\1\0\0\0\17g"+
		"\1\0\0\0\21i\1\0\0\0\23k\1\0\0\0\25n\1\0\0\0\27q\1\0\0\0\31w\1\0\0\0\33"+
		"z\1\0\0\0\35}\1\0\0\0\37\u0084\1\0\0\0!\u008b\1\0\0\0#\u008e\1\0\0\0%"+
		"\u0091\1\0\0\0\'\u0095\1\0\0\0)\u009a\1\0\0\0+\u009f\1\0\0\0-\u00a1\1"+
		"\0\0\0/\u00a5\1\0\0\0\61\u00ac\1\0\0\0\63\u00af\1\0\0\0\65\u00b1\1\0\0"+
		"\0\67\u00b3\1\0\0\09\u00b6\1\0\0\0;\u00be\1\0\0\0=\u00c2\1\0\0\0?\u00c5"+
		"\1\0\0\0A\u00c8\1\0\0\0C\u00cb\1\0\0\0E\u00d5\1\0\0\0G\u00d8\1\0\0\0I"+
		"\u00de\1\0\0\0K\u00e5\1\0\0\0M\u00ee\1\0\0\0OP\5L\0\0PQ\5O\0\0QR\5O\0"+
		"\0RS\5P\0\0S\2\1\0\0\0TU\5D\0\0UV\5O\0\0VW\5N\0\0WX\5N\0\0XY\5E\0\0Y\4"+
		"\1\0\0\0Z[\5P\0\0[\\\5O\0\0\\]\5U\0\0]^\5R\0\0^\6\1\0\0\0_`\5]\0\0`\b"+
		"\1\0\0\0ab\5-\0\0b\n\1\0\0\0cd\5*\0\0d\f\1\0\0\0ef\5[\0\0f\16\1\0\0\0"+
		"gh\5(\0\0h\20\1\0\0\0ij\5:\0\0j\22\1\0\0\0kl\5L\0\0lm\5C\0\0m\24\1\0\0"+
		"\0no\5R\0\0op\5C\0\0p\26\1\0\0\0qr\5f\0\0rs\5a\0\0st\5l\0\0tu\5s\0\0u"+
		"v\5e\0\0v\30\1\0\0\0wx\5R\0\0xy\5E\0\0y\32\1\0\0\0z{\5S\0\0{|\5I\0\0|"+
		"\34\1\0\0\0}~\5H\0\0~\177\5A\0\0\177\u0080\5S\0\0\u0080\u0081\5A\0\0\u0081"+
		"\u0082\5R\0\0\u0082\u0083\5D\0\0\u0083\36\1\0\0\0\u0084\u0085\5R\0\0\u0085"+
		"\u0086\5E\0\0\u0086\u0087\5P\0\0\u0087\u0088\5E\0\0\u0088\u0089\5T\0\0"+
		"\u0089\u008a\5E\0\0\u008a \1\0\0\0\u008b\u008c\5V\0\0\u008c\u008d\5E\0"+
		"\0\u008d\"\1\0\0\0\u008e\u008f\5T\0\0\u008f\u0090\5G\0\0\u0090$\1\0\0"+
		"\0\u0091\u0092\5F\0\0\u0092\u0093\5I\0\0\u0093\u0094\5N\0\0\u0094&\1\0"+
		"\0\0\u0095\u0096\5F\0\0\u0096\u0097\5P\0\0\u0097\u0098\5O\0\0\u0098\u0099"+
		"\5S\0\0\u0099(\1\0\0\0\u009a\u009b\5t\0\0\u009b\u009c\5r\0\0\u009c\u009d"+
		"\5u\0\0\u009d\u009e\5e\0\0\u009e*\1\0\0\0\u009f\u00a0\5\"\0\0\u00a0,\1"+
		"\0\0\0\u00a1\u00a2\5R\0\0\u00a2\u00a3\5E\0\0\u00a3\u00a4\5T\0\0\u00a4"+
		".\1\0\0\0\u00a5\u00a6\5L\0\0\u00a6\u00a7\5O\0\0\u00a7\u00a8\5C\0\0\u00a8"+
		"\u00a9\5A\0\0\u00a9\u00aa\5L\0\0\u00aa\u00ab\5E\0\0\u00ab\60\1\0\0\0\u00ac"+
		"\u00ad\5E\0\0\u00ad\u00ae\5T\0\0\u00ae\62\1\0\0\0\u00af\u00b0\5)\0\0\u00b0"+
		"\64\1\0\0\0\u00b1\u00b2\5+\0\0\u00b2\66\1\0\0\0\u00b3\u00b4\5B\0\0\u00b4"+
		"\u00b5\5C\0\0\u00b58\1\0\0\0\u00b6\u00b7\5T\0\0\u00b7\u00b8\5A\0\0\u00b8"+
		"\u00b9\5N\0\0\u00b9\u00ba\5T\0\0\u00ba\u00bb\5Q\0\0\u00bb\u00bc\5U\0\0"+
		"\u00bc\u00bd\5E\0\0\u00bd:\1\0\0\0\u00be\u00bf\5F\0\0\u00bf\u00c0\5C\0"+
		"\0\u00c0\u00c1\5C\0\0\u00c1<\1\0\0\0\u00c2\u00c3\5A\0\0\u00c3\u00c4\5"+
		"V\0\0\u00c4>\1\0\0\0\u00c5\u00c6\5T\0\0\u00c6\u00c7\5D\0\0\u00c7@\1\0"+
		"\0\0\u00c8\u00c9\5O\0\0\u00c9\u00ca\5U\0\0\u00caB\1\0\0\0\u00cb\u00cc"+
		"\5/\0\0\u00ccD\1\0\0\0\u00cd\u00d6\5\60\0\0\u00ce\u00d2\7\0\0\0\u00cf"+
		"\u00d1\7\1\0\0\u00d0\u00cf\1\0\0\0\u00d1\u00d4\1\0\0\0\u00d2\u00d0\1\0"+
		"\0\0\u00d2\u00d3\1\0\0\0\u00d3\u00d6\1\0\0\0\u00d4\u00d2\1\0\0\0\u00d5"+
		"\u00cd\1\0\0\0\u00d5\u00ce\1\0\0\0\u00d6F\1\0\0\0\u00d7\u00d9\7\2\0\0"+
		"\u00d8\u00d7\1\0\0\0\u00d9\u00da\1\0\0\0\u00da\u00d8\1\0\0\0\u00da\u00db"+
		"\1\0\0\0\u00db\u00dc\1\0\0\0\u00dc\u00dd\6#\0\0\u00ddH\1\0\0\0\u00de\u00e2"+
		"\7\3\0\0\u00df\u00e1\7\4\0\0\u00e0\u00df\1\0\0\0\u00e1\u00e4\1\0\0\0\u00e2"+
		"\u00e0\1\0\0\0\u00e2\u00e3\1\0\0\0\u00e3J\1\0\0\0\u00e4\u00e2\1\0\0\0"+
		"\u00e5\u00e6\5=\0\0\u00e6L\1\0\0\0\u00e7\u00ef\5<\0\0\u00e8\u00e9\5<\0"+
		"\0\u00e9\u00ef\5=\0\0\u00ea\u00ef\5=\0\0\u00eb\u00ec\5>\0\0\u00ec\u00ef"+
		"\5=\0\0\u00ed\u00ef\5>\0\0\u00ee\u00e7\1\0\0\0\u00ee\u00e8\1\0\0\0\u00ee"+
		"\u00ea\1\0\0\0\u00ee\u00eb\1\0\0\0\u00ee\u00ed\1\0\0\0\u00efN\1\0\0\0"+
		"\6\0\u00d2\u00d5\u00da\u00e2\u00ee";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}