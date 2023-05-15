package aula05.Ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int input;
		DateYMD date = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

			input = getInt("Escolha uma operação: ", sc, 0, 4);

			switch (input) {
				case 1:
					int day = getInt("Introduza o dia: ", sc, 1, 31);
					int month = getInt("Introduza o mês: ", sc, 1, 12);
					int year = getInt("Introduza o ano: ", sc);

					date = new DateYMD(day, month, year);
					System.out.println("Data criada: " + date);
					break;

				case 2:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}
					
					System.out.println("Data atual: " + date.toString());
					break;

				case 3:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}

					int daysIn = getInt("Introduza o número de dias: ", sc);
					date.increment(daysIn);
					System.out.println("Data incrementada: " + date);
					break;

				case 4:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}

					int daysDe = getInt("Introduza o número de dias: ", sc);
					date.decrement(daysDe);
					System.out.println("Data decrementada: " + date);
					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);
	}
	public static int getInt(String message, Scanner sc, int min, int max) {
		while (true) {
			System.out.print(message);

			if (sc.hasNextInt()) {
				int value = sc.nextInt();
				sc.nextLine();

				if (value >= min && value <= max) {
					return value;
				} else if (min != Integer.MIN_VALUE && max != Integer.MAX_VALUE) {
					System.out.println("Valor inválido! Introduza um valor entre " + min + " e " + max + ".");
				} else if (min != Integer.MIN_VALUE) {
					System.out.println("Valor inválido! Introduza um valor superior a " + min + ".");
				} else {
					System.out.println("Valor inválido!");
				}
			} else {
				System.out.println("Introduza um número válido!");
				sc.next();
			}
		}
	}

	public static int getInt(String message, Scanner sc, int min) {
		return getInt(message, sc, min, Integer.MAX_VALUE);
	}

	public static int getInt(String message, Scanner sc) {
		return getInt(message, sc, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
}