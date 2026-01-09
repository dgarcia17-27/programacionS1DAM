public class Ejercicio8 {

    /**
         Igual al anterior, pero sumando los números completos.
             Introduciendo: “15 de Noviembre de 2022”
             Da como salida: 2037
     */

    public static void main(String[] args) {
        System.out.println(sumar("15 de Enero de 2022"));
    }

    public static int sumar(String frase) {
        int suma = 0;
        StringBuilder numero = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isDigit(c)) {
                numero.append(c);
            } else {
                if (numero.length() > 0) {
                    suma += Integer.parseInt(numero.toString());
                    numero.setLength(0);
                }
            }
        }
        if (numero.length() > 0) {
            suma += Integer.parseInt(numero.toString());
        }

        return suma;
    }
}