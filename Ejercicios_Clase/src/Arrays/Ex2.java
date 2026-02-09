package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {

    /**
         Dado un array de números enteros, realiza un programa que diga si está
         ordenado o no.
     */

    public void main(String[] args) {

        int[] numeros = new int[50]; // Crear un array vacío
        Random random = new Random();

        for (int i = 0; i < 50; i++) { // Uso for para rellenar el array con 50 números
            numeros[i] = random.nextInt(100) + 1; // Con random rellenamos el array de numeros
        }

        int[] ordenados = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ordenados);

        if (Arrays.equals(numeros,ordenados)){ // Comparar si dos arrays son iguales
            System.out.println("El array está ordenado");
        } else {
            System.out.println("El array no está ordenado");
        }
    }
}
