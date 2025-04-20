package Desafios.Desafio04;

public class NinjaBasico implements Ninja{

    @Override
    public void mostrarInformacoes(){
        System.out.println("Este é um Ninja Básico, ou seja, é um figurante.");
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Jogando Shuriken!!!");
    }
}
