package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio12 {

    /*
        Programa que solitite un numero n y luego muestre por pantalla la siguiente
        figura:
            Introduciendo: 6
            Da como salida:
                      1
                    1 2 1
                  1 2 3 2 1
                1 2 3 4 3 2 1
              1 2 3 4 5 4 3 2 1
            1 2 3 4 5 6 5 4 3 2 1
     */
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Teclea un número: ");
        n = teclado.nextInt();
        teclado.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int k = i - 1; k >= 1 ; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
