package Nivel_Iniciante.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
         * SwitchCases: Que servem para gerar casos especifícos
         * Objetivo:  Pedir pro usuário escolher entre os ninjas
         * */

        // Pedir parqa o usuário
        Scanner imputSwitch = new Scanner(System.in);

        //Mostar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuário escolher uma das opções
        int escolhaDoUsuario = imputSwitch.nextInt();

        System.out.println("Vc digítou o personagem "+ escolhaDoUsuario);

        //Reação ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais pnc");
                break;
            case 3:
                System.out.println("O usuário escolheu o personagem Sakura Haruno, a mais chata");

            default:
                System.out.println("Você digítou um número inválido. Digíte um número válido.");
                break;
        }

        //Fechar a caixa
        imputSwitch.close();
    }
}
