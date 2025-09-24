package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio7 {

	
	/*
	 	Prepara un programa que pide por teclado tres números y nos dice si
		están ordenados o no.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numA, numB, numC;
		
		
		System.out.print("Introduce el primer número: ");
		numA = teclado.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		numB = teclado.nextInt();
		
		System.out.print("Introduce el tercer número: ");
		numC = teclado.nextInt();
		
		
		boolean resultado = ((numA < numB) && (numB<numC)) || ((numA > numB) && (numB > numC));
		System.out.println("¿Están ordenados?: " + resultado);
	}

}
