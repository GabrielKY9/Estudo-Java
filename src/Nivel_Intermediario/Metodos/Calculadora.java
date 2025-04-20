package Nivel_Intermediario.Metodos;

// Exemplo de métodos e paramêtros
public class Calculadora {

    //Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    //Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    //Método para multiplicar dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    //Método para dvidir dois números
    public int divisao(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero (0).");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Chamadno os métodos e passando o parâmetros
        int soma = calc.somar(5,3);
        int subtracao = calc.subtrair(10,4);
        int multplicacao = calc.multiplicar(7,6);
        double divisao = calc.divisao(20,4);

        //Exibindo resultados
        System.out.println("A Soma é: " + soma);
        System.out.println("A Subtração é: " + subtracao);
        System.out.println("A Multiplicação é: " + multplicacao);
        System.out.println("A Divisão é: " + divisao);

        class Car{

            //fields
            String type;
            String model;
            String color;
            int speed;

            //constructor
        Car(String type, String model, String color){
            this.type = type;
            this.model = model;
            this.color = color;
        }

        //methods
        int increaseSpeed(int increment){
            this.speed = this.speed + increment;
            return this.speed;

            }
        }
    }
}
