package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 	Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, longitudNum;
		
		System.out.print("Introduce un número entre 0 - 9999: ");
		num = teclado.nextInt();
		teclado.close();
		if (num < 0 || num > 9999) {
			System.out.println("ERROR: El número introducido no es válido.");
		} else {
			String numCadena = String.valueOf(num);
			longitudNum = numCadena.length();
			System.out.printf("La longitud del número %d es de %d",num,longitudNum);
		}		
		
	}

}
