import java.util.Scanner;

public class Garcia_David_Ejercicio3 {

    /**
        @author David García I Tejada
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Creo el input del teclado
        int numero, numeroReves = 0, resto, aux; // Creo las variables

        System.out.print("Teclea un número: "); // Solicito el número
        numero = teclado.nextInt(); // Asigno el input a la variable entera
        aux = numero; // Asigno a la variable aux el valor de numero, para no perder su valor, para luego ser impreso
        while (aux != 0){ // Quiero que mientras el auxiliar sea diferente a 0 se ejecute el programa
            resto = aux % 10; // Voy sacando el último número del introducido
            numeroReves = (numeroReves * 10) + resto; /*Al numeroReves = 0 lo multiplico * 10 y le sumo el resto para
            que se vaya invirtiendo la secuencia de números*/
            aux /= 10; // Se divide entre 10 para en la proxima iteracion, ya no esté el resto que quitamos en la parte superior
        }
        if (numero == numeroReves){ // Compruebo si el número al reves es igual que el número original
            System.out.printf("La secuencia %d armoniza con el cosmos! Es un NSR", numero); // Si se cumple la condicion se va a imprimir ese texto.
        } else {
            System.out.printf("La secuencia %d produce disonancia dimensional. No es un NSR", numero); // En caso de que no se cumpla, imprime este texto.
        }
    }
}
