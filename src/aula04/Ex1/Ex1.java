package aula04.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[]args) {
		ArrayList<Circulo> circulos = new ArrayList<Circulo>();
        ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
        ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();

        int choice;
        Scanner sc = new Scanner(System.in);

        double raio = 0;
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        double lado4 = 0;
        double lado5 = 0;
        

        

        do{
            System.out.println("Escolha:");
            System.out.println("1 - Criar Circulo");
            System.out.println("2 - Criar Triangulo");
            System.out.println("3 - Criar Retangulo");
            System.out.println("4 - Area e Perimetro dos Circulos");
            System.out.println("5 - Area e Perimetro dos Triangulos");
            System.out.println("6 - Area e Perimetro dos Retangulos");
            System.out.println("7 - Listar Circulos");
            System.out.println("8 - Listar Triangulos");
            System.out.println("9 - Listar Retangulos");
            System.out.println("10 - Comparar 2 Circulos");
            System.out.println("11 - Comparar 2 Triangulos");
            System.out.println("12 - Comparar 2 Retangulos");
            System.out.println("0 - Sair");

            System.out.print("Escolha:");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Raio:");
                    raio = sc.nextDouble();
                    Circulo c = new Circulo(raio);
                    circulos.add(c);
                    System.out.println(c);
                    break;

                case 2:
                    System.out.print("Lado 1:");
                	lado1 = sc.nextDouble();
                    System.out.print("Lado 2:");
                    lado2 = sc.nextDouble();
                    System.out.print("Lado 3:");
                    lado3 = sc.nextDouble();
                    Triangulo t = new Triangulo(lado1, lado2, lado3);
                    triangulos.add(t);
                    System.out.println(t);
                    break;
                case 3:
                    System.out.print("Lado 1:");
                    lado4 = sc.nextDouble();
                    System.out.print("Lado 2:");
                    lado5 = sc.nextDouble();
                    Retangulo r = new Retangulo(lado4, lado5);
                    retangulos.add(r);
                    System.out.println(r);
                    break;

                case 4:
                    if(circulos.size() <= 0){
                        System.out.println("Não existem circulos");
                        break;
                    }

                    for(int i = 0; i < circulos.size(); i++){
                        System.out.println("Circulo " + i + ":\n");
                        System.out.println("Area: " + circulos.get(i).areacir(raio) + "\n");
                        System.out.println("Perimetro: " + circulos.get(i).perimentercir(raio)+ "\n");
                    }

                    break;

                case 5:

                    if(triangulos.size() <= 0){
                        System.out.println("Não existem triangulos");
                        break;
                    }

                    for(int i = 0; i < triangulos.size(); i++){
                        System.out.println("Triangulo " + i + ":\n");
                        System.out.println("Area: " + triangulos.get(i).areatri(lado1,lado2,lado3) + "\n");
                        System.out.println("Perimetro: " + triangulos.get(i).perimentertri(lado1,lado2,lado3)+ "\n");
                    }

                    break;

                case 6:

                    if(retangulos.size() <= 0){
                        System.out.println("Não existem retangulos");
                        break;
                    }

                    for(int i = 0; i < retangulos.size(); i++){
                        System.out.println("Rectangulo " + i + ":\n");
                        System.out.println("Area: " + retangulos.get(i).arearet(lado4,lado5) + "\n");
                        System.out.println("Perimetro: " + retangulos.get(i).perimenterret(lado4,lado5)+ "\n");
                    }

                    break;    

                case 7:
                    System.out.println("Lista de Circulos");
                    for(int i = 0; i < circulos.size(); i++){
                        System.out.println(circulos.get(i));
                    }
                    break;

                case 8: 
                    System.out.println("Lista de Triangulos");
                    for(int i = 0; i < triangulos.size(); i++){
                        System.out.println(triangulos.get(i));
                    }
                    break;
                case 9:
                    System.out.println("Lista de Rectangulos");
                    for(int i = 0; i < retangulos.size(); i++){
                        System.out.println(retangulos.get(i));
                    }
                    break;

                    
                case 10:
                    System.out.println("Circulo 1:");
                    int circulo1 = sc.nextInt();
                    System.out.println("Circulo 2:");
                    int circulo2 = sc.nextInt();
                    if(circulos.get(circulo1).equals(circulos.get(circulo2))){
                        System.out.println("São iguais");
                    }else{
                        System.out.println("Não são iguais");
                    }
                    break;
                

                case 11:
                    System.out.println("Triangulo 1:");
                    int triangulo1 = sc.nextInt();
                    System.out.println("Triangulo 2:");
                    int triangulo2 = sc.nextInt();
                    if(triangulos.get(triangulo1).equals(triangulos.get(triangulo2))){
                        System.out.println("São iguais");
                    }else{
                        System.out.println("Não são iguais");
                    }
                    break;

                case 12:
                    System.out.println("Retangulo 1:");
                    int rectangulo1 = sc.nextInt();
                    System.out.println("Retangulo 2:");
                    int rectangulo2 = sc.nextInt();
                    if(retangulos.get(rectangulo1).equals(retangulos.get(rectangulo2))){
                        System.out.println("São iguais");
                    }else{
                        System.out.println("Não são iguais");
                    }
                    break;

                case 0:
                    break;
            }

    }while(choice != 0);
    sc.close();
		
		
	}
	
}
