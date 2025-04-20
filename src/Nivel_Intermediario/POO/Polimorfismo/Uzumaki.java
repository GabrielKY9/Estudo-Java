package Nivel_Intermediario.POO.Polimorfismo;

public class Uzumaki extends Ninja{

    @Override
    public void habilidadeEspecial(){
        System.out.printf("%s %s %s%n", "Meu nome é ", nome, " sou um Uzumaki e minha hablidade especial é: RASENGANNN!!!");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha");
    }
}
