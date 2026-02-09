package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex8 {

    /**
         Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro
         mágico aquel en el que las filas, las columnas y las diagonales suman igual.

             15 8 1 24 17
             16 14 7 5 23
             22 20 13 6 4
             3 21 19 12 10
             9 2  25 18 11
     */

    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        int suma = 0;
        int[] sumaCols = new int[5];
        int[] sumaRows = new int[5];
        int[] sumaDiag = new int[2];
        Random random = new Random();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println(" ------ TABLA ------ ");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        // Filas
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                suma += tabla[i][j];
            }
            sumaRows[i] = suma;
            suma = 0;
        }
        // Columnas
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                suma += tabla[j][i];
            }
            sumaCols[i] = suma;
            suma = 0;
        }

        // Matriz 1
        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i][i];
        }
        sumaDiag[0] = suma;
        suma = 0;
        // Matriz 2
        for (int i = tabla.length - 1; i >= 0; i--) {
            suma += tabla[i][i];
        }
        sumaDiag[1] = suma;
        suma = 0;

        if (Arrays.equals(sumaCols,sumaRows) && sumaCols[0] == sumaDiag[0] && sumaCols[0] == sumaDiag[1]){
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }

    }
}
