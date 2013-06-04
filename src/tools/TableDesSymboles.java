package tools;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


import logogui.Log;

//Implémente le design pattern Singleton

public class TableDesSymboles {
	private Stack<HashMap<String, Noeud>> context;
	
	private HashMap<String, Noeud> symboles;
	private HashMap<String, Noeud> locales;
	private static TableDesSymboles instance;
	
	public static TableDesSymboles getInstance(){
		if(instance == null){
			instance = new TableDesSymboles();
		}
		return instance;
	}
	
	public static void libereInstance(){
		if(instance != null){
			 instance = null;
		}
	}
	
	private TableDesSymboles(){
		//Crée la table des symboles
		symboles = new HashMap<String, Noeud>();
		
		//Crée la table des symboles de variables locales
		locales = new HashMap<String, Noeud>();
				
		//Crée la pile contextuelle
		context = new Stack<HashMap<String, Noeud>>();
	}
	
	public void ajouterSymbole(String id, Noeud n){
		//Récupération de la variable
		try{
			//MISE A JOUR D UN SYMBOLE EXISTANT
			getSymbole(id);
			//Si la variable globale existe mais que l'on créée une variable locale
			//alors on privilégie la variable locale
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
	
	public Noeud getSymbole(String id) throws Exception{
		Noeud n = null;
		//On cherche la variable en locale
		if(locales.containsKey(id)){
			n = locales.get(id);
		} else {
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
	
	public void nouveauContext(){
		System.out.println("Nouveau contexte créé");
		//Les contextes mémorisent les tables de variables locales
		context.push(locales);
		locales = new HashMap<String, Noeud>();
	}
	
	//Copie la table de symboles de variables locales (sauf LOOP) depuis
	//le contexte précédent vers le nouveau contexte
	public void copieContext(){
		Map<String, Noeud> hashMap = context.get(context.size()-1);
		for (String mapKey : hashMap.keySet()) {
			if(mapKey != "LOOP"){
				locales.put(mapKey, hashMap.get(mapKey));
			}
		}
	}
	
	public void restaurerContext(){
		System.out.println("Le contexte a été détruit");
		locales = context.pop();
	}
}
