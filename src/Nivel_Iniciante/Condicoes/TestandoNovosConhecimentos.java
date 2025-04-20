package Nivel_Iniciante.Condicoes;

import java.util.Scanner;

public class TestandoNovosConhecimentos {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Dígite o nome do usuário ");
        String nome = inputUser.nextLine();

        System.out.println("Dígite a idade do usuário");
        int idade = inputUser.nextInt();
        String confirmacao = (idade >= 18)
                ? "usário tem idade suficiente para acessar o site!"
                : "usuário não tem idade sufificente para acessar o site!";

        System.out.println("O nome do usuário é " + nome + ", sua idade é " + idade + " anos e o " + confirmacao);
    }
}
