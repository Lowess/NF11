
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LogoBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LogoVisitor<T> {
	@Override public T visitRet(LogoParser.RetContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_et(LogoParser.Bool_etContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_procedures(LogoParser.Liste_proceduresContext ctx) { return visitChildren(ctx); }

	@Override public T visitNeg(LogoParser.NegContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_faux(LogoParser.Bool_fauxContext ctx) { return visitChildren(ctx); }

	@Override public T visitHasard(LogoParser.HasardContext ctx) { return visitChildren(ctx); }

	@Override public T visitDiv(LogoParser.DivContext ctx) { return visitChildren(ctx); }

	@Override public T visitTg(LogoParser.TgContext ctx) { return visitChildren(ctx); }

	@Override public T visitId_bool(LogoParser.Id_boolContext ctx) { return visitChildren(ctx); }

	@Override public T visitTd(LogoParser.TdContext ctx) { return visitChildren(ctx); }

	@Override public T visitRe(LogoParser.ReContext ctx) { return visitChildren(ctx); }

	@Override public T visitTanque(LogoParser.TanqueContext ctx) { return visitChildren(ctx); }

	@Override public T visitAppel_fonc(LogoParser.Appel_foncContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_appel(LogoParser.Liste_appelContext ctx) { return visitChildren(ctx); }

	@Override public T visitRc(LogoParser.RcContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_instructions(LogoParser.Liste_instructionsContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(LogoParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public T visitAffect_id_bool(LogoParser.Affect_id_boolContext ctx) { return visitChildren(ctx); }

	@Override public T visitLoop(LogoParser.LoopContext ctx) { return visitChildren(ctx); }

	@Override public T visitVe(LogoParser.VeContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_params(LogoParser.Liste_paramsContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_op_bool(LogoParser.Bool_op_boolContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_op_arithm(LogoParser.Bool_op_arithmContext ctx) { return visitChildren(ctx); }

	@Override public T visitBc(LogoParser.BcContext ctx) { return visitChildren(ctx); }

	@Override public T visitProcedure(LogoParser.ProcedureContext ctx) { return visitChildren(ctx); }

	@Override public T visitAffect_locale(LogoParser.Affect_localeContext ctx) { return visitChildren(ctx); }

	@Override public T visitPlus(LogoParser.PlusContext ctx) { return visitChildren(ctx); }

	@Override public T visitMinus(LogoParser.MinusContext ctx) { return visitChildren(ctx); }

	@Override public T visitAppel_proc(LogoParser.Appel_procContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(LogoParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitRepete(LogoParser.RepeteContext ctx) { return visitChildren(ctx); }

	@Override public T visitParent(LogoParser.ParentContext ctx) { return visitChildren(ctx); }

	@Override public T visitNeg_id(LogoParser.Neg_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_ou(LogoParser.Bool_ouContext ctx) { return visitChildren(ctx); }

	@Override public T visitMul(LogoParser.MulContext ctx) { return visitChildren(ctx); }

	@Override public T visitAv(LogoParser.AvContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpr_affect(LogoParser.Expr_affectContext ctx) { return visitChildren(ctx); }

	@Override public T visitAffect_id_int(LogoParser.Affect_id_intContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgramme(LogoParser.ProgrammeContext ctx) { return visitChildren(ctx); }

	@Override public T visitBloc(LogoParser.BlocContext ctx) { return visitChildren(ctx); }

	@Override public T visitSi_sinon(LogoParser.Si_sinonContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_vrai(LogoParser.Bool_vraiContext ctx) { return visitChildren(ctx); }

	@Override public T visitFpos(LogoParser.FposContext ctx) { return visitChildren(ctx); }

	@Override public T visitLc(LogoParser.LcContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpr_cond(LogoParser.Expr_condContext ctx) { return visitChildren(ctx); }

	@Override public T visitFcc(LogoParser.FccContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool_parent(LogoParser.Bool_parentContext ctx) { return visitChildren(ctx); }
}