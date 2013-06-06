package tools;

import java.util.HashMap;

import logogui.Log;

/**
 * @author Root
 *
 */
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
		//Cr�e la table des symboles
		fonctions = new HashMap<String, Fonction>();
	}
	
	/**
	 * Ajoute une nouvelle fonction dans la Map.
	 * Son identifiant dans la Map sera la concat�nation 
	 * du nom de la fonction avec son arit� : Nomfonction_Arit�
	 * @param f
	 */
	public void ajouterFonction(Fonction f){
		System.out.println("TableDesFonctions: La fonction " + f.getNom() + "(" + f.getArite() + ")" + "a �t� ajout�e");
		Log.getInstance().getLogZone().append("Fonction " + f.getNom() + "(" + f.getArite() + ")" + " connue\r\n");
		fonctions.put(f.getNom() + "_" + f.getArite(), f);
	}
	
	public Fonction getFonction(String nom, int arite) throws Exception{
		String id = Fonction.toId(nom, arite);
		if(fonctions.containsKey(id)){
			Fonction f = fonctions.get(id);
			return f;
		} else {
			System.out.println("La fonction" + nom + "(" + arite + ")" + " n'existe pas\r\n");
			Log.getInstance().getLogZone().append("La fonction " + nom + "(" + arite + ")" + " n'existe pas\r\n");
			throw new Exception("La variable demand�e n'existe pas\r\n");
		}
	}
}
