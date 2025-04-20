package Desafios.Desafio02;

import java.util.Scanner;

public class Dasafio2 {
    public static void main(String[] args) {

        /* OBJETIVOS GERAIS: Criar um sistema simples que vai CADASTRAR novos ninjas
         * e LISTAR todos os ninjas cadastrados.
         * TÓPICOS A SEREM USADOS: Arrays (para armazenar os nomes dos ninjas)
         * Switch Cases (para implementar um menu interativo)
         * Loops: Para navegar pelas opções do menu e iterar sobre os nnjas ccadastrados
         * Condicionais: Para controlar a execução das opções do menu e validar o número
         * de ninjas cadastrados.
         * */

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Array de nomes
        int nomes_MAX =  2;
        String[] nomes = new String[nomes_MAX];

        //contador
        int counter = 0;

        //opcoes
        int option = 0;

        while(option != 3){

            System.out.println("\n===== Menu de Seleção =====");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    if(counter < nomes_MAX){
                        System.out.println("Digite o nome do usário à ser cadastrado: ");
                        String name = scanner.nextLine();
                        nomes[counter] = name;
                        counter++;
                        System.out.println("Nome cadastrado!");
                    } else{
                        System.out.println("A lista está cheia!");
                    }
                    break;

                case 2:
                    if (counter != 0){
                        System.out.println("========== Lista de nomes cadastrados ==========");
                        for (String nome : nomes) {
                            System.out.println(nome);
                        }
                    } else{
                        System.out.println("A lista está vazia! Por favor cadastre usuários na lista.");
                }
                    break;

                case 3:
                    System.out.println("Estamos fechando o programa... Aguarde um instante...");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor selecione uma das opções válidas: \n1- Cadastrar usuário; \n2- Mostrar lista de nomes cadastradados;" +
                        "\n3- Sair do programa.");
            }
        }
    }
}

