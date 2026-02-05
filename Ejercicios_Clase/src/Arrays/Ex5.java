package Arrays;

import java.util.Random;

public class Ex5 {

    /**
         Dado un array de 50 números entre 1 y 100, Escribir una lista ordenada con los
         valores que no aparecen en el array.
     */

    public static void main(String[] args) {

        int[] numeros = new int[50];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        for (int i = 1; i <= 100; i++) {

        }

    }
}
