package Nivel_Intermediario.POO.Polimorfismo;

public class Main {

    public static void main(String[] args) {


        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;

        Sasuke.habilidadeEspecial();
        Sasuke.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha("Itachi", "Aldeia da Folha", 19);
        itachi.habilidadeEspecial();

    }
}
