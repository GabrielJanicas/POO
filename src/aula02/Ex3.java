package aula02;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[]args) {

		double quant,TemI,TempF,energia;
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de agua: ");
		quant = sc.nextDouble();
		System.out.print("Temperatura Inicial da água: ");
		TemI = sc.nextDouble();
		System.out.print("Temperatura final da agua: ");
		TempF = sc.nextDouble();

		energia = quant*(TempF-TemI)*4184;

		System.out.println("A energia necessária para o procedimento é de: "+ energia);
		sc.close();
		
	}
}
