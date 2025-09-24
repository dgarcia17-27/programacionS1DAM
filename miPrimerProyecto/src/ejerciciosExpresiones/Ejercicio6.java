package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 	Realiza un programa que cuando un cliente de un banco quiere sacar
		una cantidad de dinero de su cuenta, calcule cuantos billetes tenemos
		que darle. Siempre calcularemos la mínima cantidad de billetes.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int cantidadEuros,bill500, bill200, bill100, bill50, bill20, bill10, bill5;
		
		System.out.print("Teclea la cantidad de euros: ");
		cantidadEuros = teclado.nextInt();
		
		bill500 = cantidadEuros / 500;
		bill200 = (cantidadEuros - (bill500*500))/200;
		bill100 = (cantidadEuros - ((bill500*500)+(bill200*200)))/100;
		bill50 = (cantidadEuros - ((bill500*500)+(bill200*200)+(bill100*100)))/50;
		bill20 = (cantidadEuros - ((bill500*500)+(bill200*200)+(bill100*100)+(bill50*50)))/20;
		bill10 = (cantidadEuros - ((bill500*500)+(bill200*200)+(bill100*100)+(bill50*50)+(bill20*20)))/10;
		bill5 = (cantidadEuros - ((bill500*500)+(bill200*200)+(bill100*100)+(bill50*50)+(bill20*20)+(bill10*10)))/5;
		
		System.out.println("Billetes de 500: " + bill500);
		System.out.println("Billetes de 200: " + bill200);
		System.out.println("Billetes de 100: " + bill100);
		System.out.println("Billetes de 50: " + bill50);
		System.out.println("Billetes de 20: " + bill20);
		System.out.println("Billetes de 10: " + bill10);
		System.out.println("Billetes de 5: " + bill5);
		

	}

}