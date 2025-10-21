package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*
	 	Programa que solitite un numero n y luego muestre por pantalla la siguiente
		figura:
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		teclado.close();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
