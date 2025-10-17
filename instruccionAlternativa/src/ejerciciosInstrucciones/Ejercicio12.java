package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 	Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el
		segundo siguiente.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int hora,min,seg;
		
		System.out.print("Introduce la hora: ");
		hora = teclado.nextInt();
		System.out.print("Introduce los minutos: ");
		min = teclado.nextInt();
		System.out.print("Introduce los segundos: ");
		seg = teclado.nextInt();
		teclado.close();
		
		++seg;
		
		if (seg > 59) {
			++min;
			seg = 0;
		}
		if(min > 59) {
			++hora;
			min = 0;
		}
		if(hora > 23) {
			hora = 0;
		}
		
		System.out.printf("La hora introducida con un segundo más es: %02d:%02d:%02d",hora,min,seg);
	}

}
