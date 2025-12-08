public class Ejercicio1 {

    /**
         Dada una cadena de texto, tu tarea es reemplazar cada letra por su posición correspondiente en el alfabeto.
         • Si un carácter no es una letra (por ejemplo, números, signos de puntuación, espacios), se omite y no
         se incluye en el resultado.
         • Se considera que el alfabeto empieza con ”a” = 1, ”b” = 2, ..., ”z” = 26
         • El resultado debe ser una cadena donde los n ́umeros est ́en separados por espacios.
         NOTA: es obligatorio el uso de Strings
         Entrada: ”The sunset sets at twelve o’ clock.”
         Salida: ”20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11”
     */

    public static void main(String[] args) {

        System.out.print(Traducir());

    }

    public static String Traducir(){
        String abecedario = "abcdefghijklmnopqrstuvwxyz",
                frase = "The sunset sets at twelve o'clock",traducido = "";

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < abecedario.length(); j++) {
                if (frase.toLowerCase().charAt(i) == abecedario.charAt(j)){
                    traducido += j + 1 + " ";
                }
            }
        }
        return traducido;
    }

}
