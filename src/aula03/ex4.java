package aula03;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
	public static int calcularNotaFinal (double np, double nt) {
		if ((nt<7.0) ||(np < 7.0)){
			return 66;
		}
		double nf = 0.4*nt + 0.6*np;
		return (int) nf; 
	}

	public static void main(String[]args){
		int NumberStudents;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o números de alunos da turma: ");

		NumberStudents = sc.nextInt();
		double notas[][] = new double[NumberStudents][2];

		Random random = new Random();

		for (int i = 0; i < NumberStudents; i++){
			for(int j = 0;j<2;j++){
				notas[i][j] = random.nextDouble(20);
			}
		}
		System.out.printf("%6s %6s %6s \n","NotaT","NotaP","Pauta");
		for(int i=0;i<NumberStudents;i++){
			double np = notas[i][0];
			double nt = notas[i][1];
			int nf = calcularNotaFinal(np, nt);
			System.out.printf("%6.1f %6.1f %6d \n",nt,np,nf);


		}	
		sc.close();
	}
}