package Nivel_Intermediario.POO.Heranca;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokagesInterfaces{

    public void BoasVindas() {
        System.out.println("Eu sou um Hatake " + nome);
    }

    public void ativarSharingan(){
        System.out.println(nome + " e o seu Sharingan foi ativado!!");
    }

    public void ninjaDeElite(){
        System.out.println(nome + " e eu sou um ninja de elite da Anbu!");
    }

    public void Hokages() {
        System.out.println(nome + " e eu sou um Hokage!");
    }
}
