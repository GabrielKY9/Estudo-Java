package Nivel_Intermediario.POO.Polimorfismo;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial Uchiha: KATOOON!!");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha");
    }
}
