package aula02;

import java.util.Scanner;

public class Ex5 {
	public static void main (String[]args){
		double v1,v2,d1,d2,vm;
		Scanner sc = new Scanner(System.in);

		System.out.print("Velocidade primeiro trajeto: ");
		v1 = sc.nextDouble();
		System.out.print("Distância primeiro trajeto: ");
		d1 = sc.nextDouble();
		System.out.print("Velocidade segundo trajeto: ");
		v2 = sc.nextDouble();
		System.out.print("Distância segundo trajeto: ");
		d2= sc.nextDouble();

		vm = (d1 + d2) / ((d1 / v1) + (d2 / v2));
		
		System.out.println("A velocidade média total foi de: "+ vm);

		sc.close();

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
