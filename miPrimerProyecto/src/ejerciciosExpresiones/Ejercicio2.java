package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	  Diseña un programa que indique si un número pasado por teclado es
	  múltiplo de siete o no.
	  */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int multiplo;
		
		System.out.println("Introduce un número para comprobar si es múltiplo de 7: ");
		multiplo = teclado.nextInt();
		
		boolean resultado = multiplo % 7 == 0;
		System.out.println("¿Es " + multiplo + " multiplo de 7?: " + resultado);

	}

}
