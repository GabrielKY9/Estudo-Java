package Nivel_Intermediario.POO.Polimorfismo;

import Nivel_Intermediario.POO.Heranca.Heranca;

public class Polimorfismo {

//Exemplo de Polimorfismo em Java com Naruto
public static void main(String[] args) {

    Heranca narutoUzumaki = new Heranca("Naruto");
    Heranca rockLee = new Heranca("Rock Lee");

    realizarAtaque(narutoUzumaki);
    realizarAtaque(rockLee);
    }

    public static void realizarAtaque(Heranca heranca){
    heranca.atacar(); //Método atacar é chamado de forma polimórfica.
    }
}
