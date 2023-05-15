package aula02;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int numb;

		System.out.print("Introduza um número: ");
		numb = sc.nextInt();

		while(numb > 0){
			if (numb % 10 == 0){
				System.out.println(numb);
				numb -= 1;
				continue; 
			}
			System.out.print(numb+",");
			numb -= 1;
		}
		System.out.print("0");
		sc.close();	
}
}
