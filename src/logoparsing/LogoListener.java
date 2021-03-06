
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoListener extends ParseTreeListener {
	void enterRet(LogoParser.RetContext ctx);
	void exitRet(LogoParser.RetContext ctx);

	void enterBool_et(LogoParser.Bool_etContext ctx);
	void exitBool_et(LogoParser.Bool_etContext ctx);

	void enterListe_procedures(LogoParser.Liste_proceduresContext ctx);
	void exitListe_procedures(LogoParser.Liste_proceduresContext ctx);

	void enterNeg(LogoParser.NegContext ctx);
	void exitNeg(LogoParser.NegContext ctx);

	void enterBool_faux(LogoParser.Bool_fauxContext ctx);
	void exitBool_faux(LogoParser.Bool_fauxContext ctx);

	void enterHasard(LogoParser.HasardContext ctx);
	void exitHasard(LogoParser.HasardContext ctx);

	void enterDiv(LogoParser.DivContext ctx);
	void exitDiv(LogoParser.DivContext ctx);

	void enterTg(LogoParser.TgContext ctx);
	void exitTg(LogoParser.TgContext ctx);

	void enterId_bool(LogoParser.Id_boolContext ctx);
	void exitId_bool(LogoParser.Id_boolContext ctx);

	void enterTd(LogoParser.TdContext ctx);
	void exitTd(LogoParser.TdContext ctx);

	void enterRe(LogoParser.ReContext ctx);
	void exitRe(LogoParser.ReContext ctx);

	void enterTanque(LogoParser.TanqueContext ctx);
	void exitTanque(LogoParser.TanqueContext ctx);

	void enterAppel_fonc(LogoParser.Appel_foncContext ctx);
	void exitAppel_fonc(LogoParser.Appel_foncContext ctx);

	void enterListe_appel(LogoParser.Liste_appelContext ctx);
	void exitListe_appel(LogoParser.Liste_appelContext ctx);

	void enterRc(LogoParser.RcContext ctx);
	void exitRc(LogoParser.RcContext ctx);

	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	void enterId(LogoParser.IdContext ctx);
	void exitId(LogoParser.IdContext ctx);

	void enterAffect_id_bool(LogoParser.Affect_id_boolContext ctx);
	void exitAffect_id_bool(LogoParser.Affect_id_boolContext ctx);

	void enterLoop(LogoParser.LoopContext ctx);
	void exitLoop(LogoParser.LoopContext ctx);

	void enterVe(LogoParser.VeContext ctx);
	void exitVe(LogoParser.VeContext ctx);

	void enterListe_params(LogoParser.Liste_paramsContext ctx);
	void exitListe_params(LogoParser.Liste_paramsContext ctx);

	void enterBool_op_bool(LogoParser.Bool_op_boolContext ctx);
	void exitBool_op_bool(LogoParser.Bool_op_boolContext ctx);

	void enterBool_op_arithm(LogoParser.Bool_op_arithmContext ctx);
	void exitBool_op_arithm(LogoParser.Bool_op_arithmContext ctx);

	void enterBc(LogoParser.BcContext ctx);
	void exitBc(LogoParser.BcContext ctx);

	void enterProcedure(LogoParser.ProcedureContext ctx);
	void exitProcedure(LogoParser.ProcedureContext ctx);

	void enterAffect_locale(LogoParser.Affect_localeContext ctx);
	void exitAffect_locale(LogoParser.Affect_localeContext ctx);

	void enterPlus(LogoParser.PlusContext ctx);
	void exitPlus(LogoParser.PlusContext ctx);

	void enterMinus(LogoParser.MinusContext ctx);
	void exitMinus(LogoParser.MinusContext ctx);

	void enterAppel_proc(LogoParser.Appel_procContext ctx);
	void exitAppel_proc(LogoParser.Appel_procContext ctx);

	void enterInt(LogoParser.IntContext ctx);
	void exitInt(LogoParser.IntContext ctx);

	void enterRepete(LogoParser.RepeteContext ctx);
	void exitRepete(LogoParser.RepeteContext ctx);

	void enterParent(LogoParser.ParentContext ctx);
	void exitParent(LogoParser.ParentContext ctx);

	void enterNeg_id(LogoParser.Neg_idContext ctx);
	void exitNeg_id(LogoParser.Neg_idContext ctx);

	void enterBool_ou(LogoParser.Bool_ouContext ctx);
	void exitBool_ou(LogoParser.Bool_ouContext ctx);

	void enterMul(LogoParser.MulContext ctx);
	void exitMul(LogoParser.MulContext ctx);

	void enterAv(LogoParser.AvContext ctx);
	void exitAv(LogoParser.AvContext ctx);

	void enterExpr_affect(LogoParser.Expr_affectContext ctx);
	void exitExpr_affect(LogoParser.Expr_affectContext ctx);

	void enterAffect_id_int(LogoParser.Affect_id_intContext ctx);
	void exitAffect_id_int(LogoParser.Affect_id_intContext ctx);

	void enterProgramme(LogoParser.ProgrammeContext ctx);
	void exitProgramme(LogoParser.ProgrammeContext ctx);

	void enterBloc(LogoParser.BlocContext ctx);
	void exitBloc(LogoParser.BlocContext ctx);

	void enterSi_sinon(LogoParser.Si_sinonContext ctx);
	void exitSi_sinon(LogoParser.Si_sinonContext ctx);

	void enterBool_vrai(LogoParser.Bool_vraiContext ctx);
	void exitBool_vrai(LogoParser.Bool_vraiContext ctx);

	void enterFpos(LogoParser.FposContext ctx);
	void exitFpos(LogoParser.FposContext ctx);

	void enterLc(LogoParser.LcContext ctx);
	void exitLc(LogoParser.LcContext ctx);

	void enterExpr_cond(LogoParser.Expr_condContext ctx);
	void exitExpr_cond(LogoParser.Expr_condContext ctx);

	void enterFcc(LogoParser.FccContext ctx);
	void exitFcc(LogoParser.FccContext ctx);

	void enterBool_parent(LogoParser.Bool_parentContext ctx);
	void exitBool_parent(LogoParser.Bool_parentContext ctx);
}