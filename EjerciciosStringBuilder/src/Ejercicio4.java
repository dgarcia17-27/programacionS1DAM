public class Ejercicio4 {

    /**
         Programa que rote una cadena tantas veces como se le diga.
             Introduciendo: “Lunes”
             Rotaciones: 3
         Da como salida: “nesLu”
     */

    public static void main(String[] args) {
        System.out.println(Rotacion(2, "Lunes"));
    }

    public static String Rotacion(int n, String frase){
        char auxiliar;
        StringBuilder rotada = new StringBuilder(frase);
        for (int i = 0; i < n; i++) {
            auxiliar = rotada.charAt(rotada.length() - 1);
            rotada.deleteCharAt(rotada.length() - 1);
            rotada.insert(0,auxiliar);
        }
        return rotada.toString();
    }
}
