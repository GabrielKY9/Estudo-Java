package Nivel_Iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scanner = É um jeito de trazer o usuário para dentro  da aplicação
         * O usuário vai criar um ninja e vamos validar os dados
         * */

        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Rexber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Escreva aqui a idade do sue ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("Idade do seu ninja é: " + idadeDoNinja);
        System.out.println("O nome do seu ninja é " + nomeDoNinja + " e ele tem " + idadeDoNinja + " anos.");

        //Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja é de maior e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é muito novo ainda, ainda não pode fazer missões fora da aldeia.");
        }

        //Fechar semre o Scanner
        caixaDeTexto.close();

    }
}
