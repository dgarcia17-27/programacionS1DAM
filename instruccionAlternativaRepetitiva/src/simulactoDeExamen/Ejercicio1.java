package simulactoDeExamen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.println("Telcea un número: ");
		n = teclado.nextInt();
		
		for (int i = 0; n % 11 != 0 || (n>= 99 && n<=0);) {
			System.out.println("Telcea un número: ");
			n = teclado.nextInt();
		}
		
		System.out.println("El programa finalizó con éxito");
		teclado.close();
	}
}
