public class Ejercicio6 {

    /**
         Programa que descubra si una palabra es o no palíndroma, es decir se lee
         igual del derecho que del revés.
             Introduciendo: “oso”
             Da como salida: true
     */

    public static void main(String[] args) {
        System.out.println(palindromo("hola"));
    }
    public static boolean palindromo(String frase){
        StringBuilder reves = new StringBuilder(frase);
        if (reves.reverse().toString().equals(frase)){
            return true;
        }else {
            return false;
        }
    }
}
