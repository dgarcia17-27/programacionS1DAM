import java.util.Arrays;

public class Ejercicio8 {

    /**
     Un cuadrado mágico es una matriz cuadrada de números en la que la suma de cada fila, cada columna y
     ambas diagonales es la misma.
     Escribe un metodo que reciba un array 2D de enteros y devuelva un valor booleano, true si es un cuadrado
     mágico, o false en caso contrario.
         Ejemplos:
             Entrada: [[8, 1, 6], [3, 5, 7], [4, 9, 2]]
             Salida: true
             Entrada: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
             Salida: false
     */

    public static void main(String[] args) {
        int[][] numeros = {
                {8,1,6},
                {3,5,7},
                {4,9,2}
        };

        int[] sumaCols = new int[3];
        int[] sumaRows = new int[3];
        int[] sumaDiagonales = new int[2];

        // Sumar columnas y filas
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaRows[i] += numeros[i][j];
            }
            for (int k = 0; k < numeros[i].length; k++) {
                sumaCols[i] += numeros[k][i];
            }
        }

        // DIAGONALES
        for (int i = 0; i < sumaDiagonales.length; i++) {
            if (i == 0){
                for (int j = 0; j < numeros.length; j++) {
                    sumaDiagonales[i] += numeros[j][j];
                }
            } else {
                for (int k = numeros.length - 1; k >= 0; k--) {
                    sumaDiagonales[i] += numeros[k][k];
                }
            }
        }

        if(Arrays.equals(sumaRows, sumaCols)){
            int[] comp = Arrays.copyOf(sumaRows, sumaDiagonales.length);
            System.out.println(Arrays.equals(comp, sumaDiagonales));
        } else {
            System.out.println(false);
        }

    }
}
