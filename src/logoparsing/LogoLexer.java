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
		T__0=10, INT=11, ID=12, LC=13, BC=14, VE=15, AV=16, TD=17, TG=18, RE=19, 
		FPOS=20, FCC=21, PLUS=22, MINUS=23, MUL=24, DIV=25, HASARD=26, ET=27, 
		OU=28, OP_BOOL=29, OP_INT=30, OP_AFFECT=31, LOCALE=32, COND_IF=33, BOUCLE_REPETE=34, 
		BOUCLE_TANTQUE=35, POUR=36, FIN=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'LOOP'", "'DONNE'", "']'", "')'", "'['", "':'", "'('", "'false'", "'true'", 
		"'\"'", "INT", "ID", "'LC'", "'BC'", "'VE'", "'AV'", "'TD'", "'TG'", "'RE'", 
		"'FPOS'", "'FCC'", "'+'", "'-'", "'*'", "'/'", "'HASARD'", "'&'", "'|'", 
		"'='", "OP_INT", "':='", "'LOCALE'", "'SI'", "'REPETE'", "'TANQUE'", "'POUR'", 
		"'FIN'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "ID", "LC", "BC", "VE", "AV", "TD", "TG", "RE", "FPOS", 
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

	public static final String _serializedATN =
		"\1\2%\u00de\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\1"+
		"\0\1\0\1\0\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\2\1\2\1\3\1\3\1\4\1\4\1\5"+
		"\1\5\1\6\1\6\1\7\1\7\1\7\1\7\1\7\1\7\1\b\1\b\1\b\1\b\1\b\1\t\1\t\1\n\1"+
		"\n\1\n\5\nq\b\n\n\n\f\nt\t\n\3\nv\b\n\1\13\1\13\5\13z\b\13\n\13\f\13}"+
		"\t\13\1\f\1\f\1\f\1\r\1\r\1\r\1\16\1\16\1\16\1\17\1\17\1\17\1\20\1\20"+
		"\1\20\1\21\1\21\1\21\1\22\1\22\1\22\1\23\1\23\1\23\1\23\1\23\1\24\1\24"+
		"\1\24\1\24\1\25\1\25\1\26\1\26\1\27\1\27\1\30\1\30\1\31\1\31\1\31\1\31"+
		"\1\31\1\31\1\31\1\32\1\32\1\33\1\33\1\34\1\34\1\35\1\35\1\35\1\35\1\35"+
		"\1\35\1\35\3\35\u00b9\b\35\1\36\1\36\1\36\1\37\1\37\1\37\1\37\1\37\1\37"+
		"\1\37\1 \1 \1 \1!\1!\1!\1!\1!\1!\1!\1\"\1\"\1\"\1\"\1\"\1\"\1\"\1#\1#"+
		"\1#\1#\1#\1$\1$\1$\1$\0%\1\1\uffff\3\2\uffff\5\3\uffff\7\4\uffff\t\5\uffff"+
		"\13\6\uffff\r\7\uffff\17\b\uffff\21\t\uffff\23\n\uffff\25\13\uffff\27"+
		"\f\uffff\31\r\uffff\33\16\uffff\35\17\uffff\37\20\uffff!\21\uffff#\22"+
		"\uffff%\23\uffff\'\24\uffff)\25\uffff+\26\uffff-\27\uffff/\30\uffff\61"+
		"\31\uffff\63\32\uffff\65\33\uffff\67\34\uffff9\35\uffff;\36\uffff=\37"+
		"\uffff? \uffffA!\uffffC\"\uffffE#\uffffG$\uffffI%\uffff\1\0\4\1\619\1"+
		"\609\2AZaz\3\609AZaz\u00e4\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0"+
		"\0\0\0\t\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0"+
		"\23\1\0\0\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1"+
		"\0\0\0\0\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1"+
		"\0\0\0\0+\1\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\0\65"+
		"\1\0\0\0\0\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1\0\0\0\0A\1"+
		"\0\0\0\0C\1\0\0\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0\1K\1\0\0\0\3P\1\0\0"+
		"\0\5V\1\0\0\0\7X\1\0\0\0\tZ\1\0\0\0\13\\\1\0\0\0\r^\1\0\0\0\17`\1\0\0"+
		"\0\21f\1\0\0\0\23k\1\0\0\0\25u\1\0\0\0\27w\1\0\0\0\31~\1\0\0\0\33\u0081"+
		"\1\0\0\0\35\u0084\1\0\0\0\37\u0087\1\0\0\0!\u008a\1\0\0\0#\u008d\1\0\0"+
		"\0%\u0090\1\0\0\0\'\u0093\1\0\0\0)\u0098\1\0\0\0+\u009c\1\0\0\0-\u009e"+
		"\1\0\0\0/\u00a0\1\0\0\0\61\u00a2\1\0\0\0\63\u00a4\1\0\0\0\65\u00ab\1\0"+
		"\0\0\67\u00ad\1\0\0\09\u00af\1\0\0\0;\u00b8\1\0\0\0=\u00ba\1\0\0\0?\u00bd"+
		"\1\0\0\0A\u00c4\1\0\0\0C\u00c7\1\0\0\0E\u00ce\1\0\0\0G\u00d5\1\0\0\0I"+
		"\u00da\1\0\0\0KL\5L\0\0LM\5O\0\0MN\5O\0\0NO\5P\0\0O\2\1\0\0\0PQ\5D\0\0"+
		"QR\5O\0\0RS\5N\0\0ST\5N\0\0TU\5E\0\0U\4\1\0\0\0VW\5]\0\0W\6\1\0\0\0XY"+
		"\5)\0\0Y\b\1\0\0\0Z[\5[\0\0[\n\1\0\0\0\\]\5:\0\0]\f\1\0\0\0^_\5(\0\0_"+
		"\16\1\0\0\0`a\5f\0\0ab\5a\0\0bc\5l\0\0cd\5s\0\0de\5e\0\0e\20\1\0\0\0f"+
		"g\5t\0\0gh\5r\0\0hi\5u\0\0ij\5e\0\0j\22\1\0\0\0kl\5\"\0\0l\24\1\0\0\0"+
		"mv\5\60\0\0nr\7\0\0\0oq\7\1\0\0po\1\0\0\0qt\1\0\0\0rp\1\0\0\0rs\1\0\0"+
		"\0sv\1\0\0\0tr\1\0\0\0um\1\0\0\0un\1\0\0\0v\26\1\0\0\0w{\7\2\0\0xz\7\3"+
		"\0\0yx\1\0\0\0z}\1\0\0\0{y\1\0\0\0{|\1\0\0\0|\30\1\0\0\0}{\1\0\0\0~\177"+
		"\5L\0\0\177\u0080\5C\0\0\u0080\32\1\0\0\0\u0081\u0082\5B\0\0\u0082\u0083"+
		"\5C\0\0\u0083\34\1\0\0\0\u0084\u0085\5V\0\0\u0085\u0086\5E\0\0\u0086\36"+
		"\1\0\0\0\u0087\u0088\5A\0\0\u0088\u0089\5V\0\0\u0089 \1\0\0\0\u008a\u008b"+
		"\5T\0\0\u008b\u008c\5D\0\0\u008c\"\1\0\0\0\u008d\u008e\5T\0\0\u008e\u008f"+
		"\5G\0\0\u008f$\1\0\0\0\u0090\u0091\5R\0\0\u0091\u0092\5E\0\0\u0092&\1"+
		"\0\0\0\u0093\u0094\5F\0\0\u0094\u0095\5P\0\0\u0095\u0096\5O\0\0\u0096"+
		"\u0097\5S\0\0\u0097(\1\0\0\0\u0098\u0099\5F\0\0\u0099\u009a\5C\0\0\u009a"+
		"\u009b\5C\0\0\u009b*\1\0\0\0\u009c\u009d\5+\0\0\u009d,\1\0\0\0\u009e\u009f"+
		"\5-\0\0\u009f.\1\0\0\0\u00a0\u00a1\5*\0\0\u00a1\60\1\0\0\0\u00a2\u00a3"+
		"\5/\0\0\u00a3\62\1\0\0\0\u00a4\u00a5\5H\0\0\u00a5\u00a6\5A\0\0\u00a6\u00a7"+
		"\5S\0\0\u00a7\u00a8\5A\0\0\u00a8\u00a9\5R\0\0\u00a9\u00aa\5D\0\0\u00aa"+
		"\64\1\0\0\0\u00ab\u00ac\5&\0\0\u00ac\66\1\0\0\0\u00ad\u00ae\5|\0\0\u00ae"+
		"8\1\0\0\0\u00af\u00b0\5=\0\0\u00b0:\1\0\0\0\u00b1\u00b9\5<\0\0\u00b2\u00b3"+
		"\5<\0\0\u00b3\u00b9\5=\0\0\u00b4\u00b9\5=\0\0\u00b5\u00b6\5>\0\0\u00b6"+
		"\u00b9\5=\0\0\u00b7\u00b9\5>\0\0\u00b8\u00b1\1\0\0\0\u00b8\u00b2\1\0\0"+
		"\0\u00b8\u00b4\1\0\0\0\u00b8\u00b5\1\0\0\0\u00b8\u00b7\1\0\0\0\u00b9<"+
		"\1\0\0\0\u00ba\u00bb\5:\0\0\u00bb\u00bc\5=\0\0\u00bc>\1\0\0\0\u00bd\u00be"+
		"\5L\0\0\u00be\u00bf\5O\0\0\u00bf\u00c0\5C\0\0\u00c0\u00c1\5A\0\0\u00c1"+
		"\u00c2\5L\0\0\u00c2\u00c3\5E\0\0\u00c3@\1\0\0\0\u00c4\u00c5\5S\0\0\u00c5"+
		"\u00c6\5I\0\0\u00c6B\1\0\0\0\u00c7\u00c8\5R\0\0\u00c8\u00c9\5E\0\0\u00c9"+
		"\u00ca\5P\0\0\u00ca\u00cb\5E\0\0\u00cb\u00cc\5T\0\0\u00cc\u00cd\5E\0\0"+
		"\u00cdD\1\0\0\0\u00ce\u00cf\5T\0\0\u00cf\u00d0\5A\0\0\u00d0\u00d1\5N\0"+
		"\0\u00d1\u00d2\5Q\0\0\u00d2\u00d3\5U\0\0\u00d3\u00d4\5E\0\0\u00d4F\1\0"+
		"\0\0\u00d5\u00d6\5P\0\0\u00d6\u00d7\5O\0\0\u00d7\u00d8\5U\0\0\u00d8\u00d9"+
		"\5R\0\0\u00d9H\1\0\0\0\u00da\u00db\5F\0\0\u00db\u00dc\5I\0\0\u00dc\u00dd"+
		"\5N\0\0\u00ddJ\1\0\0\0\5\0ru{\u00b8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}