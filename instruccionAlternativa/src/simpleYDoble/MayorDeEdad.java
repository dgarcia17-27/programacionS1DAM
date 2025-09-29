package simpleYDoble;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int edad;
		
		System.out.println("Introduce tu edad: ");
		edad = teclado.nextInt();
		teclado.close();
		
		
		// Uso de alternativa simple
		if (edad >= 18) {
			System.out.println("Enhorabuena, ya puedes votar!");
		}
		
		
		// Uso de alternativa doble
		if (edad >= 18) {
			System.out.println("Enhorabuena, ya puedes votar!");
		} else {
			System.out.println("Lo siento, no puedes votar!");
		}
		
	}

}
