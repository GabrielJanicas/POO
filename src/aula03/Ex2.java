package aula03;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[]args) {
		double montante,juro,conta,count;
		Scanner sc = new Scanner(System.in);

		montante = positivo("Montante investido: ", sc);

		while (montante%1000 != 0){
			System.out.println("Introduza um número múltiplo de 1000!");
			montante = positivo("Montante investido: ", sc);
		}
		System.out.print("Taxa de juro mensal: ");
		juro = sc.nextDouble();
		while(juro>5 || juro< 0){
			System.out.print("Introduza um juro entre 0% e 5%: ");
			juro = sc.nextDouble();
		}
		
		count = 1;
		while(count<13){
			conta = montante*(1+(juro/100));
			montante = conta;
			System.out.printf("No mês %.0f o montante resultante foi de %.2f \n" ,count,montante);
			count += 1;
		}
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
