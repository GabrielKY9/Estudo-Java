package Nivel_Iniciante.Condicoes;

import java.util.Scanner;

public class TestandoScannerSozinho {
    public static void main(String[] args) {

        /*
         * Dados: Pegar o nome do usuário através do Scanner, pegar a idade dos ninjas
         */

        //Implementando(abrindo) o Scanner
        Scanner caixaIn = new Scanner(System.in);

        //Recebendo nome e idade do usuário
        System.out.println("Dígite aqui o nome do usuário: ");
        String inputNameUser = caixaIn.nextLine();
        System.out.println("Dígite aqui a idade do usuário: ");
        short idadeDoUser = caixaIn.nextShort();

        //Condições
        if (idadeDoUser < 18) {
            System.out.println("Não é possível dar continuídade, pois o usuário é de menor.");
        } else {
            System.out.println("O nome do usuário é " + inputNameUser + ", ele tem " + idadeDoUser + " anos e pode dar contiuídade pois é de maior!");
        }
    }
}
