package aula04.Ex3;

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

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        String s = "\n Carros registados: \n";
        for(int i = 0;i<3;i++){
            s += cars[i].getMake() + "," + cars[i].getModel() + "," + cars[i].getYear() + ", kms:" + cars[i].getKms() +  "\n";
        }
        System.out.println(s);
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3];// TOO: completar
        cars[0] = new Car("Renault","Clio",2002,70000);// TOO: completar
        cars[1] = new Car("Mercedes", "AMG", 2023, 1);// TOO: completar
        cars[2] = new Car("Mclaren","Senna",2022, 20000);// TDO: completar

        listCars(cars);

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            
            cars[j].drive(kms);
            // TOD: adicionar viagem ao carro j
        }

        listCars(cars);

        sc.close();

    }
}