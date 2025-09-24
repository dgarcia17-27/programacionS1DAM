package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio9 {

	/*
	 	Prepara un programa que pide por teclado un número entero entre 0 y
		99999, y lo escribe del revés.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		
		int numReves = 0, restoNum;
		
		
		
		/* 
			Sirve para obtener el último número, añadirlo al principio
			de la variable de numeros al revés y luego elimina
			el número, del numero introducido para que 
			en cada iteración, se agregue un número y se elimine el mismo 
			de los introducidos.
		*/
		
		while (num > 0) {
			restoNum = num % 10;
			numReves = numReves * 10 + restoNum;
			num /= 10;
		}
		
		System.out.println("Del revés es: " + numReves );

	}

}
