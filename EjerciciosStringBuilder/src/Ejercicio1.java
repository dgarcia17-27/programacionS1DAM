import java.util.Scanner;

public class Ejercicio1 {

    /**
         Programa que pase un String a mayúsculas y diga cuantas letras han
         cambiado.
             Introduciendo: “Hola a Todos”
             Da como salida: “HOLA A TODOS” 8 cambios
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase,fraseUpper;
        int contador = 0;
        System.out.println("Introduce la frase");
        frase = teclado.nextLine();
        teclado.close();

        fraseUpper = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != fraseUpper.charAt(i)){
                contador++;
            }
        }
        System.out.printf("'%s' %d cambios", fraseUpper,contador);
    }
}
