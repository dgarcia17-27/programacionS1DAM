package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio4 {

	/*
		Elabora un programa que nos pregunte nuestro peso, y calcule cuanto
		pesaríamos si nos vamos a vivir a la Luna. Sabemos que en la Tierra la
		gravedad en de 9.8, mientras que en la Luna es de 1.62
	*/
	
	public static void main(String[] args) {
		
		final double GRAVEDADTIERRA = 9.8;
		final double GRAVEDADLUNA = 1.62;
		
		
		Scanner teclado = new Scanner(System.in);
		double pesoTierra;
		
		System.out.print("Introduce tu peso: ");
		pesoTierra = teclado.nextDouble();
		
		double pesoLuna = pesoTierra * (GRAVEDADLUNA/GRAVEDADTIERRA);
		System.out.println("Tu peso en la luna es de: " + pesoLuna);
		
	}

}
