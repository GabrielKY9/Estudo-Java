package Desafios.Desafio03;

public class Main {
    public static void main(String[] args) {

        Ninja Ninja = new Ninja();

        Ninja.nome = "Sasuke Uchiha";
        Ninja.idade = 17;
        Ninja.missao = "Matar Orochumaru";
        Ninja.nivelDificuldade = "Rancking S";
        Ninja.statusMissao = "Concluída!";
        Ninja.mostarInformacoes();

        System.out.println("\n=========Criando um Ninja específico==========\n");
        Desafios.Desafio03.Ninja.Uchiha Sasuke = new Ninja.Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.missao = "Matar Orochumaru";
        Sasuke.nivelDificuldade = "Rancking S";
        Sasuke.statusMissao = "Concluída!";
        Sasuke.habilidadeEspecial = "Katooon!!!";
        Sasuke.mostarInformacoes();
        String hablidade = Sasuke.mostrarHabilidadeEspecial();
        System.out.println(hablidade);
    }
}
