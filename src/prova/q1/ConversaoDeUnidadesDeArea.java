package prova.q1;



public class ConversaoDeUnidadesDeArea {
	
	private double metrosQuadrado;

	public ConversaoDeUnidadesDeArea(double metrosQuadrado) {
		this.metrosQuadrado = metrosQuadrado;
	}
	
	public double getMetrosQuadrado() {
		return metrosQuadrado;
	}
	
	public double getPesQuadrado() {
		return this.getMetrosQuadrado() * 10.76;
	}

	//calculo n�o est� exato, poderia ser '+getMetrosQuadrado() * 10000'
	// mas segui conforme enuciado da quest�o
	// "convers�o das unidades de �rea segundo a lista abaixo."
	public double getCentimetrosQuadrado() {
		return this.getPesQuadrado() * 929;
	}
	
	public double getAcre() {
		return this.getPesQuadrado() / 43560;
	}
	
	public double getMilhaQuadrada() {
		return this.getAcre() / 640;
	}
	
	public void imprimirValores() {
		System.out.println("Metros quadrados: "+this.getMetrosQuadrado());
		System.out.println("P�s quadrados: "+this.getPesQuadrado());
		System.out.println("Acres: "+this.getAcre());
		System.out.println("Cent�metros quadrados: "+this.getCentimetrosQuadrado());
		System.out.println("Milha quadrada: "+this.getMilhaQuadrada());
	}
	
}
