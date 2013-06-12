package tools;

import java.util.HashMap;
import java.util.Stack;

public class ContextManager {
	/**
	 * Permet de m�moriser les contextes de variables locales 
	 * lors de l'entr�e dans une boucle, une condition ou une
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
		//Empile la premi�re table des symboles
		context.push(tableDesSymboles);
	}
	
	/**
	 * R�cup�re l'instance de Table des symboles.
	 * Si elle n'existe pas, elle est cr�e, sinon
	 * elle est retourn�e
	 * @return La Table des symboles
	 */
	public static ContextManager getInstance(){
		if(instance == null){
			instance = new ContextManager();
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
		
	public TableDesSymboles getTableDesSymboles() {
		return tableDesSymboles;
	}

	public void nouveauContextFonctionnel(){
		//Les contextes m�morisent des TablesDesSymboles
		tableDesSymboles = new TableDesSymboles();
		context.push(tableDesSymboles);
	}
		
	/**
	 * D�pile le contexte de variables locales et
	 * r�affecte l'ancien contexte au Map "locales"
	 */
	public void restaurerContextFonctionnel(){
		//Destruction du contexte
		context.pop();
		//Pointe sur le contexte de sommet de pile
		tableDesSymboles = context.peek();
	}
	
}
