package Nivel_Iniciante.Arrays;

public class Arrayss {
    public static void main(String[] args) {

        /*
        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
        **/

        //Inicializando a Array
        //São tipos referênica!
        // O "new" é um novo espaço na memória de um objeto (Objeto de memória)
        String[] ninja = new String[6];

        //Definindo os nomes na array
        ninja[0] = "Naruto Uzuamki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Gaara do Deserto";
        ninja[4] = "Rock Lee";
        ninja[5] = "Kakashi Hakate";

        //Definindo a idade na array
        int[] idade = new int[3];
        
        idade[0] = 11;
        idade[1] = 12;
        idade[2] = 13;

        //for loop
        for (int i = 0; i < idade.length; ++i) {
            System.out.println(idade[i]);
        }

        for (int elemento : idade)
            System.out.println(elemento);

        System.out.println("______________________________________");

        //Tranformando uma Array em uma lista
        int[] idade2 = new int[] {100, 200, 300, 400, 500};

        System.out.println("-----------------------------------------");


    }
}
