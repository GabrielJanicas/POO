package aula04.Ex1;

public class Circulo {
	private double raio;

	public Circulo(double raio){
		if (validateRadius(raio)) this.raio = raio;
	}
	
	public double getRaio(){
		return this.raio;
	}

	public double setRaio(){
		return this.raio;
	}
	
	private boolean validateRadius(double radius) {
		if (radius < 0) throw new IllegalArgumentException("O Raio não pode ser negativo.");
		return true;
	}

	public double perimentercir(double raio){
		double per = raio*2*Math.PI;
		return per;
	}
	public double areacir(double raio){
		double area = Math.PI*Math.pow(raio,2);
		return area;
	}
}
