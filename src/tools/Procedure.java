package tools;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTree;

public class Procedure {
	private String nom;
	private int arite;
	private ArrayList<String> params;
	private ParseTree corps;
	
	public Procedure(String nom, ArrayList<String> params, ParseTree corps){
		this.nom = nom;
		this.params = new ArrayList<String>(params);
		this.arite = params.size();
		this.corps = corps;
	}

	public String getNom() {
		return nom;
	}

	public int getArite() {
		return arite;
	}

	public ArrayList<String> getParams() {
		return params;
	}

	public ParseTree getCorps() {
		return corps;
	}
	
	public String getId() {
		return nom + "_" + arite;
	}
	
	public static String toId(String nom, int arite){
		return nom + "_" + arite;
	}
}
