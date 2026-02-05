import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nFeliz, contador = 0, suma = 0, resto;

        System.out.println("Teclea un número: ");
        nFeliz = teclado.nextInt();
        teclado.close();

        do {
            do {
                resto = nFeliz % 10;
                suma += Math.pow(resto, 2);
                nFeliz /= 10;
            }while(nFeliz > 0);
            nFeliz = suma;
            contador++;
        }while (contador < 100 && nFeliz != 1);
    }
}
