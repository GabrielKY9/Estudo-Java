package Nivel_Intermediario.POO.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunnin, Jounin, Hokage

    String nome, aldeia;
    int idade, NumeroDeMissoesConcluidas;
    NivelNinja rank;

        //TODO: Sobrecarga dp construtor chamando os novos atributos


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        NumeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //Métodos geral! Todos os ninjas vão ter
        public void habilidadeEspecial(){
            System.out.println("Meu nome é " + nome + " e esse é meu ataque especial: ");
        }

        //Sobreescrevendo o método da interface
        @Override
        public void estrategiaDeBatalhaNinja(){
            System.out.println("Essa é minha estratégia de batalha!");

        }

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}