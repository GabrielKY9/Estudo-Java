package Desafios.Desafio03;

public class Ninja {
    String nome, missao, nivelDificuldade, statusMissao;
    int idade;

    public void mostarInformacoes(){
System.out.println("O nome do nija é " + nome + ", sua idade é " + idade + ", sua misssão é " + missao + ", que tem o grau de dificuldade " + nivelDificuldade + ", e o status da missão é " + statusMissao);
    }

    public static class Uchiha extends Ninja {

        String habilidadeEspecial;

        public String mostrarHabilidadeEspecial(){
            return "Sua hablidade especial é " + habilidadeEspecial;
        }

        @Override
        public void mostarInformacoes() {
            System.out.println("O nome do nija é " + nome + ", sua idade é " + idade + ", sua misssão é " + missao + ", que tem o grau de dificuldade " + nivelDificuldade + ", o status da missão é " + statusMissao + " e sua habilidade especial é " + mostrarHabilidadeEspecial());
        }
    }
}
