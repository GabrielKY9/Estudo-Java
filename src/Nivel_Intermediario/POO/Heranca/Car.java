package Nivel_Intermediario.POO.Heranca;

public class Car {

    int wheels;
    String model;

    public void start() {
        System.out.println("Iniciando o método do carro!");
    }


    public interface Floatable {
        int duration = 10;
    }

    public interface Flyable {
        int duration = 10;
    }


    public class ArmoredCar extends Car implements Floatable, Flyable{

        public void aMethod(){
            System.out.println(Floatable.duration);
            System.out.println(Flyable.duration);
        }
    }
}