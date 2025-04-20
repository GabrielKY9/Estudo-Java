package Desafios.Desafio04;

class NinjaAvancado implements Ninja{

    String nome, habilidade, especialidade;
    int idade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.printf("%s %s, %s%d %s %s, %s %s!%n", "Era uma vez um ninja avançado cujo nome era", nome, "ele tinha ", idade,
                            "de idade, sua habilidade era", habilidade, "e sua especialidade era", especialidade);

    }

    @Override
    public void executarHabilidade(){
        System.out.printf("%s %s.", "A especialidade deste ninja é ",especialidade);
    }
}

public class Main{
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico();
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Itachi Uchiha", 18, "Estilo Fogo", "Genjutsu");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}
