package ExercicioExtra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter[] figthers = new Fighter[10];
        
        int choice = 0;
        do {
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // generate fighters
                    for (int i = 0; i < figthers.length; i++) {
                        int type = (int) (Math.random() * 2) + 1;
                        if (type == 1) {
                            figthers[i] = new Wrestler("Wrestler " + i);
                        } else {
                            figthers[i] = new Boxer("Boxer " + i);
                        }
                    }
                    break;
                case 2:
                    // show fighters
                    for (int i = 0; i < figthers.length; i++) {
                        System.out.println(figthers[i]);
                    }
                    break;
                case 3:
                    //simulate a fight between selected fighters
                    Fighter fighter1 = null;
                    Fighter fighter2 = null;

                    System.out.println("Choose the first fighter:");
                    int fighter1Index = scanner.nextInt();
                    fighter1 = figthers[fighter1Index];

                    System.out.println("Choose the second fighter:");
                    int fighter2Index = scanner.nextInt();
                    fighter2 = figthers[fighter2Index];

                    while (fighter1.isAlive() && fighter2.isAlive()) {
                        fighter1.attack(fighter2);
                        fighter2.attack(fighter1);
                    }

                    if (fighter1.isAlive()) {
                        fighter1.win();
                        fighter2.lose();

                        System.out.println("O lutador "+ fighter1.getName() + " Ganhou");

                        fighter1.setHealth(100);
                        fighter2.setHealth(100);


                    } else {
                        fighter1.lose();
                        fighter2.win();

                        System.out.println("O lutador "+ fighter2.getName() + " Ganhou");

                        fighter1.setHealth(100);
                        fighter2.setHealth(100);
                    }
                    break;
                case 4:
                    //simulate a fight between random fighters
                    Fighter fighter3 = null;
                    Fighter fighter4 = null;

                    int fighter3Index = (int) (Math.random() * figthers.length);
                    fighter3 = figthers[fighter3Index];

                    int fighter4Index = (int) (Math.random() * figthers.length);
                    fighter4 = figthers[fighter4Index];

                    while (fighter3.isAlive() && fighter4.isAlive()) {
                        fighter3.attack(fighter4);
                        fighter4.attack(fighter3);
                    }

                    if (fighter3.isAlive()) {
                        fighter3.win();
                        fighter4.lose();

                        System.out.println("O lutador "+ fighter3.getName() + " Ganhou");

                        fighter3.setHealth(100);
                        fighter4.setHealth(100);

                    } else {
                        fighter3.lose();
                        fighter4.win();

                        System.out.println("O lutador "+ fighter4.getName() + " Ganhou");

                        fighter3.setHealth(100);
                        fighter4.setHealth(100);
                    }
                    break;
                case 5:
                    System.out.println("Boas Lutas!");
                    break;
                default:
                    System.out.println("Opcao nao existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}