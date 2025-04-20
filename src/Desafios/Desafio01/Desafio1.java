package Desafios.Desafio01;

public class Desafio1 {
    public static void main(String[] args) {

        //Ninja 1
        String ninja1 = "Gaara";
        short idadeDoNinja1 = 14;
        String nomeDaMissao1 = "Salvar o Rock lee";
        char nivelDeDificuldade1 = 'B';
        String statusDaConclusao1;
        if (idadeDoNinja1 >= 15) {
            statusDaConclusao1 = "A missão foi Concluida";
        } else if (nivelDeDificuldade1 == 'C' || nivelDeDificuldade1 == 'D') {
            statusDaConclusao1 = "A missão foi concluida!";
        } else {
            statusDaConclusao1 = "A missão não foi concluida!";
        }
        System.out.println("\nNome do ninja: " + ninja1);
        System.out.println("Idade do ninja: " + idadeDoNinja1);
        System.out.println("Nome da missão: " + nomeDaMissao1);
        System.out.println("Nível da dificuldade: " + nivelDeDificuldade1);
        System.out.println("Status da missão: " + statusDaConclusao1);

        System.out.println("\n--------------------------------------------");

        //ninja 2
        String ninja2 = "Kankuro";
        short idadeDoNinja2 = 16;
        String nomeDaMissao2 = "Salvar o Kiba";
        char nivelDeDificuldade2 = 'B';
        String statusDaConclusao2;
        if (idadeDoNinja2 >= 15) {
            statusDaConclusao2 = "A missão foi Concluida";
        }else if (nivelDeDificuldade2 == 'C' || nivelDeDificuldade2 == 'D') {
            statusDaConclusao2 = "A missão foi concluida!";
        } else {
            statusDaConclusao2 = "A missão não foi concluida!";
        }
        System.out.println("\nNome do ninja: " + ninja2);
        System.out.println("Idade do ninja: " + idadeDoNinja2);
        System.out.println("Nome da missão: " + nomeDaMissao2);
        System.out.println("Nível da dificuldade: " + nivelDeDificuldade2);
        System.out.println("Status da missão: " + statusDaConclusao2);

        System.out.println("\n--------------------------------------------");

        //Ninja 3
        String ninja3 = "Temari";
        short idadeDoNinja3 = 13;
        String nomeDaMissao3 = "Salvar o Shikamaru";
        char nivelDeDificuldade3 = 'C';
        String statusDaConclusao3;
        if (idadeDoNinja3 >= 15) {
            statusDaConclusao3 = "A missão foi Concluida";
        } else if (nivelDeDificuldade3 == 'C' || nivelDeDificuldade3 == 'D') {
            statusDaConclusao3 = "A missão foi concluida!";
        } else {
            statusDaConclusao3 = "A missão não foi concluida!";
        }
        System.out.println("\nNome do ninja: " + ninja3);
        System.out.println("Idade do ninja: " + idadeDoNinja3);
        System.out.println("Nome da missão: " + nomeDaMissao3);
        System.out.println("Nível da dificuldade: " + nivelDeDificuldade3);
        System.out.println("Status da missão: " + statusDaConclusao3);
    }
}