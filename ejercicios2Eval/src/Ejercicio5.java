import java.util.Scanner;

public class Ejercicio5 {

    /**
         Escribe un metodo/función que tome como entrada una cadena de una o más palabras y devuelva la misma
         cadena, pero con todas las palabras que tengan cinco o más letras invertidas. Las cadenas pasadas como
         entrada solo contendrán letras y espacios. Los espacios solo se incluirán cuando haya más de una palabra.
         Ejemplos:
             "Hey fellow warriors" --> "Hey wollef sroirraw"
             "This is a test --> "This is a test"
             "This is another test" --> "This is rehtona test"
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la frase: ");
        StringBuilder frase = new StringBuilder(teclado.nextLine() + " ");
        StringBuilder palabra = new StringBuilder();
        String fraseModificada = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' '){
                palabra.append(frase.charAt(i));
            } else {
                if (palabra.length() > 4){
                    palabra.reverse();
                    fraseModificada += " " + palabra;
                    palabra.setLength(0);
                } else {
                    fraseModificada += " " + palabra;
                    palabra.setLength(0);
                }
            }
        }
        System.out.println(fraseModificada.trim());
    }
}
