package tools;


public class Noeud {
	private TypeNoeud typeNoeud;
	private Integer chiffre;
	private Boolean booleen; //
	
	private String identificateur;
	private TypeNoeud typeValeur; //Type de valeur pointée par l'indentificateur
	/************/
	
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
	/************/
	 
	public Integer getChiffre() {
		return chiffre;
	}

	public void setChiffre(Integer chiffre) {
		this.chiffre = chiffre;
	}

	public Boolean getBooleen() {
		return booleen;
	}

	public void setBooleen(Boolean booleen) {
		this.booleen = booleen;
	}

	public String getIdentificateur() {
		return identificateur;
	}

	public void setIdentificateur(String identificateur) {
		this.identificateur = identificateur;
	}

	public TypeNoeud getTypeNoeud() {
		return typeNoeud;
	}

	public void setTypeNoeud(TypeNoeud typeNoeud) {
		this.typeNoeud = typeNoeud;
	}

	public TypeNoeud getTypeValeur() {
		return typeValeur;
	}

	public void setTypeValeur(TypeNoeud typeValeur) {
		this.typeValeur = typeValeur;
	}

}
