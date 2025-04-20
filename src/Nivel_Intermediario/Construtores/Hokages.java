package Nivel_Intermediario.Construtores;

public class Hokages {
    String nome, aldeia;
    int idade, missoes;
    boolean VivoOuNao;
    double saldoBancario, altura;

        //Construtor vazio, sem argumentos 'No-Args'
    /*
    * public Hokages(){
    *   Construtor Vazio - No-Args
    * }
    * */


    //Criar um construtor com argumentos
    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    //All args - Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean VivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.VivoOuNao = VivoOuNao;
    }

    /*
    * Criando automaticamente os construtores por meio da shortcut "Ctrl + N"
    * para poder criar um construtor com todos os atributos.
    * */
    public Hokages(String nome, String aldeia, int idade, int missoes, boolean vivoOuNao, double saldoBancario, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.missoes = missoes;
        VivoOuNao = vivoOuNao;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    //Criando uma Construtor 'Defalt' para caso não seja inserido um parametro pelo usuário, apareceça esse construtor
    public Hokages() {
        this.nome = "Nome desconhecido";
    }
}
