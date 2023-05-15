package aula06.Ex2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		Contacto contacto = null;
		ArrayList<Contacto> listadecontactos = new ArrayList<Contacto>();

		do{
			System.out.println("1. Inserir contacto");
			System.out.println("2. Alterar contacto");
			System.out.println("3. Apagar contacto");
			System.out.println("4. Procurar contacto");
			System.out.println("5. Listar contactos");
			System.out.println("0. Sair");

			System.out.print("Escolha uma opçao: ");
			input = sc.nextInt();

			switch(input){
				case 1: 
					System.out.print("Introduza o ID: ");
					int ID = sc.nextInt();
					System.out.print("Introduza o nome: ");
					String name = sc.nextLine();
					sc.next();

					int number = 0;
					String email = null;

					System.out.print("Queres introduzir um número? (S/n) ");
					String resposta = sc.nextLine();
					sc.next();
					if(!resposta.trim().toLowerCase().equals("n")){
						System.out.print("Introduza o número: ");
						number = sc.nextInt();
					}

					System.out.print("Queres introduzir um email? (S/n) ");
					resposta = sc.nextLine();
					sc.next();
					if(!resposta.trim().toLowerCase().equals("n")){
						System.out.print("Introduza o email: ");
						email = sc.nextLine();
						sc.next();
					}

					if (number == 0){
						contacto = new Contacto(name, ID, email);
					}
					else if (email == null){
						contacto = new Contacto(name, number, ID);
					}
					else{
						contacto = new Contacto(name, number, ID, email);
					}
					
					break;
				case 2:
					System.out.println("Introduza o ID do contacto a alterar: ");
					int ID2 = sc.nextInt();
					for(int i = 0; i < listadecontactos.size(); i++){
						if(listadecontactos.get(i).getID() == ID2){
							System.out.print("Introduza o novo nome: ");
							String name2 = sc.nextLine();
							System.out.print("Introduza o novo número: ");
							int number2 = sc.nextInt();
							System.out.print("Introduza o novo ID: ");
							int ID3 = sc.nextInt();
							contacto = new Contacto(name2, number2,ID3);
							listadecontactos.set(i, contacto);
							System.out.println("Contacto alterado: " + contacto);
						}
					}
					break;
				case 3:
					System.out.println("Introduza o ID do contacto a apagar: ");
					int ID3 = sc.nextInt();
					for(int i = 0; i < listadecontactos.size(); i++){
						if(listadecontactos.get(i).getID() == ID3){
							listadecontactos.remove(i);
							System.out.println("Contacto apagado");
						}
					}
					
					break;
				case 4:
					System.out.println("Introduza o ID do contacto a procurar: ");
					int ID4 = sc.nextInt();
					for(int i = 0; i < listadecontactos.size(); i++){
						if(listadecontactos.get(i).getID() == ID4){
							System.out.println("Contacto encontrado: " + listadecontactos.get(i));
						}
					}

					break;
				case 5:	
					for(int i = 0; i < listadecontactos.size(); i++){
						System.out.println(listadecontactos.get(i));
					}

					break;
				case 0:
					System.out.println("Adeus!");
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
		}while(input != 0);
		sc.close();


	}
}
