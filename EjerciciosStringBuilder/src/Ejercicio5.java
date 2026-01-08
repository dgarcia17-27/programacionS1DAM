public class Ejercicio5 {

    /**
         Programa que lea un numero double, lo convierta a una cadena y le añada las
         comas separadoras de los miles.
             Introduciendo: 2388432.34
             Da como salida: “2,388,432.34”
     */

    public static void main(String[] args) {
        System.out.println(milesimas(2388432.34));
    }
    public static String milesimas(double numero){
        int contador = 0;
        StringBuilder num = new StringBuilder(String.valueOf(numero));
        for (int i = num.length()-1; i >= 0; i--) {
            if (num.charAt(i) != '.'){
                contador ++;
                if (contador == 3){
                    num.insert(i, ',');
                    contador = 0;
                }
            }else{
                contador = 0;
            }
        }
        return num.toString();
    }
}
