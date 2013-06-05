// $ANTLR ANTLRVersion> LogoParser.java generatedTimestamp>

  package logoparsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, INT=11, WS=12, ID=13, LC=14, BC=15, VE=16, AV=17, TD=18, TG=19, 
		RE=20, FPOS=21, FCC=22, PLUS=23, MINUS=24, MUL=25, DIV=26, HASARD=27, 
		ET=28, OU=29, OP_BOOL=30, OP_INT=31, OP_AFFECT=32, LOCALE=33, COND_IF=34, 
		BOUCLE_REPETE=35, BOUCLE_TANTQUE=36, POUR=37, FIN=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'LOOP'", "'DONNE'", "']'", "')'", "'['", "':'", "'('", "'false'", 
		"'true'", "'\"'", "INT", "WS", "ID", "'LC'", "'BC'", "'VE'", "'AV'", "'TD'", 
		"'TG'", "'RE'", "'FPOS'", "'FCC'", "'+'", "'-'", "'*'", "'/'", "'HASARD'", 
		"'&'", "'|'", "'='", "OP_INT", "':='", "'LOCALE'", "'SI'", "'REPETE'", 
		"'TANQUE'", "'POUR'", "'FIN'"
	};
	public static final int
		RULE_programme = 0, RULE_liste_instructions = 1, RULE_instruction = 2, 
		RULE_liste_params = 3, RULE_expr_arithmetique = 4, RULE_expr_booleene = 5, 
		RULE_bloc = 6, RULE_expr_conditionnelle = 7, RULE_expr_affectation = 8;
	public static final String[] ruleNames = {
		"programme", "liste_instructions", "instruction", "liste_params", "expr_arithmetique", 
		"expr_booleene", "bloc", "expr_conditionnelle", "expr_affectation"
	};

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammeContext extends ParserRuleContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProgramme(this);
			else return null;
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); liste_instructions();
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

	public static class Liste_instructionsContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public Liste_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterListe_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitListe_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitListe_instructions(this);
			else return null;
		}
	}

	public final Liste_instructionsContext liste_instructions() throws RecognitionException {
		Liste_instructionsContext _localctx = new Liste_instructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_liste_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20); instruction();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << LC) | (1L << BC) | (1L << VE) | (1L << AV) | (1L << TD) | (1L << TG) | (1L << RE) | (1L << FPOS) | (1L << FCC) | (1L << LOCALE) | (1L << COND_IF) | (1L << BOUCLE_REPETE) | (1L << BOUCLE_TANTQUE) | (1L << POUR))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VeContext extends InstructionContext {
		public TerminalNode VE() { return getToken(LogoParser.VE, 0); }
		public VeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVe(this);
			else return null;
		}
	}
	public static class TgContext extends InstructionContext {
		public TerminalNode TG() { return getToken(LogoParser.TG, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public TgContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTg(this);
			else return null;
		}
	}
	public static class FposContext extends InstructionContext {
		public Expr_arithmetiqueContext expr_arithmetique(int i) {
			return getRuleContext(Expr_arithmetiqueContext.class,i);
		}
		public TerminalNode FPOS() { return getToken(LogoParser.FPOS, 0); }
		public List<Expr_arithmetiqueContext> expr_arithmetique() {
			return getRuleContexts(Expr_arithmetiqueContext.class);
		}
		public FposContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFpos(this);
			else return null;
		}
	}
	public static class FonctionContext extends InstructionContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public Liste_paramsContext liste_params() {
			return getRuleContext(Liste_paramsContext.class,0);
		}
		public TerminalNode POUR() { return getToken(LogoParser.POUR, 0); }
		public TerminalNode FIN() { return getToken(LogoParser.FIN, 0); }
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public FonctionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFonction(this);
			else return null;
		}
	}
	public static class LcContext extends InstructionContext {
		public TerminalNode LC() { return getToken(LogoParser.LC, 0); }
		public LcContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLc(this);
			else return null;
		}
	}
	public static class TdContext extends InstructionContext {
		public TerminalNode TD() { return getToken(LogoParser.TD, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public TdContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTd(this);
			else return null;
		}
	}
	public static class Expr_condContext extends InstructionContext {
		public Expr_conditionnelleContext expr_conditionnelle() {
			return getRuleContext(Expr_conditionnelleContext.class,0);
		}
		public Expr_condContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpr_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpr_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpr_cond(this);
			else return null;
		}
	}
	public static class ReContext extends InstructionContext {
		public TerminalNode RE() { return getToken(LogoParser.RE, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public ReContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRe(this);
			else return null;
		}
	}
	public static class BcContext extends InstructionContext {
		public TerminalNode BC() { return getToken(LogoParser.BC, 0); }
		public BcContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBc(this);
			else return null;
		}
	}
	public static class FccContext extends InstructionContext {
		public TerminalNode FCC() { return getToken(LogoParser.FCC, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public FccContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterFcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitFcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitFcc(this);
			else return null;
		}
	}
	public static class AvContext extends InstructionContext {
		public TerminalNode AV() { return getToken(LogoParser.AV, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public AvContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAv(this);
			else return null;
		}
	}
	public static class Expr_affectContext extends InstructionContext {
		public Expr_affectationContext expr_affectation() {
			return getRuleContext(Expr_affectationContext.class,0);
		}
		public Expr_affectContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterExpr_affect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitExpr_affect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitExpr_affect(this);
			else return null;
		}
	}
	public static class Affect_localeContext extends InstructionContext {
		public TerminalNode LOCALE() { return getToken(LogoParser.LOCALE, 0); }
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public Affect_localeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAffect_locale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAffect_locale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAffect_locale(this);
			else return null;
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case LC:
				_localctx = new LcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25); match(LC);
				}
				break;
			case BC:
				_localctx = new BcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26); match(BC);
				}
				break;
			case VE:
				_localctx = new VeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27); match(VE);
				}
				break;
			case AV:
				_localctx = new AvContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28); match(AV);
				setState(29); expr_arithmetique(0);
				}
				break;
			case TD:
				_localctx = new TdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(30); match(TD);
				setState(31); expr_arithmetique(0);
				}
				break;
			case TG:
				_localctx = new TgContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(32); match(TG);
				setState(33); expr_arithmetique(0);
				}
				break;
			case RE:
				_localctx = new ReContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(34); match(RE);
				setState(35); expr_arithmetique(0);
				}
				break;
			case FPOS:
				_localctx = new FposContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(36); match(FPOS);
				setState(37); expr_arithmetique(0);
				setState(38); expr_arithmetique(0);
				}
				break;
			case FCC:
				_localctx = new FccContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(40); match(FCC);
				setState(41); expr_arithmetique(0);
				}
				break;
			case COND_IF:
			case BOUCLE_REPETE:
			case BOUCLE_TANTQUE:
				_localctx = new Expr_condContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(42); expr_conditionnelle();
				}
				break;
			case 2:
				_localctx = new Expr_affectContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(43); expr_affectation();
				}
				break;
			case LOCALE:
				_localctx = new Affect_localeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(44); match(LOCALE);
				setState(45); match(ID);
				}
				break;
			case POUR:
				_localctx = new FonctionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(46); match(POUR);
				setState(47); match(ID);
				setState(48); liste_params();
				setState(49); liste_instructions();
				setState(50); match(FIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Liste_paramsContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(LogoParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(LogoParser.ID); }
		public Liste_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterListe_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitListe_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitListe_params(this);
			else return null;
		}
	}

	public final Liste_paramsContext liste_params() throws RecognitionException {
		Liste_paramsContext _localctx = new Liste_paramsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liste_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(54); match(ID);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Expr_arithmetiqueContext extends ParserRuleContext {
		public int _p;
		public Expr_arithmetiqueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_arithmetiqueContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr_arithmetique; }
	 
		public Expr_arithmetiqueContext() { }
		public void copyFrom(Expr_arithmetiqueContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IdContext extends Expr_arithmetiqueContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public IdContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitId(this);
			else return null;
		}
	}
	public static class NegContext extends Expr_arithmetiqueContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public NegContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNeg(this);
			else return null;
		}
	}
	public static class PlusContext extends Expr_arithmetiqueContext {
		public Expr_arithmetiqueContext expr_arithmetique(int i) {
			return getRuleContext(Expr_arithmetiqueContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LogoParser.PLUS, 0); }
		public List<Expr_arithmetiqueContext> expr_arithmetique() {
			return getRuleContexts(Expr_arithmetiqueContext.class);
		}
		public PlusContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPlus(this);
			else return null;
		}
	}
	public static class HasardContext extends Expr_arithmetiqueContext {
		public TerminalNode HASARD() { return getToken(LogoParser.HASARD, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public HasardContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHasard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHasard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitHasard(this);
			else return null;
		}
	}
	public static class MinusContext extends Expr_arithmetiqueContext {
		public Expr_arithmetiqueContext expr_arithmetique(int i) {
			return getRuleContext(Expr_arithmetiqueContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(LogoParser.MINUS, 0); }
		public List<Expr_arithmetiqueContext> expr_arithmetique() {
			return getRuleContexts(Expr_arithmetiqueContext.class);
		}
		public MinusContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMinus(this);
			else return null;
		}
	}
	public static class IntContext extends Expr_arithmetiqueContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public IntContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInt(this);
			else return null;
		}
	}
	public static class LoopContext extends Expr_arithmetiqueContext {
		public LoopContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLoop(this);
			else return null;
		}
	}
	public static class DivContext extends Expr_arithmetiqueContext {
		public Expr_arithmetiqueContext expr_arithmetique(int i) {
			return getRuleContext(Expr_arithmetiqueContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LogoParser.DIV, 0); }
		public List<Expr_arithmetiqueContext> expr_arithmetique() {
			return getRuleContexts(Expr_arithmetiqueContext.class);
		}
		public DivContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDiv(this);
			else return null;
		}
	}
	public static class ParentContext extends Expr_arithmetiqueContext {
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public ParentContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitParent(this);
			else return null;
		}
	}
	public static class MulContext extends Expr_arithmetiqueContext {
		public Expr_arithmetiqueContext expr_arithmetique(int i) {
			return getRuleContext(Expr_arithmetiqueContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LogoParser.MUL, 0); }
		public List<Expr_arithmetiqueContext> expr_arithmetique() {
			return getRuleContexts(Expr_arithmetiqueContext.class);
		}
		public MulContext(Expr_arithmetiqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMul(this);
			else return null;
		}
	}

	public final Expr_arithmetiqueContext expr_arithmetique(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_arithmetiqueContext _localctx = new Expr_arithmetiqueContext(_ctx, _parentState, _p);
		Expr_arithmetiqueContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_expr_arithmetique);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			switch (_input.LA(1)) {
			case HASARD:
				{
				_localctx = new HasardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61); match(HASARD);
				setState(62); expr_arithmetique(6);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); match(INT);
				}
				break;
			case MINUS:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64); match(MINUS);
				setState(65); match(INT);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66); match(6);
				setState(67); match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); match(7);
				setState(69); expr_arithmetique(0);
				setState(70); match(4);
				}
				break;
			case 1:
				{
				_localctx = new LoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72); match(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(75);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(76); match(MUL);
						setState(77); expr_arithmetique(11);
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(78);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(79); match(DIV);
						setState(80); expr_arithmetique(10);
						}
						break;

					case 3:
						{
						_localctx = new PlusContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(81);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(82); match(PLUS);
						setState(83); expr_arithmetique(9);
						}
						break;

					case 4:
						{
						_localctx = new MinusContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(84);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(85); match(MINUS);
						setState(86); expr_arithmetique(8);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Expr_booleeneContext extends ParserRuleContext {
		public int _p;
		public Expr_booleeneContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expr_booleeneContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr_booleene; }
	 
		public Expr_booleeneContext() { }
		public void copyFrom(Expr_booleeneContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Bool_etContext extends Expr_booleeneContext {
		public TerminalNode ET() { return getToken(LogoParser.ET, 0); }
		public Expr_booleeneContext expr_booleene(int i) {
			return getRuleContext(Expr_booleeneContext.class,i);
		}
		public List<Expr_booleeneContext> expr_booleene() {
			return getRuleContexts(Expr_booleeneContext.class);
		}
		public Bool_etContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_et(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_et(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_et(this);
			else return null;
		}
	}
	public static class Bool_fauxContext extends Expr_booleeneContext {
		public Bool_fauxContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_faux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_faux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_faux(this);
			else return null;
		}
	}
	public static class Bool_vraiContext extends Expr_booleeneContext {
		public Bool_vraiContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_vrai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_vrai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_vrai(this);
			else return null;
		}
	}
	public static class Id_boolContext extends Expr_booleeneContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public Id_boolContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterId_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitId_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitId_bool(this);
			else return null;
		}
	}
	public static class Bool_ouContext extends Expr_booleeneContext {
		public Expr_booleeneContext expr_booleene(int i) {
			return getRuleContext(Expr_booleeneContext.class,i);
		}
		public List<Expr_booleeneContext> expr_booleene() {
			return getRuleContexts(Expr_booleeneContext.class);
		}
		public TerminalNode OU() { return getToken(LogoParser.OU, 0); }
		public Bool_ouContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_ou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_ou(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_ou(this);
			else return null;
		}
	}
	public static class Bool_op_arithmContext extends Expr_booleeneContext {
		public Expr_arithmetiqueContext expr_arithmetique(int i) {
			return getRuleContext(Expr_arithmetiqueContext.class,i);
		}
		public TerminalNode OP_INT() { return getToken(LogoParser.OP_INT, 0); }
		public List<Expr_arithmetiqueContext> expr_arithmetique() {
			return getRuleContexts(Expr_arithmetiqueContext.class);
		}
		public Bool_op_arithmContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_op_arithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_op_arithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_op_arithm(this);
			else return null;
		}
	}
	public static class Bool_op_boolContext extends Expr_booleeneContext {
		public Expr_booleeneContext expr_booleene(int i) {
			return getRuleContext(Expr_booleeneContext.class,i);
		}
		public TerminalNode OP_BOOL() { return getToken(LogoParser.OP_BOOL, 0); }
		public List<Expr_booleeneContext> expr_booleene() {
			return getRuleContexts(Expr_booleeneContext.class);
		}
		public Bool_op_boolContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_op_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_op_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_op_bool(this);
			else return null;
		}
	}
	public static class Bool_parentContext extends Expr_booleeneContext {
		public Expr_booleeneContext expr_booleene() {
			return getRuleContext(Expr_booleeneContext.class,0);
		}
		public Bool_parentContext(Expr_booleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBool_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBool_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBool_parent(this);
			else return null;
		}
	}

	public final Expr_booleeneContext expr_booleene(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_booleeneContext _localctx = new Expr_booleeneContext(_ctx, _parentState, _p);
		Expr_booleeneContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_expr_booleene);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new Bool_op_arithmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93); expr_arithmetique(0);
				setState(94); match(OP_INT);
				setState(95); expr_arithmetique(0);
				}
				break;

			case 2:
				{
				_localctx = new Bool_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); match(7);
				setState(98); expr_booleene(0);
				setState(99); match(4);
				}
				break;

			case 3:
				{
				_localctx = new Bool_vraiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); match(9);
				}
				break;

			case 4:
				{
				_localctx = new Bool_fauxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(8);
				}
				break;

			case 5:
				{
				_localctx = new Id_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103); match(6);
				setState(104); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_etContext(new Expr_booleeneContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleene);
						setState(107);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(108); match(ET);
						setState(109); expr_booleene(9);
						}
						break;

					case 2:
						{
						_localctx = new Bool_ouContext(new Expr_booleeneContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleene);
						setState(110);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(111); match(OU);
						setState(112); expr_booleene(8);
						}
						break;

					case 3:
						{
						_localctx = new Bool_op_boolContext(new Expr_booleeneContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleene);
						setState(113);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(114); match(OP_BOOL);
						setState(115); expr_booleene(7);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class BlocContext extends ParserRuleContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBloc(this);
			else return null;
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(5);
			setState(122); liste_instructions();
			setState(123); match(3);
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

	public static class Expr_conditionnelleContext extends ParserRuleContext {
		public Expr_conditionnelleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_conditionnelle; }
	 
		public Expr_conditionnelleContext() { }
		public void copyFrom(Expr_conditionnelleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Si_sinonContext extends Expr_conditionnelleContext {
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public Expr_booleeneContext expr_booleene() {
			return getRuleContext(Expr_booleeneContext.class,0);
		}
		public TerminalNode COND_IF() { return getToken(LogoParser.COND_IF, 0); }
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public Si_sinonContext(Expr_conditionnelleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSi_sinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSi_sinon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSi_sinon(this);
			else return null;
		}
	}
	public static class RepeteContext extends Expr_conditionnelleContext {
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode BOUCLE_REPETE() { return getToken(LogoParser.BOUCLE_REPETE, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public RepeteContext(Expr_conditionnelleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRepete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRepete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRepete(this);
			else return null;
		}
	}
	public static class TanqueContext extends Expr_conditionnelleContext {
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public Expr_booleeneContext expr_booleene() {
			return getRuleContext(Expr_booleeneContext.class,0);
		}
		public TerminalNode BOUCLE_TANTQUE() { return getToken(LogoParser.BOUCLE_TANTQUE, 0); }
		public TanqueContext(Expr_conditionnelleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTanque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTanque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitTanque(this);
			else return null;
		}
	}
	public static class SiContext extends Expr_conditionnelleContext {
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public Expr_booleeneContext expr_booleene() {
			return getRuleContext(Expr_booleeneContext.class,0);
		}
		public TerminalNode COND_IF() { return getToken(LogoParser.COND_IF, 0); }
		public SiContext(Expr_conditionnelleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSi(this);
			else return null;
		}
	}

	public final Expr_conditionnelleContext expr_conditionnelle() throws RecognitionException {
		Expr_conditionnelleContext _localctx = new Expr_conditionnelleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_conditionnelle);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new SiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(COND_IF);
				setState(126); expr_booleene(0);
				setState(127); bloc();
				}
				break;

			case 2:
				_localctx = new Si_sinonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(COND_IF);
				setState(130); expr_booleene(0);
				setState(131); bloc();
				setState(132); bloc();
				}
				break;

			case 3:
				_localctx = new RepeteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(BOUCLE_REPETE);
				setState(135); expr_arithmetique(0);
				setState(136); bloc();
				}
				break;

			case 4:
				_localctx = new TanqueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(BOUCLE_TANTQUE);
				setState(139); expr_booleene(0);
				setState(140); bloc();
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

	public static class Expr_affectationContext extends ParserRuleContext {
		public Expr_affectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_affectation; }
	 
		public Expr_affectationContext() { }
		public void copyFrom(Expr_affectationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Affect_id_intContext extends Expr_affectationContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public Expr_arithmetiqueContext expr_arithmetique() {
			return getRuleContext(Expr_arithmetiqueContext.class,0);
		}
		public Affect_id_intContext(Expr_affectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAffect_id_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAffect_id_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAffect_id_int(this);
			else return null;
		}
	}
	public static class Affect_id_boolContext extends Expr_affectationContext {
		public Expr_booleeneContext expr_booleene() {
			return getRuleContext(Expr_booleeneContext.class,0);
		}
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public Affect_id_boolContext(Expr_affectationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAffect_id_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAffect_id_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAffect_id_bool(this);
			else return null;
		}
	}

	public final Expr_affectationContext expr_affectation() throws RecognitionException {
		Expr_affectationContext _localctx = new Expr_affectationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_affectation);
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Affect_id_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(2);
				setState(145); match(10);
				setState(146); match(ID);
				setState(147); expr_arithmetique(0);
				}
				break;

			case 2:
				_localctx = new Affect_id_boolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(2);
				setState(149); match(10);
				setState(150); match(ID);
				setState(151); expr_booleene(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return expr_arithmetique_sempred((Expr_arithmetiqueContext)_localctx, predIndex);

		case 5: return expr_booleene_sempred((Expr_booleeneContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_booleene_sempred(Expr_booleeneContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;
		}
		return true;
	}
	private boolean expr_arithmetique_sempred(Expr_arithmetiqueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\1\3&\u009b\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2"+
		"\7\7\7\2\b\7\b\1\0\1\0\1\1\4\1\26\b\1\13\1\f\1\27\1\2\1\2\1\2\1\2\1\2"+
		"\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1"+
		"\2\1\2\1\2\1\2\1\2\3\2\65\b\2\1\3\5\38\b\3\n\3\f\3;\t\3\1\4\1\4\1\4\1"+
		"\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\3\4J\b\4\1\4\1\4\1\4\1\4\1\4\1"+
		"\4\1\4\1\4\1\4\1\4\1\4\1\4\5\4X\b\4\n\4\f\4[\t\4\1\5\1\5\1\5\1\5\1\5\1"+
		"\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\3\5j\b\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1"+
		"\5\1\5\5\5u\b\5\n\5\f\5x\t\5\1\6\1\6\1\6\1\6\1\7\1\7\1\7\1\7\1\7\1\7\1"+
		"\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\3\7\u008f\b\7\1\b\1\b\1\b\1"+
		"\b\1\b\1\b\1\b\1\b\3\b\u0099\b\b\1\b\0\t\0\2\4\6\b\n\f\16\20\0\0\u00b3"+
		"\0\22\1\0\0\0\2\25\1\0\0\0\4\64\1\0\0\0\69\1\0\0\0\bI\1\0\0\0\ni\1\0\0"+
		"\0\fy\1\0\0\0\16\u008e\1\0\0\0\20\u0098\1\0\0\0\22\23\3\2\1\0\23\1\1\0"+
		"\0\0\24\26\3\4\2\0\25\24\1\0\0\0\26\27\1\0\0\0\27\25\1\0\0\0\27\30\1\0"+
		"\0\0\30\3\1\0\0\0\31\65\5\16\0\0\32\65\5\17\0\0\33\65\5\20\0\0\34\35\5"+
		"\21\0\0\35\65\3\b\4\0\36\37\5\22\0\0\37\65\3\b\4\0 !\5\23\0\0!\65\3\b"+
		"\4\0\"#\5\24\0\0#\65\3\b\4\0$%\5\25\0\0%&\3\b\4\0&\'\3\b\4\0\'\65\1\0"+
		"\0\0()\5\26\0\0)\65\3\b\4\0*\65\3\16\7\0+\65\3\20\b\0,-\5!\0\0-\65\5\r"+
		"\0\0./\5%\0\0/\60\5\r\0\0\60\61\3\6\3\0\61\62\3\2\1\0\62\63\5&\0\0\63"+
		"\65\1\0\0\0\64\31\1\0\0\0\64\32\1\0\0\0\64\33\1\0\0\0\64\34\1\0\0\0\64"+
		"\36\1\0\0\0\64 \1\0\0\0\64\"\1\0\0\0\64$\1\0\0\0\64(\1\0\0\0\64*\1\0\0"+
		"\0\64+\1\0\0\0\64,\1\0\0\0\64.\1\0\0\0\65\5\1\0\0\0\668\5\r\0\0\67\66"+
		"\1\0\0\08;\1\0\0\09\67\1\0\0\09:\1\0\0\0:\7\1\0\0\0;9\1\0\0\0<=\6\4\uffff"+
		"\0=>\5\33\0\0>J\3\b\4\0?J\5\13\0\0@A\5\30\0\0AJ\5\13\0\0BC\5\6\0\0CJ\5"+
		"\r\0\0DE\5\7\0\0EF\3\b\4\0FG\5\4\0\0GJ\1\0\0\0HJ\5\1\0\0I<\1\0\0\0I?\1"+
		"\0\0\0I@\1\0\0\0IB\1\0\0\0ID\1\0\0\0IH\1\0\0\0JY\1\0\0\0KL\4\4\0\1LM\5"+
		"\31\0\0MX\3\b\4\0NO\4\4\1\1OP\5\32\0\0PX\3\b\4\0QR\4\4\2\1RS\5\27\0\0"+
		"SX\3\b\4\0TU\4\4\3\1UV\5\30\0\0VX\3\b\4\0WK\1\0\0\0WN\1\0\0\0WQ\1\0\0"+
		"\0WT\1\0\0\0X[\1\0\0\0YW\1\0\0\0YZ\1\0\0\0Z\t\1\0\0\0[Y\1\0\0\0\\]\6\5"+
		"\uffff\0]^\3\b\4\0^_\5\37\0\0_`\3\b\4\0`j\1\0\0\0ab\5\7\0\0bc\3\n\5\0"+
		"cd\5\4\0\0dj\1\0\0\0ej\5\t\0\0fj\5\b\0\0gh\5\6\0\0hj\5\r\0\0i\\\1\0\0"+
		"\0ia\1\0\0\0ie\1\0\0\0if\1\0\0\0ig\1\0\0\0jv\1\0\0\0kl\4\5\4\1lm\5\34"+
		"\0\0mu\3\n\5\0no\4\5\5\1op\5\35\0\0pu\3\n\5\0qr\4\5\6\1rs\5\36\0\0su\3"+
		"\n\5\0tk\1\0\0\0tn\1\0\0\0tq\1\0\0\0ux\1\0\0\0vt\1\0\0\0vw\1\0\0\0w\13"+
		"\1\0\0\0xv\1\0\0\0yz\5\5\0\0z{\3\2\1\0{|\5\3\0\0|\r\1\0\0\0}~\5\"\0\0"+
		"~\177\3\n\5\0\177\u0080\3\f\6\0\u0080\u008f\1\0\0\0\u0081\u0082\5\"\0"+
		"\0\u0082\u0083\3\n\5\0\u0083\u0084\3\f\6\0\u0084\u0085\3\f\6\0\u0085\u008f"+
		"\1\0\0\0\u0086\u0087\5#\0\0\u0087\u0088\3\b\4\0\u0088\u0089\3\f\6\0\u0089"+
		"\u008f\1\0\0\0\u008a\u008b\5$\0\0\u008b\u008c\3\n\5\0\u008c\u008d\3\f"+
		"\6\0\u008d\u008f\1\0\0\0\u008e}\1\0\0\0\u008e\u0081\1\0\0\0\u008e\u0086"+
		"\1\0\0\0\u008e\u008a\1\0\0\0\u008f\17\1\0\0\0\u0090\u0091\5\2\0\0\u0091"+
		"\u0092\5\n\0\0\u0092\u0093\5\r\0\0\u0093\u0099\3\b\4\0\u0094\u0095\5\2"+
		"\0\0\u0095\u0096\5\n\0\0\u0096\u0097\5\r\0\0\u0097\u0099\3\n\5\0\u0098"+
		"\u0090\1\0\0\0\u0098\u0094\1\0\0\0\u0099\21\1\0\0\0\13\27\649IWYitv\u008e"+
		"\u0098";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}