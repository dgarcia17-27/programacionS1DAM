package ejerciciosBucles;

public class Ejercicio10 {
    
    /**
        Calcular todos los números de tres cifras tales que la suma de los cubos de las
        cifras es igual al valor del número. (Dado el 153 entonces 1³+5³+3³=153).
            Da como salida: 153 370 371 407
     */

    public static void main(String[] args) {
        int n1, n2, n3;
        for (int i = 100; i < 999; i++) {
            n1 = i / 100;
            n2 = (i / 10) % 10;
            n3 = i % 10;
            if (Math.pow(n1, 3) + Math.pow(n2, 3) + Math.pow(n3, 3) == i ) {
                System.out.print(i + " ");
            }
        }
    }
}
