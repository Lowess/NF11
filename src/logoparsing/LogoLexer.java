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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, WS=12, ID=13, LC=14, BC=15, VE=16, AV=17, TD=18, TG=19, 
		RE=20, FPOS=21, FCC=22, PLUS=23, MINUS=24, MUL=25, DIV=26, HASARD=27, 
		ET=28, OU=29, OP_BOOL=30, OP_INT=31, OP_AFFECT=32, LOCALE=33, COND_IF=34, 
		BOUCLE_REPETE=35, BOUCLE_TANTQUE=36, POUR=37, FIN=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'LOOP'", "'DONNE'", "']'", "')'", "'['", "':'", "'('", "'false'", "'true'", 
		"'\"'", "INT", "WS", "ID", "'LC'", "'BC'", "'VE'", "'AV'", "'TD'", "'TG'", 
		"'RE'", "'FPOS'", "'FCC'", "'+'", "'-'", "'*'", "'/'", "'HASARD'", "'&'", 
		"'|'", "'='", "OP_INT", "':='", "'LOCALE'", "'SI'", "'REPETE'", "'TANQUE'", 
		"'POUR'", "'FIN'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "WS", "ID", "LC", "BC", "VE", "AV", "TD", "TG", "RE", "FPOS", 
		"FCC", "PLUS", "MINUS", "MUL", "DIV", "HASARD", "ET", "OU", "OP_BOOL", 
		"OP_INT", "OP_AFFECT", "LOCALE", "COND_IF", "BOUCLE_REPETE", "BOUCLE_TANTQUE", 
		"POUR", "FIN"
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
		case 11: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\1\2&\u00e7\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2"+
		"%\7%\1\0\1\0\1\0\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\2\1\2\1\3\1\3\1\4\1"+
		"\4\1\5\1\5\1\6\1\6\1\7\1\7\1\7\1\7\1\7\1\7\1\b\1\b\1\b\1\b\1\b\1\t\1\t"+
		"\1\n\1\n\1\n\5\ns\b\n\n\n\f\nv\t\n\3\nx\b\n\1\13\4\13{\b\13\13\13\f\13"+
		"|\1\13\1\13\1\f\1\f\5\f\u0083\b\f\n\f\f\f\u0086\t\f\1\r\1\r\1\r\1\16\1"+
		"\16\1\16\1\17\1\17\1\17\1\20\1\20\1\20\1\21\1\21\1\21\1\22\1\22\1\22\1"+
		"\23\1\23\1\23\1\24\1\24\1\24\1\24\1\24\1\25\1\25\1\25\1\25\1\26\1\26\1"+
		"\27\1\27\1\30\1\30\1\31\1\31\1\32\1\32\1\32\1\32\1\32\1\32\1\32\1\33\1"+
		"\33\1\34\1\34\1\35\1\35\1\36\1\36\1\36\1\36\1\36\1\36\1\36\3\36\u00c2"+
		"\b\36\1\37\1\37\1\37\1 \1 \1 \1 \1 \1 \1 \1!\1!\1!\1\"\1\"\1\"\1\"\1\""+
		"\1\"\1\"\1#\1#\1#\1#\1#\1#\1#\1$\1$\1$\1$\1$\1%\1%\1%\1%\0&\1\1\uffff"+
		"\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff\13\6\uffff\r\7\uffff\17\b\uffff"+
		"\21\t\uffff\23\n\uffff\25\13\uffff\27\f\0\31\r\uffff\33\16\uffff\35\17"+
		"\uffff\37\20\uffff!\21\uffff#\22\uffff%\23\uffff\'\24\uffff)\25\uffff"+
		"+\26\uffff-\27\uffff/\30\uffff\61\31\uffff\63\32\uffff\65\33\uffff\67"+
		"\34\uffff9\35\uffff;\36\uffff=\37\uffff? \uffffA!\uffffC\"\uffffE#\uffff"+
		"G$\uffffI%\uffffK&\uffff\1\0\5\1\619\1\609\3\t\n\r\r  \1az\2\609az\u00ee"+
		"\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1\0"+
		"\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0\0\0\25\1\0\0\0\0"+
		"\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0\37\1\0\0\0\0!\1\0"+
		"\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0+\1\0\0\0\0-\1\0\0"+
		"\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\0\65\1\0\0\0\0\67\1\0\0\0\09\1"+
		"\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1\0\0\0\0A\1\0\0\0\0C\1\0\0\0\0E\1\0\0"+
		"\0\0G\1\0\0\0\0I\1\0\0\0\0K\1\0\0\0\1M\1\0\0\0\3R\1\0\0\0\5X\1\0\0\0\7"+
		"Z\1\0\0\0\t\\\1\0\0\0\13^\1\0\0\0\r`\1\0\0\0\17b\1\0\0\0\21h\1\0\0\0\23"+
		"m\1\0\0\0\25w\1\0\0\0\27z\1\0\0\0\31\u0080\1\0\0\0\33\u0087\1\0\0\0\35"+
		"\u008a\1\0\0\0\37\u008d\1\0\0\0!\u0090\1\0\0\0#\u0093\1\0\0\0%\u0096\1"+
		"\0\0\0\'\u0099\1\0\0\0)\u009c\1\0\0\0+\u00a1\1\0\0\0-\u00a5\1\0\0\0/\u00a7"+
		"\1\0\0\0\61\u00a9\1\0\0\0\63\u00ab\1\0\0\0\65\u00ad\1\0\0\0\67\u00b4\1"+
		"\0\0\09\u00b6\1\0\0\0;\u00b8\1\0\0\0=\u00c1\1\0\0\0?\u00c3\1\0\0\0A\u00c6"+
		"\1\0\0\0C\u00cd\1\0\0\0E\u00d0\1\0\0\0G\u00d7\1\0\0\0I\u00de\1\0\0\0K"+
		"\u00e3\1\0\0\0MN\5L\0\0NO\5O\0\0OP\5O\0\0PQ\5P\0\0Q\2\1\0\0\0RS\5D\0\0"+
		"ST\5O\0\0TU\5N\0\0UV\5N\0\0VW\5E\0\0W\4\1\0\0\0XY\5]\0\0Y\6\1\0\0\0Z["+
		"\5)\0\0[\b\1\0\0\0\\]\5[\0\0]\n\1\0\0\0^_\5:\0\0_\f\1\0\0\0`a\5(\0\0a"+
		"\16\1\0\0\0bc\5f\0\0cd\5a\0\0de\5l\0\0ef\5s\0\0fg\5e\0\0g\20\1\0\0\0h"+
		"i\5t\0\0ij\5r\0\0jk\5u\0\0kl\5e\0\0l\22\1\0\0\0mn\5\"\0\0n\24\1\0\0\0"+
		"ox\5\60\0\0pt\7\0\0\0qs\7\1\0\0rq\1\0\0\0sv\1\0\0\0tr\1\0\0\0tu\1\0\0"+
		"\0ux\1\0\0\0vt\1\0\0\0wo\1\0\0\0wp\1\0\0\0x\26\1\0\0\0y{\7\2\0\0zy\1\0"+
		"\0\0{|\1\0\0\0|z\1\0\0\0|}\1\0\0\0}~\1\0\0\0~\177\6\13\0\0\177\30\1\0"+
		"\0\0\u0080\u0084\7\3\0\0\u0081\u0083\7\4\0\0\u0082\u0081\1\0\0\0\u0083"+
		"\u0086\1\0\0\0\u0084\u0082\1\0\0\0\u0084\u0085\1\0\0\0\u0085\32\1\0\0"+
		"\0\u0086\u0084\1\0\0\0\u0087\u0088\5L\0\0\u0088\u0089\5C\0\0\u0089\34"+
		"\1\0\0\0\u008a\u008b\5B\0\0\u008b\u008c\5C\0\0\u008c\36\1\0\0\0\u008d"+
		"\u008e\5V\0\0\u008e\u008f\5E\0\0\u008f \1\0\0\0\u0090\u0091\5A\0\0\u0091"+
		"\u0092\5V\0\0\u0092\"\1\0\0\0\u0093\u0094\5T\0\0\u0094\u0095\5D\0\0\u0095"+
		"$\1\0\0\0\u0096\u0097\5T\0\0\u0097\u0098\5G\0\0\u0098&\1\0\0\0\u0099\u009a"+
		"\5R\0\0\u009a\u009b\5E\0\0\u009b(\1\0\0\0\u009c\u009d\5F\0\0\u009d\u009e"+
		"\5P\0\0\u009e\u009f\5O\0\0\u009f\u00a0\5S\0\0\u00a0*\1\0\0\0\u00a1\u00a2"+
		"\5F\0\0\u00a2\u00a3\5C\0\0\u00a3\u00a4\5C\0\0\u00a4,\1\0\0\0\u00a5\u00a6"+
		"\5+\0\0\u00a6.\1\0\0\0\u00a7\u00a8\5-\0\0\u00a8\60\1\0\0\0\u00a9\u00aa"+
		"\5*\0\0\u00aa\62\1\0\0\0\u00ab\u00ac\5/\0\0\u00ac\64\1\0\0\0\u00ad\u00ae"+
		"\5H\0\0\u00ae\u00af\5A\0\0\u00af\u00b0\5S\0\0\u00b0\u00b1\5A\0\0\u00b1"+
		"\u00b2\5R\0\0\u00b2\u00b3\5D\0\0\u00b3\66\1\0\0\0\u00b4\u00b5\5&\0\0\u00b5"+
		"8\1\0\0\0\u00b6\u00b7\5|\0\0\u00b7:\1\0\0\0\u00b8\u00b9\5=\0\0\u00b9<"+
		"\1\0\0\0\u00ba\u00c2\5<\0\0\u00bb\u00bc\5<\0\0\u00bc\u00c2\5=\0\0\u00bd"+
		"\u00c2\5=\0\0\u00be\u00bf\5>\0\0\u00bf\u00c2\5=\0\0\u00c0\u00c2\5>\0\0"+
		"\u00c1\u00ba\1\0\0\0\u00c1\u00bb\1\0\0\0\u00c1\u00bd\1\0\0\0\u00c1\u00be"+
		"\1\0\0\0\u00c1\u00c0\1\0\0\0\u00c2>\1\0\0\0\u00c3\u00c4\5:\0\0\u00c4\u00c5"+
		"\5=\0\0\u00c5@\1\0\0\0\u00c6\u00c7\5L\0\0\u00c7\u00c8\5O\0\0\u00c8\u00c9"+
		"\5C\0\0\u00c9\u00ca\5A\0\0\u00ca\u00cb\5L\0\0\u00cb\u00cc\5E\0\0\u00cc"+
		"B\1\0\0\0\u00cd\u00ce\5S\0\0\u00ce\u00cf\5I\0\0\u00cfD\1\0\0\0\u00d0\u00d1"+
		"\5R\0\0\u00d1\u00d2\5E\0\0\u00d2\u00d3\5P\0\0\u00d3\u00d4\5E\0\0\u00d4"+
		"\u00d5\5T\0\0\u00d5\u00d6\5E\0\0\u00d6F\1\0\0\0\u00d7\u00d8\5T\0\0\u00d8"+
		"\u00d9\5A\0\0\u00d9\u00da\5N\0\0\u00da\u00db\5Q\0\0\u00db\u00dc\5U\0\0"+
		"\u00dc\u00dd\5E\0\0\u00ddH\1\0\0\0\u00de\u00df\5P\0\0\u00df\u00e0\5O\0"+
		"\0\u00e0\u00e1\5U\0\0\u00e1\u00e2\5R\0\0\u00e2J\1\0\0\0\u00e3\u00e4\5"+
		"F\0\0\u00e4\u00e5\5I\0\0\u00e5\u00e6\5N\0\0\u00e6L\1\0\0\0\6\0tw|\u0084"+
		"\u00c1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}