package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio5 {

	
	/*
		Realiza un programa que nos pida cuantos segundos duró un concierto,
		y nos calcule cuantas horas, minutos y segundos son.	 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numSeg,hora,minutos,segundos;
		
		System.out.print("Introduce cuantos segundos duró el concierto: ");
		
		numSeg = teclado.nextInt();
		
		hora = numSeg/3600;
		minutos = (numSeg-(3600*hora)) / 60;
		segundos = numSeg-((hora*3060)+(minutos * 60));
		
		System.out.println("Equivale a: " + hora + ":" + minutos + ":" + segundos);
		
	}

}
