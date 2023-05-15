package aula02;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double n,max,min,soma,count;

		System.out.print("Introduza um número: ");
		n = sc.nextDouble();
		max = n;
		min = n;
		soma = n;
		count = 1; 
		while(true){
			System.out.print("Introduza um número: ");
			double r = sc.nextDouble();
			soma += r;
			count += 1;
			if(r == n){
				double media = soma/count;
				System.out.println("O número máximo foi de : "+max);
				System.out.println("O número mínimo foi de : "+min);
				System.out.println("A média de valores foi de : "+ media);
				System.out.println("O número total de valores foi de: "+count);
				break;
			}
			if(r>max){
				max = r;
			}
			if (r<min){
				min = r;
			}
		}	
		sc.close();	
	}
	
}
