package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 	Diseñar un algoritmo para leer las longitudes de los lados de un triángulo (A, B,
		C) y determinar qué tipo de triángulo es, de acuerdo a los siguientes casos.
		Suponiendo que A es el mayor de los lados y que B y C corresponden a los otros
		dos lados entonces:
		
			Si A >= B+C no se trata de un triángulo
			Si A2 = B2+C2 es triángulo rectángulo
			Si A2 > B2+C2 triángulo obtusángulo
			Si A2 < B2+C2 triángulo acutángulo
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int ladoA,ladoB,ladoC;
		
		System.out.print("Introduce el valor del lado A: ");
		ladoA = teclado.nextInt();
		System.out.print("Introduce el valor del lado B: ");
		ladoB = teclado.nextInt();
		System.out.print("Introduce el valor del lado C: ");
		ladoC = teclado.nextInt();
		teclado.close();
		
		if (ladoA >= (ladoB + ladoC)) {
			System.out.println("No es un triángulo.");
		} else if(Math.pow(ladoA, 2) == (Math.pow(ladoB, 2) + (Math.pow(ladoC, 2)))){
			System.out.println("Es un triángulo rectangulo.");
		} else if(Math.pow(ladoA, 2) > (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
			System.out.println("Es un triángulo obtusángulo.");
		}else {
			System.out.println("Es un triángulo acutángulo.");
		}
		
	}

}
