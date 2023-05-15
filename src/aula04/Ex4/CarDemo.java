package aula04.Ex4;

import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKms() {
        return this.kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance; // acumular distância percorrida
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        // TOO: pede dados dos carros ao utilizador e acrescenta ao vetor
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados
        int count = 0;
        String registo = "";
        while (true) {
            
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            registo = sc.nextLine();

            if (registo == "") break;

            String[] palavras = registo.split(" ");

            String ultimo=palavras[palavras.length - 1];
            String penultimo=palavras[palavras.length - 2];
            String primeiro = palavras[palavras.length - 3];
            String segundo= palavras[palavras.length - 4];

            

            if (isNumeric(ultimo) != true || isNumeric(penultimo) != true){
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            else{
                int quarto = Integer.parseInt(ultimo);
                int terceiro = Integer.parseInt(penultimo);

                cars[count] = new Car(primeiro,segundo,terceiro,quarto);
                count++;

                if (count >= cars.length) {
                    System.out.println("Número máximo de carros atingido.");
                    break;
                }
            }

        }
        return count;
   }

    private static boolean isNumeric(String s){
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static void registerTrips(Car[] cars, int numCars) {

        String Viagem = "";
        while(true){
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            Viagem = sc.nextLine();
            if (Viagem == "") break ;

            String[] Viagens = Viagem.split(":");

            String carro = Viagens[Viagens.length -2];
            String distancia = Viagens[Viagens.length -1];

            if (Integer.parseInt(distancia)<0 || isNumeric(distancia) != true || isNumeric(carro) != true ){
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            else{
                cars[Integer.parseInt(carro)].drive(Integer.parseInt(distancia));
                continue;
            }
        }
        

        // TOD: pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia 
    }


    static void listCars(Car[] cars) {
        String s = "\n Carros registados: \n";
        for(int i = 0; i < cars.length; i++){
            if (cars[i] == null) continue;
            s += cars[i].getMake() + "," + cars[i].getModel() + "," + cars[i].getYear() + ", kms:" + cars[i].getKms() +  "\n";
        }
        System.out.println(s);
        // TOD: lista todos os carros registados
        // Exemplo de resultado
        // Carros registados: 
        // Toyota Camry, 2010, kms: 234346
        // Renault Megane Sport Tourer, 2015, kms: 32536
        
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}