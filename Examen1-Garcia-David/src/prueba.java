import java.util.Scanner;

public class prueba {

    /**
        Realiza un programa que haga lo siguiente:
            - Introduce una serie de 12 números
            - Recoge el mayor y el menor introducido por el usuario
            - Se realiza el promedio de todos los valores introducidos (10 debido a que los
                valores más altos y más bajos no se van a sumar en dicho promedio).
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numActual, nMax, nMin, total = 0;

        System.out.print("Teclea un valor: ");
        numActual = teclado.nextInt();
        nMax = numActual;
        nMin = numActual;
        total += numActual;

        for (int i = 0; i < 11; i++) {
            System.out.print("Teclea un valor: ");
            numActual = teclado.nextInt();
            if (numActual > nMax){
                nMax = numActual;
            }
            if (numActual < nMin){
                nMin = numActual;
            }
            total += numActual;
        }
        System.out.println((total - (nMin + nMax)) / 10);
    }
}
