package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 	Crea un programa que pida cual es el radio de una circunferencia y nos
		calcule cual es la longitud y el área.
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int radio;
		
		System.out.print("Introduce el radio de la circunferencia, para extraer el área y su longitud: ");
		radio = teclado.nextInt();
		
		double area = Math.PI * Math.pow(radio, 2);
		double longitud = 2 * Math.PI * radio;
		
		System.out.println("Área= " + area);
		System.out.println("Longitud= " + longitud);

	}

}
