import java.util.Scanner;

public class Ejercicio2 {

    /**
         Programa que reciba una cadena y diga cuantas palabras contiene. (Las
         palabras pueden estar separadas por espacios, puntos o comas).
             Introduciendo: “Hola a todos.Adios”
             Da como salida: 4
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        int contador = 0;

        System.out.println("Teclea una frase: ");
        frase = teclado.nextLine();
        teclado.close();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ',' || frase.charAt(i) == ' ' || frase.charAt(i) == '.'){
                contador++;
            }
        }
        System.out.println(contador + 1);
    }
}
