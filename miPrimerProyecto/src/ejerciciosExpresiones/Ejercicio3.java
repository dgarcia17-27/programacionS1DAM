package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio3 {

	/*
		Programa que permita teclear un número correspondiente a un año y
		calcule y visualice si es bisiesto o no. (Un año es bisiesto si es múltiplo
		de 4 y no es múltiplo de 100 o bien es múltiplo de 400).
	*/
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int año;
		
		System.out.print("Introduce un año para saber si es bisiesto: ");
		año = teclado.nextInt();
		
		boolean resultado = año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
		System.out.println("¿El año " + año + " es bisiesto?: " + resultado);
	}

}
