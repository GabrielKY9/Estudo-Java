package Nivel_Iniciante.Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * Objetivo: Passar o ninja de nível de accordo com o  número de misssões
        * */

        //Ninja Naruto
        String ranking;
        String nome = "Naruto";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        /*
        * if (condição) {resultado}
        * else if (condição) {resultado}
        * else {resultado caso nenhuma das outras condições sejam verdadeiras/true}
        * */

        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chounnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Ranking: Jounnin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
