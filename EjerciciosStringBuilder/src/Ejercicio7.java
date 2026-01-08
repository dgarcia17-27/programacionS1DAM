public class Ejercicio7 {

    /**
         Programa que sume todas las cifras de los números que aparecen en una
         cadena de caracteres.
             Introduciendo: “15 de Noviembre de 2022”
             Da como salida: 12
     */

    public static void main(String[] args) {
        System.out.println(sumar("01 de Enero de 2026"));
    }

    public static int sumar(String frase) {
        int suma = 0;
        for (int i = 0; i < frase.length(); i++) {
            char aux = frase.charAt(i);
            if (Character.isDigit(aux)) {
                suma += Character.getNumericValue(aux);
            }
        }
        return suma;
    }
}
