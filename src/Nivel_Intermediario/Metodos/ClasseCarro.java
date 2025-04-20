package Nivel_Intermediario.Metodos;

//definir classe
class Car {

        String modelo;
        int ano;

        void buzina() {
            System.out.println("Biiip!");
        }
    }

public class ClasseCarro {
    public static void main(String[] args) {

        //Criando um objeto da classe Carro
        Car myCar = new Car();

        myCar.modelo = "Fusca";
        myCar.ano = 1970;

        System.out.println(myCar.modelo);
        myCar.buzina();
    }
}
