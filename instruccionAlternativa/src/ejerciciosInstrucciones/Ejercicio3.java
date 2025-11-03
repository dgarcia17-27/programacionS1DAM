package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 	Programa que obtenga la letra del DNI a partir del número. Para ello debe
		dividir el número entre 23(división entera), luego multiplicarlo por 23 y restar el
		resultado del valor original. La letra asociada al número vendrá dada por este
		resto en función de la siguiente tabla:
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int dni, resto, letra;
		
		System.out.print("Introduce tu número de DNI: ");
		dni = teclado.nextInt();
		teclado.close();
		
		resto = dni / 23;
		letra = dni - (resto * 23);
		
		System.out.println(letra);
		
		switch(letra) {
		case 0:
			System.out.println("La letra de tu DNI es: T");
			break;
		case 1:
			System.out.println("La letra de tu DNI es: R");
			break;
		case 2:
			System.out.println("La letra de tu DNI es: W");
			break;
		case 3:
			System.out.println("La letra de tu DNI es: A");
			break;
		case 4:
			System.out.println("La letra de tu DNI es: G");
			break;
		case 5:
			System.out.println("La letra de tu DNI es: M");
			break;
		case 6:
			System.out.println("La letra de tu DNI es: Y");
			break;
		case 7:
			System.out.println("La letra de tu DNI es: F");
			break;
		case 8:
			System.out.println("La letra de tu DNI es: P");
			break;
		case 9:
			System.out.println("La letra de tu DNI es: D");
			break;
		case 10:
			System.out.println("La letra de tu DNI es: X");
			break;
		case 11:
			System.out.println("La letra de tu DNI es: B");
			break;
		case 12:
			System.out.println("La letra de tu DNI es: N");
			break;
		case 13:
			System.out.println("La letra de tu DNI es: J");
			break;
		case 14:
			System.out.println("La letra de tu DNI es: Z");
			break;
		case 15:
			System.out.println("La letra de tu DNI es: S");
			break;
		case 16:
			System.out.println("La letra de tu DNI es: Q");
			break;
		case 17:
			System.out.println("La letra de tu DNI es: V");
			break;
		case 18:
			System.out.println("La letra de tu DNI es: H");
			break;
		case 19:
			System.out.println("La letra de tu DNI es: L");
			break;
		case 20:
			System.out.println("La letra de tu DNI es: C");
			break;
		case 21:
			System.out.println("La letra de tu DNI es: K");
			break;
		case 22:
			System.out.println("La letra de tu DNI es: E");
			break;
		}

	}

}
