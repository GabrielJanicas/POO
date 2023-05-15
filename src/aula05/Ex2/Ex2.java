package aula05.Ex2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int input;
		Calendar calendar = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Calendar operations:");
			System.out.println("1 - create new calendar");
			System.out.println("2 - print calendar month");
			System.out.println("3 - print calendar");
			System.out.println("0 - exit");

			input = getInt("Escolha uma operação: ", sc, 0, 3);

			switch (input) {
				case 1:
					int year = getInt("Introduza o ano: ", sc);
					int weekDay = getInt("Introduza o dia em que começa o ano (1-Domingo, 7-Sábado): ", sc, 1, 7);

					calendar = new Calendar(year, weekDay);
					System.out.println("Calendário criado: " + year);
					break;

				case 2:
					if (calendar == null) {
						System.out.println("Calendário não criado.");
						break;
					}

					int month = getInt("Introduza o mês: ", sc, 1, 12);
					calendar.printMonth(month);
					break;

				case 3:
					if (calendar == null) {
						System.out.println("Calendário não criado.");
						break;
					}

					calendar.toString();
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
