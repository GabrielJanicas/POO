package aula04.Ex1;

public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double lado1,double lado2,double lado3){
		if (validTriangle(lado1, lado2, lado3) && validSide(lado1) && validSide(lado2) && validSide(lado3)){
			this.lado1=lado1;
			this.lado2=lado2;
			this.lado3=lado3;
		}	
}

	public double getLado1() {
		return this.lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return this.lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return this.lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}



	private boolean validSide(double lado) {
		if (lado <= 0) throw new IllegalArgumentException("O lado não pode ser negativo.");
		return true;
	}

	private boolean validTriangle(double lado1, double lado2, double lado3) {
		boolean desigualdadetriangular = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
		if (!desigualdadetriangular) throw new IllegalArgumentException("O triangulo não pode ser formado.");
		return true;
	}
	public double perimentertri(double lado1,double lado2,double lado3){
		double per = lado1+lado2+lado3;
		return per; 
	}
	public double areatri(double lado1,double lado2,double lado3){
		double semiper = (lado1+lado2+lado3)/2;
		double area = Math.sqrt(semiper*(semiper-lado1)*(semiper-lado2)*(semiper-lado3));
		return area;
	}

}



