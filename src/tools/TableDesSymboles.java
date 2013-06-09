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
	 * Permet de m�moriser les contextes de variables locales 
	 * lors de l'entr�e dans une boucle, une condition ou une
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
	 * R�cup�re l'instance de Table des symboles.
	 * Si elle n'existe pas, elle est cr�e, sinon
	 * elle est retourn�e
	 * @return La Table des symboles
	 */
	public static TableDesSymboles getInstance(){
		if(instance == null){
			instance = new TableDesSymboles();
		}
		return instance;
	}
	
	/**
	 * D�truit la Table des symboles si elle existe
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
		//Cr�e la table des symboles
		symboles = new HashMap<String, Noeud>();
		
		//Cr�e la table des symboles de variables locales
		locales = new HashMap<String, Noeud>();
				
		//Cr�e la pile contextuelle
		context = new Stack<HashMap<String, Noeud>>();
		
		context.push(locales);
	}
	
	/**
	 * Ajoute ou met � jour une variable � la Table des symboles.
	 * Cette m�thode distingue si la variables est globale ou locale
	 * et l'ins�re dans le Map correspondant
	 * @param id Nom de la variable
	 * @param n Noeud point� par la variable
	 */
	public void ajouterSymbole(String id, Noeud n){
		//R�cup�ration de la variable
		try{
			//MISE A JOUR D UN SYMBOLE EXISTANT
			getSymbole(id);
			//Si la variable globale existe mais que l'on cr��e 
			//une variable locale alors on privil�gie la variable locale
			if(n == null){
				//Si locale
				System.out.print("TableDesSymboles cr�ation de variables LOCALES: ");
				Log.getInstance().getLogZone().append("Variable locale " + id + " cr��e\r\n");
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
				System.out.println("L'identifiant " + id + " vient d'�tre mis � jour dans la table des symboles");
			}
		} catch (Exception e) {
			//CREATION D UN NOUVEAU SYMBOLE
			if(n == null){
				//Si locale
				System.out.print("TableDesSymboles cr�ation de variables LOCALES: ");
				Log.getInstance().getLogZone().append("Variable locale " + id + " cr��e\r\n");
				locales.put(id, n);
			} else {
				//Si globale
				//Cas particulier du LOOP � mettre en LOCALE
				if(id == "LOOP"){
					System.out.print("TableDesSymboles cr�ation de variables LOCALES: ");
					Log.getInstance().getLogZone().append("Variable locale " + id + " cr��e\r\n");
					locales.put(id, n);
				} else {
					System.out.print("TableDesSymboles cr�ation de variables GLOBALES: ");
					Log.getInstance().getLogZone().append("Variable globale " + id + " cr��e\r\n");
					symboles.put(id, n);
				}
			} 		
			System.out.println("L'identifiant " + id + " vient d'�tre ajout� � la table des symboles");
		}
		System.out.println("LOCALES: " + locales.size() + " GLOBALES " + symboles.size());
	}

	/**
	 * Supprime la variable "id" de la Table des symboles
	 * @param id Nom de la variable
	 */
	public void supprimerSymbole(String id){
		System.out.println("L'identifiant " + id + " vient d'�tre supprim� de la table des symboles");
		//tentative de suppression en locale
		try {
			locales.remove(id);
		} catch (Exception e){
			//Si echec tantative en global
			try {
				symboles.remove(id);	
			} catch (Exception e2){
				//Si echec exception
				System.out.println("L'identifiant " + id + " ne peux �tre supprim�");
			}
		}
	}
	
	/**
	 * Retourne le noeud point� par la variable "id" contenu
	 * dans la Table des symboles.
	 * @param id Nom de la variable
	 * @return Noeud point� par la variable "id"
	 * @throws Exception Dans le cas ou la variable demand�e
	 * n'existe pas, une exception est �mise
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
				throw new Exception("La variable demand�e n'existe pas\r\n");
			}
		}
		return n;
	}

	/**
	 * Cr�� un nouveau contexte de variables locales vide
	 * en empilant le Map de variable locale
	 */
	public void nouveauContext(){
		System.out.println("Nouveau contexte cr��");
		//Les contextes m�morisent les tables de variables locales
		//context.push(locales);
		locales = new HashMap<String, Noeud>();
		context.push(locales);
		
	}
		
	/**
	 * D�pile le contexte de variables locales et
	 * r�affecte l'ancien contexte au Map "locales"
	 */
	public void restaurerContext(){
		System.out.println("Le contexte a �t� d�truit");
		//Destruction du contexte
		context.pop();
		
		//Pointe sur le contexte de sommet de pile
		locales = context.peek();
	}
}
