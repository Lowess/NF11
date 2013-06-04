package tools;

public class Operateur {
	private OperateurEnum opCode;
	
	public OperateurEnum getOpCode() {
		return opCode;
	}

	public void setOpCode(OperateurEnum opCode) {
		this.opCode = opCode;
	}

	public Operateur(String op){
		if(op.matches("<=")){
			opCode=OperateurEnum.INF_EGAL;
		} else if(op.matches("<")) {
			opCode=OperateurEnum.INF;
		} else if(op.matches("=")) {
			opCode=OperateurEnum.EGAL;
		} else if(op.matches("!=")) {
			opCode=OperateurEnum.DIFF;
		} else if(op.matches(">")) {
			opCode=OperateurEnum.SUP;
		} else if (op.matches(">=")) {
			opCode=OperateurEnum.SUP_EGAL;
		}
	}
	
	public boolean appliqueOperateur(int a, int b){
		boolean val=false;
		
		switch(this.opCode){
			case INF_EGAL:
				val = a <= b;
				break;
			case INF:
				val = a < b;
				break;
			case EGAL:
				val = a == b;
				break;
			case DIFF:
				val = a != b;
				break;
			case SUP:
				val = a > b;
				break;
			case SUP_EGAL:
				val = a >= b;
				break;
		}
		
		return val;
	}
	
	public boolean appliqueOperateur(Noeud a, Noeud b){
		boolean val = false;
		switch(a.getTypeNoeud()){
		case INTEGER:
			switch (b.getTypeNoeud()){
				case INTEGER:
					val = this.appliqueOperateur(a.getChiffre(), b.getChiffre());
					break;
				case BOOLEAN:
					break;
				case IDENTIFICATEUR:
					try {
						val = this.appliqueOperateur(a.getChiffre(), TableDesSymboles.getInstance().getSymbole(b.getIdentificateur()).getChiffre());
					} catch (Exception e) {
					}
					break;
						
			}
			break;
		case BOOLEAN:
			break;
		case IDENTIFICATEUR:
			break;
		}
		return val;
	}
}
