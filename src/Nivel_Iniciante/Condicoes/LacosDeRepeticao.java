package Nivel_Iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
         *Laços de repetição: Vão repetir infinitamente ou até o paramêtro ser atendido
         *Tipos de laços: WHILE = FOR
         * */

        //while (condição) {Tudo aqui vai acontecer} Ou seja, enquanto a conição for verdadeira, ele vai executar a instrução

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        //For
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto está se clonando e já se clonou " + i);
        }

        /*
         * Outra forma
         * */

        System.out.println("\n=================================================\n");
        while (numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        }
    }
}