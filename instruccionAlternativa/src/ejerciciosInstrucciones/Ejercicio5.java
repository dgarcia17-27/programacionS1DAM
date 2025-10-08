package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 	Programa que calcule las soluciones de una ecuación de segundo grado. La
		ecuación es aX2 + bX + c = 0. Y la solución se calcula como:

		La solución depende del discriminante b2 − 4ac , de manera que si el resultado del discriminante es:

			• Si el discriminante es >0 existen dos soluciones.
			• Si el discriminante es <0 no existe solución real.
			• Si el discriminante es =0 solo existe una solución.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numA, numB, numC, incognita1, incognita2, discriminante;
		
		System.out.print("Introduce el valor de A: ");
		numA = teclado.nextDouble();
		System.out.print("Introduce el valor de B: ");
		numB = teclado.nextDouble();
		System.out.print("Introduce el valor de C: ");
		numC = teclado.nextDouble();
		teclado.close();
		
		discriminante = Math.pow(numB, 2) - 4 * numA * numC;
		
		if (discriminante < 0) {
			System.out.println("No existe una solución real.");
		}else if(discriminante > 0) {
			incognita1 = (-numB + Math.sqrt(discriminante)) / (2 * numA);
			incognita2 = (-numB - Math.sqrt(discriminante)) / (2 * numA);
			System.out.printf("El valor de x de la primera posibilidad es: %f\n",incognita1);
			System.out.printf("El valor de x de la segunda posibilidad es: %f\n",incognita2);
			
		}else if(discriminante == 0) {
			incognita1 = -numB / (2*numA);
			System.out.printf("El valor de x es de: %f", incognita1);
		}else {
			System.out.println("ERROR: Algo no funcionó bien.");
		}
		
	}

}
