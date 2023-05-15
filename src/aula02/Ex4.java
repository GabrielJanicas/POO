package aula02;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[]args) {
		double montante,juro,conta;
		Scanner sc = new Scanner(System.in);

		System.out.print("Montante investido: ");
		montante = sc.nextDouble();
		System.out.print("Taxa de juro mensal: ");
		juro = sc.nextDouble();
		
		conta =  montante*(Math.pow((1+juro),3));


		System.out.println("Ovalor final vai ser de : "+ conta);
		sc.close();
	
}
}