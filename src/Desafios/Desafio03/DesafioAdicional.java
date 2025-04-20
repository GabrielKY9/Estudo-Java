package Desafios.Desafio03;

import java.util.Scanner;

public class DesafioAdicional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ninja ninja = new Ninja();

        //Criar uma array para os nomes cadastrados
        int ninjas_MAX = 2;
        int caracteristicas_MAX = 5;
        String[][] arrayNinjas = new String[ninjas_MAX][caracteristicas_MAX];

        //Opções
        int opcao = 0;

        //Contador
        int contador = 0;

        while (opcao != 3) {

            //Menu
            System.out.println("=======Menu de opções=======\n");
            System.out.println("1- Cadastrar o ninja, sua idade, sua missão, o nível da dificuldade da missão, e se ela foi concuída;");
            System.out.println("2- Mostrar as informações de cada ninja cadastrado;");
            System.out.println("3- Atualizar suas habilidades especiais;");
            System.out.println("4- Sair do programa.\n");

            System.out.println("Selecione a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (contador < ninjas_MAX) {

                        //Nome ninja
                        System.out.println("Selecione o nome do ninja");
                        ninja.nome = scanner.nextLine();
                        arrayNinjas[contador][0] = ninja.nome;

                        //Idade ninja
                        System.out.println("Selecione a idade do ninja: ");
                        ninja.idade = scanner.nextInt();
                        arrayNinjas[contador][1] = String.valueOf(ninja.idade);
                        scanner.nextLine();

                        //Missão Ninja
                        System.out.println("Fale qual é a missão do ninja: ");
                        ninja.missao = scanner.nextLine();
                        arrayNinjas[contador][2] = ninja.missao;


                        //Dificuldade da missão Ninja
                        System.out.println("Digite a dificuldade da missão deste nnja: ");
                        ninja.nivelDificuldade = scanner.nextLine();
                        arrayNinjas[contador][3] = ninja.nivelDificuldade;

                        //Status da missão
                        System.out.println("O status da missão é: ");
                        ninja.statusMissao = scanner.nextLine();
                        arrayNinjas[contador][4] = ninja.statusMissao;

                        //Loop
                        contador++;
                        System.out.println("Ninja cadstrado!");

                    } else {
                        System.out.println("A lista já está cheia!");
                    }
                    break;

                case 2:
                    System.out.println("=========Mostrar os ninjas e suas caracterésticas=========\n");
                    if(contador != 0) {
                        for (int i = 0; i <= arrayNinjas.length; i++) {
                            System.out.println("Ninja " + i);
                            System.out.println("O nome do ninja é " + arrayNinjas[i][0]);
                            System.out.println("O idade do ninja é " + arrayNinjas[i][1]);
                            System.out.println("A missão do ninja é " + arrayNinjas[i][2]);
                            System.out.println("A dificuldade da missão é " + arrayNinjas[i][3]);
                            System.out.println("A missão está " + arrayNinjas[i][4]);
                        }
                    } else {
                            System.out.println("A lista está vazia! Adicione os nomes para que possa ser mostrado.\n");
                        }
                    break;
            }
        }
    }
}
