package aula03;

import java.util.Scanner;

public class ex1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int n =  (int) positivo("Introduza um número inteiro: ", sc);
		int soma = 0;
		while(n>=0){
			if(isPrime(n)== true){
				soma += n;
			}
			n -= 1;
		}
		System.out.println("A soma dos números primos até ao valor inserido é de: "+soma);
		
	}
	public static boolean isPrime(int n) {
		if (n < 2) return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static double positivo(String mensagem,Scanner sc){
		double r;
		while (true){
			System.out.print(mensagem);
			r = sc.nextDouble();
			if (r > 0){
				break;
			}else{
				System.out.println("Introduza um número positivo");
			}
		}
		return r;
	}	
}
