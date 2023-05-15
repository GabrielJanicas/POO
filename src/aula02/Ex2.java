package aula02;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[]args){
		double celsius,fahre;

		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a temperatura em graus celsius: ");
		celsius = sc.nextDouble();
		fahre = celsius * 1.8 +32;
		System.out.println("A conversão em graus Fahrenheit é de : " + fahre);
		sc.close();
	}
}
