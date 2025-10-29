package simulactoDeExamen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Teclea un número: ");
			n = teclado.nextInt();
		} while (n % 11 != 0);
		System.out.println("El programa finalizó con éxito");
	}
}
