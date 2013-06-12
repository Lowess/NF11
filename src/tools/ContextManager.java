package tools;

import java.util.HashMap;
import java.util.Stack;

public class ContextManager {
	/**
	 * Permet de mémoriser les contextes de variables locales 
	 * lors de l'entrée dans une boucle, une condition ou une
	 * fonction
	 */
	private Stack<TableDesSymboles> context;
	
	private TableDesSymboles tableDesSymboles;

	/**
	 * Instance ContextManager (DP Singleton)
	 */
	private static ContextManager instance;
	
	
	private ContextManager(){
		tableDesSymboles = new TableDesSymboles();
		context = new Stack<TableDesSymboles>();
		//Empile la première table des symboles
		context.push(tableDesSymboles);
	}
	
	/**
	 * Récupére l'instance de Table des symboles.
	 * Si elle n'existe pas, elle est crée, sinon
	 * elle est retournée
	 * @return La Table des symboles
	 */
	public static ContextManager getInstance(){
		if(instance == null){
			instance = new ContextManager();
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
		
	public TableDesSymboles getTableDesSymboles() {
		return tableDesSymboles;
	}

	public void nouveauContextFonctionnel(){
		//Les contextes mémorisent des TablesDesSymboles
		tableDesSymboles = new TableDesSymboles();
		context.push(tableDesSymboles);
	}
		
	/**
	 * Dépile le contexte de variables locales et
	 * réaffecte l'ancien contexte au Map "locales"
	 */
	public void restaurerContextFonctionnel(){
		//Destruction du contexte
		context.pop();
		//Pointe sur le contexte de sommet de pile
		tableDesSymboles = context.peek();
	}
	
}
