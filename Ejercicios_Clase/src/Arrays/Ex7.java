package Arrays;

import java.util.Random;

public class Ex7 {

    /**
         Dado un array de 3x3 elementos, calcular la suma de sus filas y sus columnas
         almacenándolas en dos array de 3 elementos.
     */

    public static void main(String[] args) {
        int[][] tabla = new int[3][3];
        int suma = 0;
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
        System.out.println("\n ------ SUMA FILAS ------ ");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                suma += tabla[i][j];
            }
            System.out.printf("Resultado suma fila %d: %d\n",i+1,suma);
            suma = 0;
        }

        System.out.println("\n ------ SUMA COLUMNAS ------ ");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                suma += tabla[j][i];
            }
            System.out.printf("Resultado suma columna %d: %d\n",i+1,suma);
            suma = 0;
        }
    }
}
