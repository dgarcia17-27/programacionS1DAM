package simulactoDeExamen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, decenas,unidades;
		boolean iguales = false;
		
		do {
			System.out.print("Teclea un número: ");
			n = teclado.nextInt();
			decenas = n / 10;
			unidades = n % 10;
			if(decenas == unidades) {
				iguales = true;
			}
		} while (iguales == false && (n <= 99 && n >= 0));
		System.out.println("El programa finalizó con éxito");
		teclado.close();
	}
}
