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
		double numPremiado = (int)(Math.random()*100000);
		int numJugado;
		
		System.out.print("Introduce el número jugado: ");
		numJugado = teclado.nextInt();
		teclado.close();
		
		System.out.printf("El número premiado es: %05d\n",(int)numPremiado);
		String longitud = String.valueOf(numJugado);
		
		if(longitud.length() != 5) {
			System.out.println("ERROR: El número de lotería introducido no es válido.");
		} else if(numJugado == numPremiado){
			System.out.println("Has ganado la lotería!!!");
		}else if((numJugado / 10000) == (numPremiado / 10000) || (numJugado % 10) == (numPremiado % 10)) {
			System.out.println("Si tiene reintegro.");
		} else {
			System.out.println("La próxima vez será.");
		}

	}

}
