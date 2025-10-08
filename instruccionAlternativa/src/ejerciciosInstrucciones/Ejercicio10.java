package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 	Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce una nota entre 1 - 10: ");
		num = teclado.nextInt();
		teclado.close();
		
		switch (num) {
			case 0,1,2,3,4:
				System.out.println("Insuficiente");
				break;
			case 5,6,7:
				System.out.println("Bien");
				break;
			case 8,9:
				System.out.println("Notable");
				break;
			case 10:
				System.out.println("Excelente");
				break;
			default:
				System.out.println("ERROR: El número introducido no es válido.");
				break;
		}

	}

}
