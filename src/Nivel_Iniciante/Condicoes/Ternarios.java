package Nivel_Iniciante.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
         * Ternário: São maneiras de reduzir o código
         * Variável = (condição) ? vslorSeVerdaderio : valorSeFalso
         * */

        short numeroDeMisssoes = 11;
        String nivel = (numeroDeMisssoes >= 10) ? "Esse ninja está com mais de 10 missões!" : "Esse ninja tem menos de 10 missões!";
        System.out.println(nivel);
    }
}
