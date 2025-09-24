package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad;
		
		System.out.println("Teclea tu edad: ");
		edad = teclado.nextInt();
		
		boolean esMayor = edad >= 18;
		System.out.println("Es mayor de edad?: " + esMayor);

	}

}
