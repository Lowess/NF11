
  package logoparsing;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class LogoBaseListener implements LogoListener {
	@Override public void enterBool_et(LogoParser.Bool_etContext ctx) { }
	@Override public void exitBool_et(LogoParser.Bool_etContext ctx) { }

	@Override public void enterNeg(LogoParser.NegContext ctx) { }
	@Override public void exitNeg(LogoParser.NegContext ctx) { }

	@Override public void enterBool_faux(LogoParser.Bool_fauxContext ctx) { }
	@Override public void exitBool_faux(LogoParser.Bool_fauxContext ctx) { }

	@Override public void enterHasard(LogoParser.HasardContext ctx) { }
	@Override public void exitHasard(LogoParser.HasardContext ctx) { }

	@Override public void enterTg(LogoParser.TgContext ctx) { }
	@Override public void exitTg(LogoParser.TgContext ctx) { }

	@Override public void enterDiv(LogoParser.DivContext ctx) { }
	@Override public void exitDiv(LogoParser.DivContext ctx) { }

	@Override public void enterId_bool(LogoParser.Id_boolContext ctx) { }
	@Override public void exitId_bool(LogoParser.Id_boolContext ctx) { }

	@Override public void enterTd(LogoParser.TdContext ctx) { }
	@Override public void exitTd(LogoParser.TdContext ctx) { }

	@Override public void enterRe(LogoParser.ReContext ctx) { }
	@Override public void exitRe(LogoParser.ReContext ctx) { }

	@Override public void enterTanque(LogoParser.TanqueContext ctx) { }
	@Override public void exitTanque(LogoParser.TanqueContext ctx) { }

	@Override public void enterListe_instructions(LogoParser.Liste_instructionsContext ctx) { }
	@Override public void exitListe_instructions(LogoParser.Liste_instructionsContext ctx) { }

	@Override public void enterId(LogoParser.IdContext ctx) { }
	@Override public void exitId(LogoParser.IdContext ctx) { }

	@Override public void enterAffect_id_bool(LogoParser.Affect_id_boolContext ctx) { }
	@Override public void exitAffect_id_bool(LogoParser.Affect_id_boolContext ctx) { }

	@Override public void enterVe(LogoParser.VeContext ctx) { }
	@Override public void exitVe(LogoParser.VeContext ctx) { }

	@Override public void enterLoop(LogoParser.LoopContext ctx) { }
	@Override public void exitLoop(LogoParser.LoopContext ctx) { }

	@Override public void enterListe_params(LogoParser.Liste_paramsContext ctx) { }
	@Override public void exitListe_params(LogoParser.Liste_paramsContext ctx) { }

	@Override public void enterBool_op_bool(LogoParser.Bool_op_boolContext ctx) { }
	@Override public void exitBool_op_bool(LogoParser.Bool_op_boolContext ctx) { }

	@Override public void enterBool_op_arithm(LogoParser.Bool_op_arithmContext ctx) { }
	@Override public void exitBool_op_arithm(LogoParser.Bool_op_arithmContext ctx) { }

	@Override public void enterBc(LogoParser.BcContext ctx) { }
	@Override public void exitBc(LogoParser.BcContext ctx) { }

	@Override public void enterAffect_locale(LogoParser.Affect_localeContext ctx) { }
	@Override public void exitAffect_locale(LogoParser.Affect_localeContext ctx) { }

	@Override public void enterPlus(LogoParser.PlusContext ctx) { }
	@Override public void exitPlus(LogoParser.PlusContext ctx) { }

	@Override public void enterMinus(LogoParser.MinusContext ctx) { }
	@Override public void exitMinus(LogoParser.MinusContext ctx) { }

	@Override public void enterInt(LogoParser.IntContext ctx) { }
	@Override public void exitInt(LogoParser.IntContext ctx) { }

	@Override public void enterRepete(LogoParser.RepeteContext ctx) { }
	@Override public void exitRepete(LogoParser.RepeteContext ctx) { }

	@Override public void enterParent(LogoParser.ParentContext ctx) { }
	@Override public void exitParent(LogoParser.ParentContext ctx) { }

	@Override public void enterBool_ou(LogoParser.Bool_ouContext ctx) { }
	@Override public void exitBool_ou(LogoParser.Bool_ouContext ctx) { }

	@Override public void enterMul(LogoParser.MulContext ctx) { }
	@Override public void exitMul(LogoParser.MulContext ctx) { }

	@Override public void enterAv(LogoParser.AvContext ctx) { }
	@Override public void exitAv(LogoParser.AvContext ctx) { }

	@Override public void enterExpr_affect(LogoParser.Expr_affectContext ctx) { }
	@Override public void exitExpr_affect(LogoParser.Expr_affectContext ctx) { }

	@Override public void enterSi(LogoParser.SiContext ctx) { }
	@Override public void exitSi(LogoParser.SiContext ctx) { }

	@Override public void enterAffect_id_int(LogoParser.Affect_id_intContext ctx) { }
	@Override public void exitAffect_id_int(LogoParser.Affect_id_intContext ctx) { }

	@Override public void enterProgramme(LogoParser.ProgrammeContext ctx) { }
	@Override public void exitProgramme(LogoParser.ProgrammeContext ctx) { }

	@Override public void enterBloc(LogoParser.BlocContext ctx) { }
	@Override public void exitBloc(LogoParser.BlocContext ctx) { }

	@Override public void enterSi_sinon(LogoParser.Si_sinonContext ctx) { }
	@Override public void exitSi_sinon(LogoParser.Si_sinonContext ctx) { }

	@Override public void enterBool_vrai(LogoParser.Bool_vraiContext ctx) { }
	@Override public void exitBool_vrai(LogoParser.Bool_vraiContext ctx) { }

	@Override public void enterFpos(LogoParser.FposContext ctx) { }
	@Override public void exitFpos(LogoParser.FposContext ctx) { }

	@Override public void enterFonction(LogoParser.FonctionContext ctx) { }
	@Override public void exitFonction(LogoParser.FonctionContext ctx) { }

	@Override public void enterLc(LogoParser.LcContext ctx) { }
	@Override public void exitLc(LogoParser.LcContext ctx) { }

	@Override public void enterExpr_cond(LogoParser.Expr_condContext ctx) { }
	@Override public void exitExpr_cond(LogoParser.Expr_condContext ctx) { }

	@Override public void enterFcc(LogoParser.FccContext ctx) { }
	@Override public void exitFcc(LogoParser.FccContext ctx) { }

	@Override public void enterBool_parent(LogoParser.Bool_parentContext ctx) { }
	@Override public void exitBool_parent(LogoParser.Bool_parentContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}