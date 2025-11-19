import java.util.Scanner;

public class Garcia_David_Ejercicio1 {

    /**
        @author David García I Tejada

     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, reves, revesDef = 0,resto;

        System.out.print("Ingrese el numero: "); // Pedir al usuario el número
        numero = teclado.nextInt();

        reves = numero;

        // Bucle para solicitar números al usuario hasta que introduzca un 0
        for (int i = 0; numero != 0 && numero > 0 && numero <= 9;) {
            System.out.print("Ingrese el numero: "); // Pedir al usuario el número
            numero = teclado.nextInt();
            reves = (reves * 10) + numero;
        }
        // Bucle para invertir el número
        while(reves != 0){
            resto = reves % 10; // Sacar el resto
            revesDef = revesDef * 10 + resto; // Multiplicar * 10  el número que tengo y sumar el resto
            reves /= 10; // Dividir entre 10 para que en la proxima iteracion se quite el número que fue el resto
        }
        System.out.print(revesDef);
        teclado.close();
    }
}
