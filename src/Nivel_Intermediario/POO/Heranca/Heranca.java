package Nivel_Intermediario.POO.Heranca;

public class Heranca {

    //Exemplo de Herança em Jaa com Naruto
    private String nome;

        public Heranca(String nome){
            this.nome = nome;
        }

        public void atacar(){
            System.out.println(nome + " realizou um ataque básico!");
        }

        public String getNome(){
            return nome;
        }
        }

class NinjaDeTaijutsu extends Heranca{
    public NinjaDeTaijutsu(String nome){
        super(nome);
    }

    @Override
    public void atacar(){
        System.out.println(getNome() + " realizou um poderoso golpe de Taijutsu!");
    }
}

class NinjaDeNinjutsu extends Heranca{
    public NinjaDeNinjutsu(String nome){
        super(nome);
    }

    public void atacar(){
        System.out.println(getNome() + " realizou um jutsu impressionante!");
    }
}