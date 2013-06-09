package logoparsing;

import java.util.Random;

import org.antlr.v4.parse.ANTLRParser.atom_return;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

import tools.Noeud;
import tools.Operateur;
import tools.Procedure;
import tools.TableDesProcedures;
import tools.TableDesSymboles;
import tools.TypeNoeud;
import logogui.Log;
import logogui.Traceur;
import logoparsing.LogoParser.Affect_id_boolContext;
import logoparsing.LogoParser.Affect_id_intContext;
import logoparsing.LogoParser.Affect_localeContext;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.BcContext;
import logoparsing.LogoParser.Bool_etContext;
import logoparsing.LogoParser.Bool_fauxContext;
import logoparsing.LogoParser.Bool_op_arithmContext;
import logoparsing.LogoParser.Bool_op_boolContext;
import logoparsing.LogoParser.Bool_ouContext;
import logoparsing.LogoParser.Bool_parentContext;
import logoparsing.LogoParser.Bool_vraiContext;
import logoparsing.LogoParser.DivContext;
import logoparsing.LogoParser.Expr_affectContext;
import logoparsing.LogoParser.Expr_condContext;
import logoparsing.LogoParser.FccContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.HasardContext;
import logoparsing.LogoParser.IdContext;
import logoparsing.LogoParser.Id_boolContext;
import logoparsing.LogoParser.IntContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.LoopContext;
import logoparsing.LogoParser.MinusContext;
import logoparsing.LogoParser.MulContext;
import logoparsing.LogoParser.NegContext;
import logoparsing.LogoParser.ParentContext;
import logoparsing.LogoParser.PlusContext;
import logoparsing.LogoParser.ProcedureContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.RepeteContext;
import logoparsing.LogoParser.Si_sinonContext;
import logoparsing.LogoParser.TanqueContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.VeContext;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Noeud> atts = new ParseTreeProperty<Noeud>();

	public LogoTreeVisitor() {
		super();
	}
	public void initialize(java.awt.Graphics g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	
	public void setAttValue(ParseTree node, Noeud value) { 
		atts.put(node, value);
	}
	
	public Noeud getAttValue(ParseTree node) { return atts.get(node); }
	
	/*
	 * 
	 * Commandes Logo
	 * 
	 */
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		//TO DO
		//Remplacer visitChildren par visitExpr_arithmetique() pour gérer les cas
		//d'erreurs en fonction du code de retour de la fonction visit...
		//pour les cas ou les variables n'existes pas ou alors si LOOP est utilisé au
		//mauvais endroit
		setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
		traceur.avance(getAttValue(ctx.expr_arithmetique()).getChiffre());
		return 0;
	}
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
		traceur.td(getAttValue(ctx.expr_arithmetique()).getChiffre());
		return 0;
	}
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
		traceur.tg(getAttValue(ctx.expr_arithmetique()).getChiffre());
		return 0;
	}
	@Override
	public Integer visitLc(LcContext ctx) {
		visitChildren(ctx);
		traceur.lc();
		return 0;
	}
	@Override
	public Integer visitBc(BcContext ctx) {
		visitChildren(ctx);
		traceur.bc();
		return 0;
	}
	
	@Override
	public Integer visitVe(VeContext ctx) {
		visitChildren(ctx);
		traceur.ve();
		return 0;
	}
	
	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
		traceur.re(getAttValue(ctx.expr_arithmetique()).getChiffre());
		return 0;
	}
	
	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);

		setAttValue(ctx.expr_arithmetique(0), getAttValue(ctx.expr_arithmetique(0)));
		setAttValue(ctx.expr_arithmetique(1), getAttValue(ctx.expr_arithmetique(1)));
		
		traceur.fpos(getAttValue(ctx.expr_arithmetique().get(0)).getChiffre(), getAttValue(ctx.expr_arithmetique().get(1)).getChiffre());
		return 0;
	}
	
	public Integer visitFcc(FccContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
		traceur.fcc(getAttValue(ctx.expr_arithmetique()).getChiffre());
		return 0;
	}

	public Integer visitExpr_cond(Expr_condContext ctx){
		visitChildren(ctx);
		setAttValue(ctx, getAttValue(ctx.expr_conditionnelle()));
		return 0;	
	}
	
	public Integer visitExpr_affect(Expr_affectContext ctx){
		visitChildren(ctx);
		setAttValue(ctx, getAttValue(ctx.expr_affectation()));
		return 0;
	}
	
	public Integer visitAffect_locale(Affect_localeContext ctx){
		visitChildren(ctx);
		//Récupére l'id
		String id = ctx.ID().getText();
		//Met à jour la table des symboles
		TableDesSymboles.getInstance().ajouterSymbole(id, null);
		return 0;
	}
	
	/*
	 *
	 * Expressions arithmétiques
	 * 
	 */
	
	public Integer visitMul(MulContext ctx) {
		visitChildren(ctx);
		Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() * getAttValue(ctx.expr_arithmetique(1)).getChiffre());
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitDiv(DivContext ctx) {
		visitChildren(ctx); 
		Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() / getAttValue(ctx.expr_arithmetique(1)).getChiffre());
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitPlus(PlusContext ctx) {
		visitChildren(ctx);
		Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() + getAttValue(ctx.expr_arithmetique(1)).getChiffre());
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitMinus(MinusContext ctx) {
		visitChildren(ctx);
		Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() - getAttValue(ctx.expr_arithmetique(1)).getChiffre());
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitHasard(HasardContext ctx) {
		visitChildren(ctx);
		Noeud n = new Noeud((int)(Math.random() * (getAttValue(ctx.expr_arithmetique()).getChiffre())));
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitInt(IntContext ctx) {
		visitChildren(ctx);
		String op1Text = ctx.INT().getText();
		Noeud n = new Noeud(Integer.valueOf(op1Text));
		setAttValue(ctx, n);
		return 0;
	}

	public Integer visitNeg(NegContext ctx) {
		visitChildren(ctx);
		String op1Text = ctx.INT().getText();
		Noeud n = new Noeud(-Integer.valueOf(op1Text));
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitId(IdContext ctx) {
		try{
			visitChildren(ctx);
			String op1Text = ctx.ID().getText();
			Noeud n = new Noeud(TableDesSymboles.getInstance().getSymbole(op1Text).getChiffre());
			setAttValue(ctx, n);
		} catch (Exception e) { 
			System.out.println(e.toString());
			Log.getInstance().getLogZone().append(e.toString());
			return 1;
		}
		return 0;
	}
	
	public Integer visitParent(ParentContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, getAttValue(ctx.expr_arithmetique()));
		return 0;
	}
	
	public Integer visitLoop(LoopContext ctx) {
		visitChildren(ctx);
		try{
			Noeud n = TableDesSymboles.getInstance().getSymbole("LOOP");
			setAttValue(ctx, n);
		} catch (Exception e) { 
			System.out.println("Exception reçue: LOOP est utilisé en dehors de son contexte de boucle");
			return 1;
		}
		return 0;
	}
	
	public Integer visitProcedure(ProcedureContext ctx) {
		//Création de l'objet procédure
		
		String nomFonction = ctx.ID().getText();
		
		ArrayList<String> params = new ArrayList<String>();
		
		for(int i = 0; i < ctx.liste_params().getChildCount(); i++){
			if(!ctx.liste_params().getChild(i).getText().matches(":")){
				System.out.println(ctx.liste_params().getChild(i).getText());
				params.add(ctx.liste_params().getChild(i).getText());
			}
		}
		
		Procedure f = new Procedure(nomFonction, params, ctx.liste_instructions());
		
		TableDesProcedures.getInstance().ajouterProcedure(f);
		
		return 0;
	}
	
//	public Integer visitAppel_procedure(Appel_procedureContext ctx) {
//		visitChildren(ctx);
//		
//		String nomFonction = ctx.ID().getText();
//		
//		int arite = 0;
//		ArrayList<Noeud> valeurs = new ArrayList<Noeud>();
//		//Calcul de l'arité et mémorisation de la valeur des paramètres
//		for(int i = 0; i < ctx.liste_appel().getChildCount(); i++){
//			if(!ctx.getChild(i).getText().matches(":")){
//				arite++;
//				System.out.println("Value " + getAttValue(ctx.liste_appel().getChild(i)));
//				valeurs.add(getAttValue(ctx.liste_appel().getChild(i)));	
//			}
//		}
//		//Récupération de la fonction pour l'exécuter si elle existe
//		try {
//			Fonction f = TableDesFonctions.getInstance().getFonction(nomFonction, arite);
//			//Création du contexte d'appel
//			TableDesSymboles.getInstance().nouveauContext();
//			TableDesSymboles.getInstance().copieContext();
//			
//			//Création des paramètres de la fonction en table des symboles
//			ArrayList<String> params = f.getParams();
//			for(int i = 0; i < f.getArite(); i++){
//					System.out.println(params.get(i) + "<-" + valeurs.get(i));
//					TableDesSymboles.getInstance().ajouterSymbole(params.get(i), valeurs.get(i));
//			}	
//			
//			//Execution de la fonction
//			visit(f.getCorps());
//			
//			//Restitution de l'ancien contexte
//			TableDesSymboles.getInstance().restaurerContext();
//			
//		} catch (Exception e) {
//			System.out.println(e.toString());
//			Log.getInstance().getLogZone().append(e.toString());
//			return 1;
//		}
//		return 0;
//	}
	/* 
	 * Expressions Booléennes
	 */
	
	public Integer visitBool_parent(Bool_parentContext ctx) {
		visitChildren(ctx);
		setAttValue(ctx, getAttValue(ctx.expr_booleene()));
		return 0;
	}
	
	public Integer visitBool_et(Bool_etContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.expr_booleene(0)).getBooleen() && getAttValue(ctx.expr_booleene(1)).getBooleen() ? true : false);
		Noeud n = new Noeud(val);
		setAttValue(ctx, n);
		return 0;
	} 

	public Integer visitBool_ou(Bool_ouContext ctx) {
		visitChildren(ctx);
		boolean val = ((getAttValue(ctx.expr_booleene(0)).getBooleen()) || (getAttValue(ctx.expr_booleene(1)).getBooleen())) ? true : false;
		Noeud n = new Noeud(val);
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitBool_op_bool(Bool_op_boolContext ctx) {
		visitChildren(ctx);
		Operateur op = new Operateur(ctx.OP_BOOL().getText());
		boolean val = false;
		switch (op.getOpCode()){
		case EGAL:
			val = getAttValue(ctx.expr_booleene(0)).getBooleen() == getAttValue(ctx.expr_booleene(1)).getBooleen() ? true : false;
			break;
		case DIFF:
			val = getAttValue(ctx.expr_booleene(0)).getBooleen() != getAttValue(ctx.expr_booleene(1)).getBooleen() ? true : false;
			break;
		default:
			break;
		}
		Noeud n = new Noeud(val);
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitBool_op_arithm(Bool_op_arithmContext ctx) {
		visitChildren(ctx);
		Operateur op = new Operateur(ctx.OP_INT().toString());
		boolean val = op.appliqueOperateur(getAttValue(ctx.expr_arithmetique(0)), getAttValue(ctx.expr_arithmetique(1)));
		Noeud n = new Noeud(val);
		setAttValue(ctx, n);
		return 0;
	}
	public Integer visitBool_vrai(Bool_vraiContext ctx){
		visitChildren(ctx);
		Noeud n = new Noeud(true);
		setAttValue(ctx, n);
		return 0;
	}
	
	public Integer visitBool_faux(Bool_fauxContext ctx){
		visitChildren(ctx);
		Noeud n = new Noeud(false);
		setAttValue(ctx, n);
		return 0;	
	}

	public Integer visitId_bool(Id_boolContext ctx) {
		try{
			visitChildren(ctx);
			String op1Text = ctx.ID().getText();
			Noeud n = new Noeud(TableDesSymboles.getInstance().getSymbole(op1Text).getChiffre());
			setAttValue(ctx, n);
		} catch (Exception e) { 
			System.out.println(e.toString());
			Log.getInstance().getLogZone().append(e.toString());
			return 1;
		}
		return 0;
	}

	/* 
	 * Expressions Conditionnelles
	 */
	
	public Integer visitSi_sinon(Si_sinonContext ctx){
		//On ne visite que l'expression booléenne
		visit(ctx.expr_booleene());
		Noeud n = new Noeud(getAttValue(ctx.expr_booleene()).getBooleen());
	
		//Mémorise le contexte précédent et en offre un nouveau
		TableDesSymboles.getInstance().nouveauContext();
		if (n.getBooleen()){
			//Si la condition est vérifiée on execute le premier bloc
			visit(ctx.bloc(0));
			setAttValue(ctx, getAttValue(ctx.bloc(0)));	
		} else {
			//Sinon on explore l'autre bloc si il existe
			if(ctx.bloc().size() == 2){
				visit(ctx.bloc(1));
				setAttValue(ctx, getAttValue(ctx.bloc(1)));	
			}
		}
		TableDesSymboles.getInstance().restaurerContext();
		return 0;	
	}
	
	public Integer visitRepete(RepeteContext ctx){
		visit(ctx.expr_arithmetique());
		int n = getAttValue((ctx.expr_arithmetique())).getChiffre();
		//variable locale LOOP
		int loop = 1;
		//Mémorise le contexte précédent et en offre un nouveau
		TableDesSymboles.getInstance().nouveauContext();
		for (int i=0 ; i < n; i++){
			TableDesSymboles.getInstance().ajouterSymbole("LOOP", new Noeud(loop));
			//On itére n fois
			visit(ctx.bloc());
			setAttValue(ctx, getAttValue(ctx.bloc()));
			loop++;
		}
		TableDesSymboles.getInstance().supprimerSymbole("LOOP");
		TableDesSymboles.getInstance().restaurerContext();
		return 0;
	}
	
	public Integer visitTanque(TanqueContext ctx){
		visit(ctx.expr_booleene());
		boolean b = getAttValue(ctx.expr_booleene()).getBooleen();
		//Mémorise le contexte précédent et en offre un nouveau
		TableDesSymboles.getInstance().nouveauContext();
		while (b){
			//On itére n fois
			visit(ctx.bloc());
			setAttValue(ctx, getAttValue(ctx.bloc()));	
		}
		TableDesSymboles.getInstance().restaurerContext();
		return 0;
	}
	
	/* 
	 * Expressions d'affectation
	 */
	
	public Integer visitAffect_id_int(Affect_id_intContext ctx){
		visitChildren(ctx);
		//Constitue la paire <id, symbole>
		String id = ctx.ID().getText();
		Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique()).getChiffre());
		
		//Met à jour la table des symboles
		TableDesSymboles.getInstance().ajouterSymbole(id, n);
		//Marque l'arbre
		Noeud n2 = new Noeud(id,TypeNoeud.INTEGER);
		setAttValue(ctx, n2);
		return 0;
	}
	
	public Integer visitAffect_id_bool(Affect_id_boolContext ctx){
		visitChildren(ctx);
		//Constitue la paire <id, symbole>
		String id = ctx.ID().getText();
		Noeud n = new Noeud(getAttValue(ctx.expr_booleene()).getBooleen());
		
		//Met à jour la table des symboles
		TableDesSymboles.getInstance().ajouterSymbole(id, n);
	
		//Marque l'arbre
		Noeud n2 = new Noeud(id,TypeNoeud.BOOLEAN);
		setAttValue(ctx, n2);
		return 0;
	}
}
 