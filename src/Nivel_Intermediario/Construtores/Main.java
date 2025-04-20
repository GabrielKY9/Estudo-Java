package Nivel_Intermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama Senju";

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(40);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze",15,false);
        System.out.println(Minato.nome + Minato.idade + Minato.VivoOuNao);

        Hokages Tsunade = new Hokages("Tsunade Senju");
        System.out.println(Tsunade.nome);
    }
}