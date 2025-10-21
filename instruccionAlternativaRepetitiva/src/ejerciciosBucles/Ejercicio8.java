package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*
	 	Programa que descomponga un número en sus factores primos.

			Introduciendo: 75
			Da como salida : 3 5 5
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		teclado.close();
		
		for (int i = 2; num != 1; i++) {
			while(num % i == 0) {
				num /= i;
				System.out.print(i + " ");
			}
		}
	}
}
