import java.util.Scanner;

public class Ejercicio8_2 {

    /**
         Un cuadrado mágico es una matriz cuadrada de números en la que la suma de cada fila,
         cada columna y ambas diagonales es la misma.
         Escribe un metodo que reciba un array 2D de enteros y devuelva un valor booleano,
         true si es un cuadrado mágico, o false en caso contrario.
             Ejemplos:
             Entrada: [[8, 1, 6], [3, 5, 7], [4, 9, 2]]
             Salida: true
             Entrada: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
             Salida: false
     */

    public static void main(String[] args) {
        int sumaDiagD = 0, sumaDiagI = 0, sumaFilas = 0, sumaColumnas = 0;
        //diagonal derecha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j);{

                }
            }
        }
        //diagonal izquierda
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i++ == j--);{

                }
            }
        }
        //filas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j++);{

                }
            }
        }
        //columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i++ == j);{

                }
            }
        }
    }
}
