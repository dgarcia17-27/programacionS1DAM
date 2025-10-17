package bucleWhile;

import java.util.Scanner;

public class Prueba {
	
	/*
	 	Prueba de bucle While
	 */
	
	public static void main(String[] args) {
		
		// Pedir números por teclado hasta que pongan el 0
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		while(num != 0) {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
		}
		
		
		
//		do {
//			System.out.print("Introduce un número: ");
//			num = teclado.nextInt();
//		}while(num != 0);
		
		System.out.println("Programa finalizado! El número era el cero");
		teclado.close();
	}
	
}