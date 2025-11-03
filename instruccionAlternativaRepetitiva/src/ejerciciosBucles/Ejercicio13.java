package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio13 {

    /*
        Programa que obtenga el minimo comun multiplo(mcm) de dos numeros.
        Ejemplo: descomponemos los numeros en sus factores 10 (2 * 5) y 18 (2 * 9)
        entonces el mcm es (2 * 5 * 9).
            Introduciendo: 10 18
            Da como salida: 90
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2, mcm,mcd, aux, a, b;

        System.out.print("Teclea un número: ");
        n1 = teclado.nextInt();
        System.out.print("Teclea un segundo número: ");
        n2 = teclado.nextInt();
        teclado.close();

        a = n1;
        b = n2;
        
        while (b != 0) {
            aux = b;
            b = a % b;
            a = aux;
        }
        mcd = a;

        mcm = (n1 * n2) / mcd;
        System.out.println(mcm);
    }
}
