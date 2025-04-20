package Nivel_Intermediario.Metodos;

public class Main {
    public static void main(String[] args) {


        //Criar o ninja Naruto - Naruto é um objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruo Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idades = 18;
        Naruto.ModoSabioAtivado();


        //Criar ninja Sasuke Uchiha - Sasuke é um objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idades = 18;
        Sasuke.SharinganAtivado();


        //Criar Sakura Haruno - Sakura é um objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldei da Folha";
        Sakura.idades = 17;
        Sakura.AtivarCura();

        //Criar Hinata Hyuga - Hinata é um objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idades = 17;
        Hinata.Byakugan();

      Boruto Boruto = new Boruto();
      Boruto.nome = "Boruto Uzumaki";
      Boruto.aldeia = "Aldeia da Folha";
      Boruto.idades = 9;

      Boruto.ModoSabioAtivado();
      Boruto.AtivarOKarma();
      Boruto.AtivarJougan();


        System.out.println("\n======Testando method static int========");
        int resultado = StaticEVoid.somar(1,6);
        System.out.println(resultado);

        System.out.println("========Testando o method static void========");
        StaticEVoid.testandoStaticVoid();
    }
}
