package aula03;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
	public static void main(String[]args) {
		String answer = "sim";
		Scanner sc = new Scanner(System.in);

		while (answer=="sim"|| answer=="s"){
			jogo(sc);
			System.out.print("Pretende continuar? Prima (S)im: ");
			answer = sc.next().toLowerCase();
		}
		sc.close();
	}
	public static void jogo(Scanner sc) {
		int numbtries,tries;

		Random random = new Random();
		int number = random.nextInt(100);
		System.out.println(number);
		System.out.print("Número entre 1 e 100: ");
		tries = sc.nextInt();

		numbtries = 1;
		while(tries != number){
			if (tries>number){
				System.out.println("Demasiado Alto!");
			}else{
				System.out.println("Demasiado baixo!");
			}
			numbtries++;
			System.out.print("tenta outra vez: ");
			tries =  sc.nextInt();
		}
		System.out.printf("Parabéns, acertaste em %d tentativas \n",numbtries);
	}
}
