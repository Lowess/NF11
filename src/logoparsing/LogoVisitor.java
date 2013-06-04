
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	T visitBool_et(LogoParser.Bool_etContext ctx);

	T visitNeg(LogoParser.NegContext ctx);

	T visitBool_faux(LogoParser.Bool_fauxContext ctx);

	T visitHasard(LogoParser.HasardContext ctx);

	T visitTg(LogoParser.TgContext ctx);

	T visitDiv(LogoParser.DivContext ctx);

	T visitId_bool(LogoParser.Id_boolContext ctx);

	T visitTd(LogoParser.TdContext ctx);

	T visitRe(LogoParser.ReContext ctx);

	T visitTanque(LogoParser.TanqueContext ctx);

	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	T visitId(LogoParser.IdContext ctx);

	T visitAffect_id_bool(LogoParser.Affect_id_boolContext ctx);

	T visitVe(LogoParser.VeContext ctx);

	T visitLoop(LogoParser.LoopContext ctx);

	T visitBool_op_bool(LogoParser.Bool_op_boolContext ctx);

	T visitBool_op_arithm(LogoParser.Bool_op_arithmContext ctx);

	T visitBc(LogoParser.BcContext ctx);

	T visitProcedure(LogoParser.ProcedureContext ctx);

	T visitAffect_locale(LogoParser.Affect_localeContext ctx);

	T visitPlus(LogoParser.PlusContext ctx);

	T visitMinus(LogoParser.MinusContext ctx);

	T visitInt(LogoParser.IntContext ctx);

	T visitRepete(LogoParser.RepeteContext ctx);

	T visitParent(LogoParser.ParentContext ctx);

	T visitBool_ou(LogoParser.Bool_ouContext ctx);

	T visitMul(LogoParser.MulContext ctx);

	T visitAv(LogoParser.AvContext ctx);

	T visitExpr_affect(LogoParser.Expr_affectContext ctx);

	T visitSi(LogoParser.SiContext ctx);

	T visitAffect_id_int(LogoParser.Affect_id_intContext ctx);

	T visitProgramme(LogoParser.ProgrammeContext ctx);

	T visitBloc(LogoParser.BlocContext ctx);

	T visitSi_sinon(LogoParser.Si_sinonContext ctx);

	T visitBool_vrai(LogoParser.Bool_vraiContext ctx);

	T visitFpos(LogoParser.FposContext ctx);

	T visitLc(LogoParser.LcContext ctx);

	T visitExpr_cond(LogoParser.Expr_condContext ctx);

	T visitFcc(LogoParser.FccContext ctx);

	T visitBool_parent(LogoParser.Bool_parentContext ctx);
}