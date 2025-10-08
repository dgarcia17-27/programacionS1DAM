package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 	Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int aux,num, resto, numReves = 0;
		
		System.out.print("Introduce un número entre 0 - 9999: ");
		num = teclado.nextInt();
		teclado.close();
		
		if (num < 0 || num > 9999) {
			System.out.println("ERROR: El número introducido no es válido.");
		} else {
			aux = num;
			while (aux > 0) {
				resto = aux % 10;
				numReves = numReves * 10 + resto;
				aux /= 10;
			}
			System.out.printf("El número introducido %d al revés es: %d", num, numReves);
		}

	}

}
