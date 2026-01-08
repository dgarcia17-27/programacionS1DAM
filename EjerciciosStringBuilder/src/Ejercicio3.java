import java.util.Scanner;

public class Ejercicio3 {

    /**
         Programa que codifique una cadena cambiando cada letra por la siguiente en
         el código ASCII.
             Introduciendo: “Lunes”
             Da como salida: “Mvoft”
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Teclea una frase");
        // Asigno contenido directamente al StringBuilder.
        StringBuilder textoAscii = new StringBuilder(teclado.nextLine());

        char letra;

        for (int i = 0; i < textoAscii.length(); i++) {
            letra = textoAscii.charAt(i);
            letra++;
            textoAscii.setCharAt(i,letra);
        }
        System.out.println(textoAscii);
    }
}
