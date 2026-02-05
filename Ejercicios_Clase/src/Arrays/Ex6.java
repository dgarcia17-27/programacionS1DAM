package Arrays;

import java.util.Arrays;

public class Ex6 {

    /**
         Programa que rellene un array de 4x4 de la siguiente manera:

             1 0 0 0
             0 1 0 0
             0 0 1 0
             0 0 0 1
     */

    public static void main(String[] args) {

        int[][] tabla = new int[4][4];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i][i] = 1;
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

    }
}
