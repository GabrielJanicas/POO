package aula02;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[]args) {
		double x1,y1,x2,y2,distance;
		Scanner sc = new Scanner(System.in);

		System.out.print("Abscissa do primeiro ponto: ");
		x1 = sc.nextDouble();
		System.out.print("Ordenada do primeiro ponto: ");
		y1 = sc.nextDouble();
		System.out.print("Abscissa do segundo ponto: ");
		x2 = sc.nextDouble();
		System.out.print("Ordenada do segundo ponto: ");
		y2= sc.nextDouble();

		distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));

		System.out.println("A distância entre os dois pontos é de: "+ distance);
		sc.close();
		
	}
	
}
