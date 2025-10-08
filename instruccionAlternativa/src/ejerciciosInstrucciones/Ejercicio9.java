package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio9 {
	
	/*
	  	Pedir un número entre 0 y 9.999, decir si es capicúa.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int aux,num,resto,numReves = 0;
		
		System.out.print("Introduce un número entre 0 - 9999 para comprobar si es capicúa: ");
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
			if(numReves == num) {
				System.out.println("El número introducido es capicúa.");
			}else {
				System.out.println("El número introducido no es capicúa.");
			}
		}
		
	}
}
