import java.util.Scanner;

public class Ejercicio3_Garcia_David {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int AMPLITUDMAX = 12, AMPLITUDMIN = 1;
        int n, suma = 0;
        double resultado = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Teclea el valor de amplitud: ");
            n = teclado.nextInt();
            if (n != AMPLITUDMAX && n != AMPLITUDMIN){
                suma += n;
            }
        }
        resultado = suma / 12.0;
        System.out.printf("La amplitud media corregida de las emisiones de la ballena es: %.04f",resultado);
    }
}
