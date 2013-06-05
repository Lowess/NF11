package tools;

import java.util.HashMap;

public class TableDesFonctions {
	private HashMap<String, Fonction> fonctions;
	
	private static TableDesFonctions instance;
	
	public static TableDesFonctions getInstance(){
		if(instance == null){
			instance = new TableDesFonctions();
		}
		return instance;
	}
	
	public static void libereInstance(){
		if(instance != null){
			 instance = null;
		}
	}
	
	private TableDesFonctions(){
		//Crée la table des symboles
		fonctions = new HashMap<String, Fonction>();
	}
	
	public void ajouterFonction(Fonction f){
		fonctions.put(f.getNom(), f);
	}
}
