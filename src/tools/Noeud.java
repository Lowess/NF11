package tools;

public class Noeud {
	private TypeNoeud typeNoeud;
	private Integer chiffre;
	private Boolean booleen;
	
	private String identificateur;
	private TypeNoeud typeValeur; //Type de valeur pointée par l'ID
	
	/******************************************************************/
	
	public Noeud(Integer val){
		typeNoeud = TypeNoeud.INTEGER;
		chiffre = val;
		booleen = null;
		identificateur = null;
		typeValeur = null;
	}
	
	public Noeud(Boolean val){
		typeNoeud = TypeNoeud.BOOLEAN;
		chiffre = null;
		booleen = val;
		identificateur = null;
		typeValeur = null;
	}

	public Noeud(String val, TypeNoeud type){
		typeNoeud = TypeNoeud.IDENTIFICATEUR;
		chiffre = null;
		booleen = null;
		identificateur = val;
		typeValeur = type;
	}
	
	/******************************************************************/
	 
	public Integer getChiffre() {
		return chiffre;
	}


	public Boolean getBooleen() {
		return booleen;
	}

	public String getIdentificateur() {
		return identificateur;
	}

	public TypeNoeud getTypeNoeud() {
		return typeNoeud;
	}

	public TypeNoeud getTypeValeur() {
		return typeValeur;
	}
}
