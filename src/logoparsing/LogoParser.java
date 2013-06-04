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
		RULE_expr_arithmetique = 3, RULE_expr_booleene = 4, RULE_bloc = 5, RULE_expr_conditionnelle = 6, 
		RULE_expr_affectation = 7;
	public static final String[] ruleNames = {
		"programme", "liste_instructions", "instruction", "expr_arithmetique", 
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
			setState(16); liste_instructions();
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); instruction();
				}
				}
				setState(21); 
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
	public static class ProcedureContext extends InstructionContext {
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public TerminalNode POUR() { return getToken(LogoParser.POUR, 0); }
		public TerminalNode FIN() { return getToken(LogoParser.FIN, 0); }
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public ProcedureContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProcedure(this);
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
			setState(49);
			switch (_input.LA(1)) {
			case LC:
				_localctx = new LcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23); match(LC);
				}
				break;
			case BC:
				_localctx = new BcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24); match(BC);
				}
				break;
			case VE:
				_localctx = new VeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25); match(VE);
				}
				break;
			case AV:
				_localctx = new AvContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26); match(AV);
				setState(27); expr_arithmetique(0);
				}
				break;
			case TD:
				_localctx = new TdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(28); match(TD);
				setState(29); expr_arithmetique(0);
				}
				break;
			case TG:
				_localctx = new TgContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(30); match(TG);
				setState(31); expr_arithmetique(0);
				}
				break;
			case RE:
				_localctx = new ReContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(32); match(RE);
				setState(33); expr_arithmetique(0);
				}
				break;
			case FPOS:
				_localctx = new FposContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(34); match(FPOS);
				setState(35); expr_arithmetique(0);
				setState(36); expr_arithmetique(0);
				}
				break;
			case FCC:
				_localctx = new FccContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(38); match(FCC);
				setState(39); expr_arithmetique(0);
				}
				break;
			case COND_IF:
			case BOUCLE_REPETE:
			case BOUCLE_TANTQUE:
				_localctx = new Expr_condContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(40); expr_conditionnelle();
				}
				break;
			case 2:
				_localctx = new Expr_affectContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(41); expr_affectation();
				}
				break;
			case LOCALE:
				_localctx = new Affect_localeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(42); match(LOCALE);
				setState(43); match(ID);
				}
				break;
			case POUR:
				_localctx = new ProcedureContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(44); match(POUR);
				setState(45); match(ID);
				setState(46); liste_instructions();
				setState(47); match(FIN);
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_expr_arithmetique);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch (_input.LA(1)) {
			case HASARD:
				{
				_localctx = new HasardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52); match(HASARD);
				setState(53); expr_arithmetique(6);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54); match(INT);
				}
				break;
			case MINUS:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); match(MINUS);
				setState(56); match(INT);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57); match(6);
				setState(58); match(ID);
				}
				break;
			case 7:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); match(7);
				setState(60); expr_arithmetique(0);
				setState(61); match(4);
				}
				break;
			case 1:
				{
				_localctx = new LoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); match(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(66);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(67); match(MUL);
						setState(68); expr_arithmetique(11);
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(69);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(70); match(DIV);
						setState(71); expr_arithmetique(10);
						}
						break;

					case 3:
						{
						_localctx = new PlusContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(72);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(73); match(PLUS);
						setState(74); expr_arithmetique(9);
						}
						break;

					case 4:
						{
						_localctx = new MinusContext(new Expr_arithmetiqueContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arithmetique);
						setState(75);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(76); match(MINUS);
						setState(77); expr_arithmetique(8);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_expr_booleene);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Bool_op_arithmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84); expr_arithmetique(0);
				setState(85); match(OP_INT);
				setState(86); expr_arithmetique(0);
				}
				break;

			case 2:
				{
				_localctx = new Bool_parentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); match(7);
				setState(89); expr_booleene(0);
				setState(90); match(4);
				}
				break;

			case 3:
				{
				_localctx = new Bool_vraiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92); match(9);
				}
				break;

			case 4:
				{
				_localctx = new Bool_fauxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); match(8);
				}
				break;

			case 5:
				{
				_localctx = new Id_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94); match(6);
				setState(95); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_etContext(new Expr_booleeneContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleene);
						setState(98);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(99); match(ET);
						setState(100); expr_booleene(9);
						}
						break;

					case 2:
						{
						_localctx = new Bool_ouContext(new Expr_booleeneContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleene);
						setState(101);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(102); match(OU);
						setState(103); expr_booleene(8);
						}
						break;

					case 3:
						{
						_localctx = new Bool_op_boolContext(new Expr_booleeneContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_booleene);
						setState(104);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(105); match(OP_BOOL);
						setState(106); expr_booleene(7);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 10, RULE_bloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(5);
			setState(113); liste_instructions();
			setState(114); match(3);
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
		enterRule(_localctx, 12, RULE_expr_conditionnelle);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(COND_IF);
				setState(117); expr_booleene(0);
				setState(118); bloc();
				}
				break;

			case 2:
				_localctx = new Si_sinonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(COND_IF);
				setState(121); expr_booleene(0);
				setState(122); bloc();
				setState(123); bloc();
				}
				break;

			case 3:
				_localctx = new RepeteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(BOUCLE_REPETE);
				setState(126); expr_arithmetique(0);
				setState(127); bloc();
				}
				break;

			case 4:
				_localctx = new TanqueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129); match(BOUCLE_TANTQUE);
				setState(130); expr_booleene(0);
				setState(131); bloc();
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
		enterRule(_localctx, 14, RULE_expr_affectation);
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new Affect_id_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(2);
				setState(136); match(10);
				setState(137); match(ID);
				setState(138); expr_arithmetique(0);
				}
				break;

			case 2:
				_localctx = new Affect_id_boolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(2);
				setState(140); match(10);
				setState(141); match(ID);
				setState(142); expr_booleene(0);
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
		case 3: return expr_arithmetique_sempred((Expr_arithmetiqueContext)_localctx, predIndex);

		case 4: return expr_booleene_sempred((Expr_booleeneContext)_localctx, predIndex);
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
		"\1\3&\u0092\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2"+
		"\7\7\7\1\0\1\0\1\1\4\1\24\b\1\13\1\f\1\25\1\2\1\2\1\2\1\2\1\2\1\2\1\2"+
		"\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1\2\1"+
		"\2\1\2\3\2\62\b\2\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3"+
		"\3\3A\b\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\5\3O\b\3\n\3"+
		"\f\3R\t\3\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\3\4a\b\4"+
		"\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\5\4l\b\4\n\4\f\4o\t\4\1\5\1\5\1\5"+
		"\1\5\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1"+
		"\6\3\6\u0086\b\6\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\3\7\u0090\b\7\1\7\0\b"+
		"\0\2\4\6\b\n\f\16\0\0\u00aa\0\20\1\0\0\0\2\23\1\0\0\0\4\61\1\0\0\0\6@"+
		"\1\0\0\0\b`\1\0\0\0\np\1\0\0\0\f\u0085\1\0\0\0\16\u008f\1\0\0\0\20\21"+
		"\3\2\1\0\21\1\1\0\0\0\22\24\3\4\2\0\23\22\1\0\0\0\24\25\1\0\0\0\25\23"+
		"\1\0\0\0\25\26\1\0\0\0\26\3\1\0\0\0\27\62\5\16\0\0\30\62\5\17\0\0\31\62"+
		"\5\20\0\0\32\33\5\21\0\0\33\62\3\6\3\0\34\35\5\22\0\0\35\62\3\6\3\0\36"+
		"\37\5\23\0\0\37\62\3\6\3\0 !\5\24\0\0!\62\3\6\3\0\"#\5\25\0\0#$\3\6\3"+
		"\0$%\3\6\3\0%\62\1\0\0\0&\'\5\26\0\0\'\62\3\6\3\0(\62\3\f\6\0)\62\3\16"+
		"\7\0*+\5!\0\0+\62\5\r\0\0,-\5%\0\0-.\5\r\0\0./\3\2\1\0/\60\5&\0\0\60\62"+
		"\1\0\0\0\61\27\1\0\0\0\61\30\1\0\0\0\61\31\1\0\0\0\61\32\1\0\0\0\61\34"+
		"\1\0\0\0\61\36\1\0\0\0\61 \1\0\0\0\61\"\1\0\0\0\61&\1\0\0\0\61(\1\0\0"+
		"\0\61)\1\0\0\0\61*\1\0\0\0\61,\1\0\0\0\62\5\1\0\0\0\63\64\6\3\uffff\0"+
		"\64\65\5\33\0\0\65A\3\6\3\0\66A\5\13\0\0\678\5\30\0\08A\5\13\0\09:\5\6"+
		"\0\0:A\5\r\0\0;<\5\7\0\0<=\3\6\3\0=>\5\4\0\0>A\1\0\0\0?A\5\1\0\0@\63\1"+
		"\0\0\0@\66\1\0\0\0@\67\1\0\0\0@9\1\0\0\0@;\1\0\0\0@?\1\0\0\0AP\1\0\0\0"+
		"BC\4\3\0\1CD\5\31\0\0DO\3\6\3\0EF\4\3\1\1FG\5\32\0\0GO\3\6\3\0HI\4\3\2"+
		"\1IJ\5\27\0\0JO\3\6\3\0KL\4\3\3\1LM\5\30\0\0MO\3\6\3\0NB\1\0\0\0NE\1\0"+
		"\0\0NH\1\0\0\0NK\1\0\0\0OR\1\0\0\0PN\1\0\0\0PQ\1\0\0\0Q\7\1\0\0\0RP\1"+
		"\0\0\0ST\6\4\uffff\0TU\3\6\3\0UV\5\37\0\0VW\3\6\3\0Wa\1\0\0\0XY\5\7\0"+
		"\0YZ\3\b\4\0Z[\5\4\0\0[a\1\0\0\0\\a\5\t\0\0]a\5\b\0\0^_\5\6\0\0_a\5\r"+
		"\0\0`S\1\0\0\0`X\1\0\0\0`\\\1\0\0\0`]\1\0\0\0`^\1\0\0\0am\1\0\0\0bc\4"+
		"\4\4\1cd\5\34\0\0dl\3\b\4\0ef\4\4\5\1fg\5\35\0\0gl\3\b\4\0hi\4\4\6\1i"+
		"j\5\36\0\0jl\3\b\4\0kb\1\0\0\0ke\1\0\0\0kh\1\0\0\0lo\1\0\0\0mk\1\0\0\0"+
		"mn\1\0\0\0n\t\1\0\0\0om\1\0\0\0pq\5\5\0\0qr\3\2\1\0rs\5\3\0\0s\13\1\0"+
		"\0\0tu\5\"\0\0uv\3\b\4\0vw\3\n\5\0w\u0086\1\0\0\0xy\5\"\0\0yz\3\b\4\0"+
		"z{\3\n\5\0{|\3\n\5\0|\u0086\1\0\0\0}~\5#\0\0~\177\3\6\3\0\177\u0080\3"+
		"\n\5\0\u0080\u0086\1\0\0\0\u0081\u0082\5$\0\0\u0082\u0083\3\b\4\0\u0083"+
		"\u0084\3\n\5\0\u0084\u0086\1\0\0\0\u0085t\1\0\0\0\u0085x\1\0\0\0\u0085"+
		"}\1\0\0\0\u0085\u0081\1\0\0\0\u0086\r\1\0\0\0\u0087\u0088\5\2\0\0\u0088"+
		"\u0089\5\n\0\0\u0089\u008a\5\r\0\0\u008a\u0090\3\6\3\0\u008b\u008c\5\2"+
		"\0\0\u008c\u008d\5\n\0\0\u008d\u008e\5\r\0\0\u008e\u0090\3\b\4\0\u008f"+
		"\u0087\1\0\0\0\u008f\u008b\1\0\0\0\u0090\17\1\0\0\0\n\25\61@NP`km\u0085"+
		"\u008f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}