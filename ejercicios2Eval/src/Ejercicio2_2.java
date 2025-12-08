import java.util.Scanner;

public class Ejercicio2_2 {

    /**
     ¿Alguna vez has visto palabras como camelCasing o miVariableSuperLarga? Este estilo de escritura se llama
     ”Camel Case” y es muy común en programación. Las palabras se escriben juntas, sin espacios, y cada palabra
     después de la primera empieza con mayúscula.
     Tu misión es crear una función que rompa el Camel Case, insertando un espacio antes de cada letra mayúscula
     que encuentre dentro de la palabra. EJEMPLOS:
     camelCasing = ”camel” + ”Casing”
     miVariableLarga = ”mi” + ”Variable” + ”Larga”
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "";

        System.out.println("Teclea tu camelCasing variable: ");
        frase = teclado.nextLine();

        System.out.println(deCamelCasing(frase));
    }

    public static String deCamelCasing(String frase){
        String fraseDef = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == frase.toUpperCase().charAt(i)){
                fraseDef += "+" + frase.charAt(i);
            } else {
                fraseDef += frase.charAt(i);
            }
        }

        return fraseDef;
    }
}
