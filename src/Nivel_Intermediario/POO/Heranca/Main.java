package Nivel_Intermediario.POO.Heranca;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Vila do Som";
        Sasuke.idade = 17;
        Sasuke.ativarSharingan();

        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia = "Aldeia da Folha";
        Kakashi.idade = 27;
        Kakashi.BoasVindas();
        Kakashi.ativarSharingan();
        Kakashi.ninjaDeElite();
        Kakashi.Hokages();
    }
}