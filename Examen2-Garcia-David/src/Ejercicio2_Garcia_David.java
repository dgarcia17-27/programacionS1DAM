import java.util.Scanner;

public class Ejercicio2_Garcia_David {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, resto, nDepuradoInv = 0, nDepurado = 0;

        System.out.println("Teclea un número: ");
        n = teclado.nextInt();
        teclado.close();

        // Compruebo si hay algún cero en el número introducido y no lo añado.
        while(n != 0){
            resto = n % 10;
            if (resto != 0){
                nDepuradoInv = (nDepuradoInv * 10) + resto;
            }
            n /= 10;
        }

        // Le doy otra vez la vuela al número que ya está depurado para que se vea correctamente.
        while (nDepuradoInv != 0){
            resto = nDepuradoInv % 10;
            nDepurado = (nDepurado * 10) + resto;
            nDepuradoInv /= 10;
        }
        System.out.printf("Secuencia depurada: %d",nDepurado);
    }
}
