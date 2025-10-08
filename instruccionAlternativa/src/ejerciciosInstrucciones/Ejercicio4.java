package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 	Programa que nos diga si un número ha conseguido o no el reintegro en el
		sorteo de la ONCE. Un número de cinco cifras consigue el reintegro si su
		primera o última cifra coincide con la primera o última cifra del número
		agraciado en el sorteo.
		
			Introduciendo: 23745 y premiado es 29348
			Da como salida: Si tiene reintegro
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		final String NUM_PREMIADO = "29348";
		String num_loteria;
		
		System.out.print("Introduce tu número de la lotería: ");
		num_loteria = teclado.nextLine();
		teclado.close();
		
		if(num_loteria.length() != 5) {
			System.out.println("Error: El número de lotería introducido no es válido");
		}else if(num_loteria.charAt(0) == NUM_PREMIADO.charAt(0) || num_loteria.charAt(4) == NUM_PREMIADO.charAt(4)){
			System.out.println("Si tiene reintegro.");
		}else {
			System.out.println("No has ganado nada. La próxima vez será.");
		}
		

	}

}
