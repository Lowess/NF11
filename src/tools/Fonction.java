package tools;

import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTree;

public class Fonction {
	private String nom;
	private int artite;
	private HashMap<String, Noeud> params;
	private ParseTree corps;
	
	public Fonction(String nom, HashMap<String, Noeud> params, ParseTree corps){
		this.nom = nom;
		this.params = new HashMap<String, Noeud>(params);
		this.corps = corps;
	}

	public String getNom() {
		return nom;
	}

	public int getArtite() {
		return artite;
	}

	public HashMap<String, Noeud> getParams() {
		return params;
	}

	public ParseTree getCorps() {
		return corps;
	}
}
