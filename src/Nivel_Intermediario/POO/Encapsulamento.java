package Nivel_Intermediario.POO;

public class Encapsulamento {

    //Exemplo de encapsulamento de uma class Ninja
      private String nome;
      private int nivelChakra;

      public Encapsulamento(String nome, int nivelChakra) {
          this.nome = nome;
          this.nivelChakra = nivelChakra;
      }

      public void treinar(int horas){
          if(horas > 0){
              nivelChakra += horas * 10; // Cada hora de treinamento aumenta o chakra
          }
      }

      public int getNivelChakra(){
          return nivelChakra;
      }

      public String getNome(){
          return getNome();
      }
}