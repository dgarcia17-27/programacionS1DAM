package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 	Realizar un programa que dada una medida de tiempo expresada en horas,
		minutos y segundos con valores arbitrarios, elabore un programa que
		transforme dicha medida en una expresión correcta.
		
			Introduciendo: 3 Horas 118 Minutos 195 Segundos
			Da como salida: 5 Horas 1 Minuto 15 Segundos
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int horas,min,seg,aux;
		
		System.out.print("Introduce la cantidad de horas: ");
		horas = teclado.nextInt();
		System.out.print("Introduce la cantidad de minutos: ");
		min = teclado.nextInt();
		System.out.print("Introduce la cantidad de segundos: ");
		seg = teclado.nextInt();
		teclado.close();

		aux = horas * 3600;
		aux += (min * 60);
		aux += seg;
		
		horas = aux / 3600;
		min = (aux % 3600)/60;
		seg = (aux % 3600)%60;
		
		System.out.printf("%d Horas %d Minuto %d Segundos", horas, min,seg);
	}

}
