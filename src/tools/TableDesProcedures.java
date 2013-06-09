package tools;

import java.util.HashMap;

import logogui.Log;

/**
 * @author Root
 *
 */
public class TableDesProcedures {
	private HashMap<String, Procedure> fonctions;
	
	private static TableDesProcedures instance;
	
	public static TableDesProcedures getInstance(){
		if(instance == null){
			instance = new TableDesProcedures();
		}
		return instance;
	}
	
	public static void libereInstance(){
		if(instance != null){
			 instance = null;
		}
	}
	
	private TableDesProcedures(){
		//Cr�e la table des symboles
		fonctions = new HashMap<String, Procedure>();
	}
	
	/**
	 * Ajoute une nouvelle fonction dans la Map.
	 * Son identifiant dans la Map sera la concat�nation 
	 * du nom de la fonction avec son arit� : Nomfonction_Arit�
	 * @param f
	 */
	public void ajouterProcedure(Procedure f){
		System.out.println("TableDesFonctions: La fonction " + f.getNom() + "(" + f.getArite() + ")" + "a �t� ajout�e");
		Log.getInstance().getLogZone().append("Fonction " + f.getNom() + "(" + f.getArite() + ")" + " connue\r\n");
		fonctions.put(f.getNom() + "_" + f.getArite(), f);
	}
	
	public Procedure getFonction(String nom, int arite) throws Exception{
		String id = Procedure.toId(nom, arite);
		if(fonctions.containsKey(id)){
			Procedure f = fonctions.get(id);
			return f;
		} else {
			System.out.println("La fonction" + nom + "(" + arite + ")" + " n'existe pas\r\n");
			Log.getInstance().getLogZone().append("La fonction " + nom + "(" + arite + ")" + " n'existe pas\r\n");
			throw new Exception("La variable demand�e n'existe pas\r\n");
		}
	}
}
