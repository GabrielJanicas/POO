package aula02;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[]args) {
		int hours,minutes;

		Scanner sc = new Scanner(System.in);
		System.out.print("Indique o tempo em segundos(s): ");

		int seconds = sc.nextInt();

		hours = seconds / 3600;
		seconds %= 3600;
		minutes = seconds / 60;
		seconds %= 60;

		System.out.printf("O tempo em horas é de %02d:%02d:%02d ", hours,minutes,seconds);
		sc.close();
	}
}
