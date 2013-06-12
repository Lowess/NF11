package logoparsing;

import java.util.Random;

import org.antlr.v4.parse.ANTLRParser.atom_return;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

import tools.ContextManager;
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
import logoparsing.LogoParser.Appel_foncContext;
import logoparsing.LogoParser.Appel_procContext;
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
import logoparsing.LogoParser.Expr_arithmetiqueContext;
import logoparsing.LogoParser.Expr_booleeneContext;
import logoparsing.LogoParser.Expr_condContext;
import logoparsing.LogoParser.FccContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.HasardContext;
import logoparsing.LogoParser.IdContext;
import logoparsing.LogoParser.Id_boolContext;
import logoparsing.LogoParser.IntContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.Liste_appelContext;
import logoparsing.LogoParser.LoopContext;
import logoparsing.LogoParser.MinusContext;
import logoparsing.LogoParser.MulContext;
import logoparsing.LogoParser.NegContext;
import logoparsing.LogoParser.Neg_idContext;
import logoparsing.LogoParser.ParentContext;
import logoparsing.LogoParser.PlusContext;
import logoparsing.LogoParser.ProcedureContext;
import logoparsing.LogoParser.RcContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.RepeteContext;
import logoparsing.LogoParser.RetContext;
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
	 ************************************************************************************************************** 
	 * Commandes Logo
	 ************************************************************************************************************** 
	 */
	
	@Override
	public Integer visitAv(AvContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:
				setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
				traceur.avance(getAttValue(ctx.expr_arithmetique()).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitRc(RcContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
				traceur.avance(-getAttValue(ctx.expr_arithmetique()).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitTd(TdContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
				traceur.td(getAttValue(ctx.expr_arithmetique()).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitTg(TgContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
				traceur.tg(getAttValue(ctx.expr_arithmetique()).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitLc(LcContext ctx) {
		traceur.lc();
		return 0;	
	}
	@Override
	public Integer visitBc(BcContext ctx) {
		traceur.bc();
		return 0;
	}
	
	@Override
	public Integer visitVe(VeContext ctx) {
		traceur.ve();
		return 0;
	}
	
	@Override
	public Integer visitRe(ReContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
				traceur.re(getAttValue(ctx.expr_arithmetique()).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}
	
	@Override
	public Integer visitFpos(FposContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx.expr_arithmetique(0), getAttValue(ctx.expr_arithmetique(0)));
				setAttValue(ctx.expr_arithmetique(1), getAttValue(ctx.expr_arithmetique(1)));
				traceur.fpos(getAttValue(ctx.expr_arithmetique().get(0)).getChiffre(), getAttValue(ctx.expr_arithmetique().get(1)).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;		
	}

	@Override
	public Integer visitFcc(FccContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx.expr_arithmetique(), getAttValue(ctx.expr_arithmetique()));
				traceur.fcc(getAttValue(ctx.expr_arithmetique()).getChiffre());
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitExpr_cond(Expr_condContext ctx){
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx, getAttValue(ctx.expr_conditionnelle()));
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitExpr_affect(Expr_affectContext ctx){
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx, getAttValue(ctx.expr_affectation()));
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitAffect_locale(Affect_localeContext ctx){
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				//Récupére l'id
				String id = ctx.ID().getText();
				//Met à jour la table des symboles
				ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(id, null);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}
	
	/*
	 **************************************************************************************************************
	 * Expressions arithmétiques
	 **************************************************************************************************************
	 */

	@Override
	public Integer visitMul(MulContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() * getAttValue(ctx.expr_arithmetique(1)).getChiffre());
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}		

	@Override
	public Integer visitDiv(DivContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() / getAttValue(ctx.expr_arithmetique(1)).getChiffre());
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}
	
	@Override
	public Integer visitPlus(PlusContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() + getAttValue(ctx.expr_arithmetique(1)).getChiffre());
				setAttValue(ctx, n);
				ret = 0;				
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}
	

	@Override
	public Integer visitMinus(MinusContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique(0)).getChiffre() - getAttValue(ctx.expr_arithmetique(1)).getChiffre());
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitHasard(HasardContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Noeud n = new Noeud((int)(Math.random() * (getAttValue(ctx.expr_arithmetique()).getChiffre())));
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitInt(IntContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:
				String op1Text = ctx.INT().getText();
				Noeud n = new Noeud(Integer.valueOf(op1Text));
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitNeg(NegContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				String op1Text = ctx.INT().getText();
				Noeud n = new Noeud(-Integer.valueOf(op1Text));
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitNeg_id(Neg_idContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		try{
			switch (code){
				case 0:	
					String op1Text = ctx.ID().getText();
					Noeud n = new Noeud(-ContextManager.getInstance().getTableDesSymboles().getSymbole(op1Text).getChiffre());
					setAttValue(ctx, n);
					ret = 0;
					break;
				default:
					
					ret = 1;
			}
		} catch (Exception e) { 
			System.out.println(e.toString());
			Log.getInstance().getLogZone().append(e.toString());
			ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitId(IdContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:
				try{
					String op1Text = ctx.ID().getText();
					Noeud n = new Noeud(ContextManager.getInstance().getTableDesSymboles().getSymbole(op1Text).getChiffre());
					setAttValue(ctx, n);
					ret = 0;
				} catch (Exception e) { 
					System.out.println(e.toString());
					Log.getInstance().getLogZone().append(e.toString());
					setAttValue(ctx, new Noeud(0));
					ret = 1;
				}
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitParent(ParentContext ctx) {
		Integer code = new Integer(0);
		try{
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx, getAttValue(ctx.expr_arithmetique()));
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;		
	}

	@Override
	public Integer visitLoop(LoopContext ctx) {
		int ret;
		try{
			Noeud n = ContextManager.getInstance().getTableDesSymboles().getSymbole("LOOP");
			setAttValue(ctx, n);
			ret = 0;
		} catch (Exception e) { 
			System.out.println("Exception reçue: LOOP est utilisé en dehors de son contexte de boucle");
			ret = 1;
		}
		return ret;
	}

	@Override
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

	@Override
	public Integer visitAppel_proc(Appel_procContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:		
				String nomFonction = ctx.ID().getText();
				
				int arite = 0;
				ArrayList<Noeud> valeurs = new ArrayList<Noeud>();
				//Calcul de l'arité et mémorisation de la valeur des paramètres
				for(int i = 0; i < ctx.liste_appel().getChildCount(); i++){
					if(!ctx.getChild(i).getText().matches(":")){
						arite++;
						System.out.println("Value " + getAttValue(ctx.liste_appel().getChild(i)));
						valeurs.add(getAttValue(ctx.liste_appel().getChild(i)));	
					}
				}
				//Récupération de la fonction pour l'exécuter si elle existe
				try {
					Procedure f = TableDesProcedures.getInstance().getFonction(nomFonction, arite);
					//Création du contexte d'appel
					ContextManager.getInstance().nouveauContextFonctionnel();
					ContextManager.getInstance().getTableDesSymboles().nouveauContext();
					
					//Création des paramètres de la fonction en table des symboles
					ArrayList<String> params = f.getParams();
					for(int i = 0; i < f.getArite(); i++){
						//Permet de créer des variables locales
						ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(params.get(i), null);
						//Permet de créer d'affecter les variables locales
						ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(params.get(i), valeurs.get(i));
					}	
					
					//Execution de la fonction
					Integer code2 = new Integer(visit(f.getCorps()));
					
					//Restitution de l'ancien contexte
					ContextManager.getInstance().getTableDesSymboles().restaurerContext();
					ContextManager.getInstance().restaurerContextFonctionnel();
					
					ret = 0;
					
				} catch (Exception e) {
					System.out.println(e.toString());
					Log.getInstance().getLogZone().append(e.toString());
					setAttValue(ctx, new Noeud(0));
					ret = 0;
				}
				break;	
			default:
				ret = 1;
		}			
		return ret;	
	}

	@Override
	public Integer visitRet(RetContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:
				setAttValue(ctx, getAttValue(ctx.expr_arithmetique()));
				ContextManager.getInstance().getTableDesSymboles().ajouterSymbole("RET", null);
				ContextManager.getInstance().getTableDesSymboles().ajouterSymbole("RET", getAttValue(ctx.expr_arithmetique()));
				ret = 0;
			default:
				
				ret = 1;
		}			
		return ret;
	}

	public Integer visitAppel_fonc(Appel_foncContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:		
				String nomFonction = ctx.ID().getText();
				
				int arite = 0;
				ArrayList<Noeud> valeurs = new ArrayList<Noeud>();
				//Calcul de l'arité et mémorisation de la valeur des paramètres
				for(int i = 0; i < ctx.liste_appel().getChildCount(); i++){
					if(!ctx.getChild(i).getText().matches(":")){
						arite++;
						System.out.println("Value " + getAttValue(ctx.liste_appel().getChild(i)));
						valeurs.add(getAttValue(ctx.liste_appel().getChild(i)));	
					}
				}
				//Récupération de la fonction pour l'exécuter si elle existe
				try {
					Procedure f = TableDesProcedures.getInstance().getFonction(nomFonction, arite);
					//Création du contexte d'appel
					ContextManager.getInstance().nouveauContextFonctionnel();					
					ContextManager.getInstance().getTableDesSymboles().nouveauContext();
					
					
					//Création des paramètres de la fonction en table des symboles
					ArrayList<String> params = f.getParams();
					for(int i = 0; i < f.getArite(); i++){
						//Permet de créer des variables locales
						ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(params.get(i), null);
						//Permet de créer d'affecter les variables locales
						ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(params.get(i), valeurs.get(i));
					}	
					
					//Execution de la fonction
					Integer code2 = new Integer(visit(f.getCorps()));
				
					//Marquage du noeud avec la variable RET
					setAttValue(ctx, ContextManager.getInstance().getTableDesSymboles().getSymbole("RET"));
					
					//Restitution de l'ancien contexte
					ContextManager.getInstance().getTableDesSymboles().restaurerContext();
					ContextManager.getInstance().restaurerContextFonctionnel();
				
					ret = 0;
					
				} catch (Exception e) {
					System.out.println(e.toString());
					Log.getInstance().getLogZone().append(e.toString());
					setAttValue(ctx, new Noeud(0));
					ret = 0;
				}
				break;	
			default:
				
				ret = 1;
		}			
		return ret;	
	}

	

	/* 
	 ***************************************************************************************************************
	 * Expressions Booléennes
	 ***************************************************************************************************************
	 */

	@Override
	public Integer visitBool_parent(Bool_parentContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				setAttValue(ctx, getAttValue(ctx.expr_booleene()));
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;			
	}

	@Override
	public Integer visitBool_et(Bool_etContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				boolean val = (getAttValue(ctx.expr_booleene(0)).getBooleen() && getAttValue(ctx.expr_booleene(1)).getBooleen() ? true : false);
				Noeud n = new Noeud(val);
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	} 

	@Override
	public Integer visitBool_ou(Bool_ouContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				boolean val = ((getAttValue(ctx.expr_booleene(0)).getBooleen()) || (getAttValue(ctx.expr_booleene(1)).getBooleen())) ? true : false;
				Noeud n = new Noeud(val);
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}
	
	@Override
	public Integer visitBool_op_bool(Bool_op_boolContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Operateur op = new Operateur(ctx.OP_BOOL().getText());
				boolean val = false;
				switch (op.getOpCode()){
					case EGAL:
						try{
							val = getAttValue(ctx.expr_booleene(0)).getBooleen() == getAttValue(ctx.expr_booleene(1)).getBooleen() ? true : false;
						} catch (Exception e){
							try{
								val = getAttValue(ctx.expr_booleene(0)).getChiffre() == getAttValue(ctx.expr_booleene(1)).getChiffre() ? true : false;	
							} catch (Exception e2){
								Log.getInstance().getLogZone().append("L'opération de '=' est impossible (types incompatibles)\n");
							}
						}
						break;
					case DIFF:
						//N'exista pas en LOGO
						//val = getAttValue(ctx.expr_booleene(0)).getBooleen() != getAttValue(ctx.expr_booleene(1)).getBooleen() ? true : false;
						break;
					default:
						break;
					}
				Noeud n = new Noeud(val);
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitBool_op_arithm(Bool_op_arithmContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Operateur op = new Operateur(ctx.OP_INT().toString());
				boolean val = op.appliqueOperateur(getAttValue(ctx.expr_arithmetique(0)), getAttValue(ctx.expr_arithmetique(1)));
				Noeud n = new Noeud(val);
				setAttValue(ctx, n);
				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitBool_vrai(Bool_vraiContext ctx){
		Noeud n = new Noeud(true);
		setAttValue(ctx, n);
		return 0;
	}

	@Override
	public Integer visitBool_faux(Bool_fauxContext ctx){
		Noeud n = new Noeud(false);
		setAttValue(ctx, n);
		return 0;
	}

	@Override
	public Integer visitId_bool(Id_boolContext ctx) {
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				try{
					String op1Text = ctx.ID().getText();
					Noeud n = new Noeud(ContextManager.getInstance().getTableDesSymboles().getSymbole(op1Text).getChiffre());
					setAttValue(ctx, n);
					ret = 0;
				} catch (Exception e) { 
					System.out.println(e.toString());
					Log.getInstance().getLogZone().append(e.toString());
					ret = 0;
				}
				break;
			default:
				ret = 1;
		}
		return ret;
	}

	/*
	 ***************************************************************************************************************
	 * Expressions Conditionnelles
	 ***************************************************************************************************************
	 */

	@Override
	public Integer visitSi_sinon(Si_sinonContext ctx){
		//On ne visite que l'expression booléenne
		Integer code;
		try {
			code = new Integer(visit(ctx.expr_booleene()));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Noeud n = new Noeud(getAttValue(ctx.expr_booleene()).getBooleen());
				//Mémorise le contexte précédent et en offre un nouveau
				ContextManager.getInstance().getTableDesSymboles().nouveauContext();
				if (n.getBooleen()){
					//Si la condition est vérifiée on execute le premier bloc  	
					Integer code2;
					try {
						code2 = new Integer(visit(ctx.bloc(0)));
					} catch (NullPointerException e){
						code2 = new Integer(0);
					}
					
					switch (code2){
						case 0:	
							setAttValue(ctx, getAttValue(ctx.bloc(0)));
							ret = 0;
							break;
						default:
							
							ret = 1;
					}						
				} else {
					//Sinon on explore l'autre bloc si il existe
					if(ctx.bloc().size() == 2){
						Integer code2;
						try {
							code2 = new Integer(visit(ctx.bloc(1)));
						} catch (NullPointerException e){
							code2 = new Integer(0);
						}
						
						switch (code2){
							case 0:	
								setAttValue(ctx, getAttValue(ctx.bloc(1)));	
								ret = 0;
								break;
							default:
								
								ret = 1;
						}
					}
				}
				ContextManager.getInstance().getTableDesSymboles().restaurerContext();
				break;
			default:
				
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitRepete(RepeteContext ctx){
		Integer code;
		try {
			code = new Integer(visit(ctx.expr_arithmetique()));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				int n = getAttValue((ctx.expr_arithmetique())).getChiffre();
				//variable locale LOOP
				int loop = 1;
				//Mémorise le contexte précédent et en offre un nouveau
				Integer code2 = null;
				ContextManager.getInstance().getTableDesSymboles().nouveauContext();
				for (int i=0 ; i < n; i++){
					ContextManager.getInstance().getTableDesSymboles().ajouterSymbole("LOOP", null);
					ContextManager.getInstance().getTableDesSymboles().ajouterSymbole("LOOP", new Noeud(loop));
					//On itére n fois
					visit(ctx.bloc());
					setAttValue(ctx, getAttValue(ctx.bloc()));
					loop++;
					ret = 0;
				}
				ContextManager.getInstance().getTableDesSymboles().supprimerSymbole("LOOP");
				ContextManager.getInstance().getTableDesSymboles().restaurerContext();
				break;
			default:
				ret = 1;
		}
		return ret;
	}

	@Override
	public Integer visitTanque(TanqueContext ctx){
		Integer code;
		try {
			code = new Integer(visit(ctx.expr_booleene()));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				Integer code2 = null;
				boolean b = getAttValue(ctx.expr_booleene()).getBooleen();
				//Mémorise le contexte précédent et en offre un nouveau
				ContextManager.getInstance().getTableDesSymboles().nouveauContext();
				while (b){
					//On itére n fois
					code2 = new Integer(visit(ctx.bloc()));
					switch (code2){
						case 0:
							setAttValue(ctx, getAttValue(ctx.bloc()));
							ret = 0;
							break;
						default:		
							ret = 1;	
					}	
				}
				ContextManager.getInstance().getTableDesSymboles().restaurerContext();
				break;
			default:
				ret = 1;
		}
		return ret;
	}
	
	/* 
	 ***************************************************************************************************************
	 * Expressions d'affectation
	 ***************************************************************************************************************
	 */

	@Override
	public Integer visitAffect_id_int(Affect_id_intContext ctx){
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				//Constitue la paire <id, symbole>
				String id = ctx.ID().getText();
				Noeud n = new Noeud(getAttValue(ctx.expr_arithmetique()).getChiffre());
				
				//Met à jour la table des symboles
				ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(id, n);
				
				//Marque l'arbre
				Noeud n2 = new Noeud(id,TypeNoeud.INTEGER);
				setAttValue(ctx, n2);
				
				ret = 0;
				break;
			default:	
				ret = 1;
		}
		return ret;		
	}

	@Override
	public Integer visitAffect_id_bool(Affect_id_boolContext ctx){
		Integer code;
		try {
			code = new Integer(visitChildren(ctx));
		} catch (NullPointerException e){
			code = new Integer(0);
		}
		Integer ret = new Integer(0);
		switch (code){
			case 0:	
				//Constitue la paire <id, symbole>
				String id = ctx.ID().getText();
				Noeud n = new Noeud(getAttValue(ctx.expr_booleene()).getBooleen());
				
				//Met à jour la table des symboles
				ContextManager.getInstance().getTableDesSymboles().ajouterSymbole(id, n);
			
				//Marque l'arbre
				Noeud n2 = new Noeud(id,TypeNoeud.BOOLEAN);
				setAttValue(ctx, n2);

				ret = 0;
				break;
			default:
				
				ret = 1;
		}
		return ret;		
	}
}