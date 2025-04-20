package Nivel_Iniciante.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados nã primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos à ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println(nomeEmCaixaAlta);

        String aldeia = "VILA DA FOLH";
        String aldeiaEmCaixaMinuscula = aldeia.toLowerCase();
        System.out.println(aldeiaEmCaixaMinuscula);

        String aldeia2 = "VILA DA FOLHA";

        //Vendo se as Strings são íguais
        String eIgualA = String.valueOf(aldeia2.equalsIgnoreCase(aldeia));
        System.out.println("As duas aldeias tem o mesmo nome? (Ignorando o CaseSensitive) " + eIgualA);

        //Somando Strings
        String somandoString = String.valueOf(nome.length()+ aldeia2.length());
        System.out.println("Somando os cacaters das dua aldeias: " + somandoString);

        // Vendo se a String está vazia
        String stringVazia = String.valueOf(aldeia2.isEmpty());
        System.out.println("A String está vazia? " + stringVazia);

        //Usando o método CompareTo
        String comparandoVariaveisString = String.valueOf(aldeia.compareTo(aldeia2 ));
        System.out.println("Comparando as quantidades de caracteres das variáveis? " + comparandoVariaveisString);

        //Substituindo letras
        String trocandoLetras = String.valueOf(aldeia2.replace("DA FOLHA", "DO FOGO"));
        System.out.println(trocandoLetras);
    }
}
