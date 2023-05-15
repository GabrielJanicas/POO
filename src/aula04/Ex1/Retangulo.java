package aula04.Ex1;

public class Retangulo {
	private double altura;
	private double comprimento;

	public Retangulo(double altura,double comprimento){
		if(validheight(altura) && validlenght(comprimento)){
			this.comprimento= comprimento;
			this.altura = altura;
		}

	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return this.comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}




	private boolean validheight(double altura){
		if (altura < 0) throw new IllegalArgumentException("A altura não pode ser negativa.");
		return true;
	}
	private boolean validlenght(double comprimento){
		if (comprimento < 0) throw new IllegalArgumentException("O comprimento não pode ser negativo.");
		return true;
	}
	public double perimenterret(double altura,double comprimento){
		double per = (altura*2)+(comprimento*2);
		return per;
	}
	public double arearet(double altura,double comprimento){
		double area = altura * comprimento;
		return area; 
	}
}
