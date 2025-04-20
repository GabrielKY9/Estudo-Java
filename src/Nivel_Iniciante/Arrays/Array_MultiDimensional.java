package Nivel_Iniciante.Arrays;

public class Array_MultiDimensional {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][4];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";
        ninjasEAldeias[0][3] = "Sakura";

        ninjasEAldeias[1][0] = "Vila da areia";
        ninjasEAldeias[1][1] = "Gaara";
        ninjasEAldeias[1][2] = "Kankuro";
        ninjasEAldeias[1][3] = "Temari";

        ninjasEAldeias[2][0] = "Pais do relampago";
        ninjasEAldeias[2][1] = "Ay";
        ninjasEAldeias[2][2] = "Killer B";
        ninjasEAldeias[2][3] = "Darui";

        for (int i = 0; i < ninjasEAldeias.length; i++){
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - Ninjas: " + ninjasEAldeias[i][1] + ", " + ninjasEAldeias[i][2]  + ", " + ninjasEAldeias[i][3]);
        }
    }
}