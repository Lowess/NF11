package tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

import logogui.Log;

/**
 * @author Florian DAMBRINE & Tudor LUCHIANCENCO
 * 
 * NF11 - Table des symboles
 */
public class TableDesSymboles {
	/**
	 * Permet de mémoriser les contextes de variables locales 
	 * lors de l'entrée dans une boucle, une condition ou une
	 * fonction
	 */
	private Stack<HashMap<String, Noeud>> context;
	/**
	 * Map qui contient les variables globales
	 */
	private HashMap<String, Noeud> symboles;
	/**
	 * Map qui contient les variables locales
	 */
	private HashMap<String, Noeud> locales;
	/**
	 * Instance de Table des symboles (DP Singleton)
	 */
	private static TableDesSymboles instance;
	
	/**
	 * Récupére l'instance de Table des symboles.
	 * Si elle n'existe pas, elle est crée, sinon
	 * elle est retournée
	 * @return La Table des symboles
	 */
	public static TableDesSymboles getInstance(){
		if(instance == null){
			instance = new TableDesSymboles();
		}
		return instance;
	}
	
	/**
	 * Détruit la Table des symboles si elle existe
	 */
	public static void libereInstance(){
		if(instance != null){
			 instance = null;
		}
	}
	
	/**
	 * Constructeur de la Table des symboles
	 */
	private TableDesSymboles(){
		//Crée la table des symboles
		symboles = new HashMap<String, Noeud>();
		
		//Crée la table des symboles de variables locales
		locales = new HashMap<String, Noeud>();
				
		//Crée la pile contextuelle
		context = new Stack<HashMap<String, Noeud>>();
		
		context.push(locales);
	}
	
	/**
	 * Ajoute ou met à jour une variable à la Table des symboles.
	 * Cette méthode distingue si la variables est globale ou locale
	 * et l'insére dans le Map correspondant
	 * @param id Nom de la variable
	 * @param n Noeud pointé par la variable
	 */
	public void ajouterSymbole(String id, Noeud n){
		//Récupération de la variable
		try{
			//MISE A JOUR D UN SYMBOLE EXISTANT
			getSymbole(id);
			//Si la variable globale existe mais que l'on créée 
			//une variable locale alors on privilégie la variable locale
			if(n == null){
				//Si locale
				System.out.print("TableDesSymboles création de variables LOCALES: ");
				Log.getInstance().getLogZone().append("Variable locale " + id + " créée\r\n");
				locales.put(id, n);	
			} else {
				//Test si la variables est locale ou globale
				if(locales.containsKey(id)){
					//Si locale
					System.out.print("TableDesSymboles MAJ de variables LOCALES: ");
					Log.getInstance().getLogZone().append("Variable locale " + id + " MAJ\r\n");
					locales.put(id, n);
				} else {
					//Sinon en globale
					System.out.print("TableDesSymboles MAJ de variables GLOBALES: ");
					Log.getInstance().getLogZone().append("Variable globale " + id + " MAJ\r\n");
					symboles.put(id, n);
				}
				System.out.println("L'identifiant " + id + " vient d'être mis à jour dans la table des symboles");
			}
		} catch (Exception e) {
			//CREATION D UN NOUVEAU SYMBOLE
			if(n == null){
				//Si locale
				System.out.print("TableDesSymboles création de variables LOCALES: ");
				Log.getInstance().getLogZone().append("Variable locale " + id + " créée\r\n");
				locales.put(id, n);
			} else {
				//Si globale
				//Cas particulier du LOOP à mettre en LOCALE
				if(id == "LOOP"){
					System.out.print("TableDesSymboles création de variables LOCALES: ");
					Log.getInstance().getLogZone().append("Variable locale " + id + " créée\r\n");
					locales.put(id, n);
				} else {
					System.out.print("TableDesSymboles création de variables GLOBALES: ");
					Log.getInstance().getLogZone().append("Variable globale " + id + " créée\r\n");
					symboles.put(id, n);
				}
			} 		
			System.out.println("L'identifiant " + id + " vient d'être ajouté à la table des symboles");
		}
		System.out.println("LOCALES: " + locales.size() + " GLOBALES " + symboles.size());
	}

	/**
	 * Supprime la variable "id" de la Table des symboles
	 * @param id Nom de la variable
	 */
	public void supprimerSymbole(String id){
		System.out.println("L'identifiant " + id + " vient d'être supprimé de la table des symboles");
		//tentative de suppression en locale
		try {
			locales.remove(id);
		} catch (Exception e){
			//Si echec tantative en global
			try {
				symboles.remove(id);	
			} catch (Exception e2){
				//Si echec exception
				System.out.println("L'identifiant " + id + " ne peux être supprimé");
			}
		}
	}
	
	/**
	 * Retourne le noeud pointé par la variable "id" contenu
	 * dans la Table des symboles.
	 * @param id Nom de la variable
	 * @return Noeud pointé par la variable "id"
	 * @throws Exception Dans le cas ou la variable demandée
	 * n'existe pas, une exception est émise
	 */
	public Noeud getSymbole(String id) throws Exception{
		Noeud n = null;
		//On cherche la variable en locale dans les piles contextuelles
		int l = context.size() - 1;
		boolean flag = false;
		while(l >= 0  && flag == false){
			System.out.println("ICI " + l);
			if(context.get(l).containsKey(id)){
				System.out.println(context.get(l));
				n = context.get(l).get(id);
				flag = true;
			}
			l--;
		}
		if(flag == false){
			//Sinon en global
			if (symboles.containsKey(id)){
				n = symboles.get(id);
			} else {
				System.out.println("EXCEPTION");
				throw new Exception("La variable demandée n'existe pas\r\n");
			}
		}
		return n;
	}

	/**
	 * Créé un nouveau contexte de variables locales vide
	 * en empilant le Map de variable locale
	 */
	public void nouveauContext(){
		System.out.println("Nouveau contexte créé");
		//Les contextes mémorisent les tables de variables locales
		//context.push(locales);
		locales = new HashMap<String, Noeud>();
		context.push(locales);
		
	}
		
	/**
	 * Dépile le contexte de variables locales et
	 * réaffecte l'ancien contexte au Map "locales"
	 */
	public void restaurerContext(){
		System.out.println("Le contexte a été détruit");
		//Destruction du contexte
		context.pop();
		
		//Pointe sur le contexte de sommet de pile
		locales = context.peek();
	}
}
