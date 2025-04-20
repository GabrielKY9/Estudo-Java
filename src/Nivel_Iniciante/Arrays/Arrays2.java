package Nivel_Iniciante.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        /*
         * Arrays + Introdução ao Garbage Collector
         */

        //Definindo as Arrays:
        String[] hokage = new String[7];

        hokage[0] = "Hashirama";
        hokage[1] = "Tobirama";
        hokage[2] = "Hiruzem";
        hokage[3] = "Minato";
        hokage[4] = "Tsunade";
        hokage[5] = "Kakashi";
        hokage[6] = "Naruto";

        //Fazendo um laço paraaparecer todos os índicies da array
        for (String j : hokage) {
            System.out.println(j);
        }

        System.out.println("\n--------------------------\n");

        //Outra forma de laço para mostrar todos os indicies da array
        for (int i = 0; i < hokage.length; ++i) {
            System.out.println(hokage[i]);
        }

        System.out.println("\n----------------------------\n");
        //Outra forma de fazer laço
        for(int i = 0; i < 7; ++i){
            System.out.println(hokage[i]);
        }
    }
}
