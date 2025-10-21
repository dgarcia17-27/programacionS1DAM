package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 	Programa que lea 5 números y diga cuántos son múltiplos de 3, cuántos
		múltiplos de 5 y cuántos no están incluidos en ninguno de los grupos anteriores.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, multip3 = 0, multip5 = 0, ninguno = 0;
		
		for (int i = 0; i < 5;i++) {
			System.out.print("Teclea un número: ");
			num = teclado.nextInt();
			if(num % 3 == 0) {
				multip3++;
			} else if(num % 5 == 0) {
				multip5++;
			} else {
				ninguno++;
			}
		}
		System.out.printf("%d múltiplos de 3\n",multip3);
		System.out.printf("%d múltiplos de 5\n",multip5);
		System.out.printf("%d no son múltiplos de nada\n",ninguno);
		
		teclado.close();
	}
}
