import java.util.Scanner;

public class Ejercicio1_Garcia_David {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double x,n,e = 0,suma = 0,factorial = 1;

        System.out.print("Teclea el valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Teclea el valor de n: ");
        n = teclado.nextDouble();
        teclado.close();

        suma = 1 + x;

        for (int i = 1; i <= n; i++) {
            suma = Math.pow(x,i) / (factorial *= i);
            System.out.println(suma);
            e += suma;
        }
        System.out.printf("El valor aproximado de e^x es de: %.04f",e);
    }
}
