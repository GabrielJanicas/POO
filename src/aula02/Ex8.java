package aula02;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[]args) {
		double cateto1,cateto2,hipotenusa,angulo;

		Scanner	sc = new Scanner(System.in);

		cateto1 = positivo("Insira o valor do cateto A: ", sc);
		cateto2 = positivo("Insira o valor do cateto B: ", sc);

		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		angulo = Math.toDegrees(Math.atan(cateto2 / cateto1));

		System.out.println("A hipotenusa é " + hipotenusa);
		System.out.println("O ângulo é " + angulo);


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
