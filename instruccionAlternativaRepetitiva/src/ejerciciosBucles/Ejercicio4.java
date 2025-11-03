package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 	Programa que lea números hasta que se teclee un número negativo y después
		indique si se ha dado el mismo número dos veces consecutivas:
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, numAnterior;
		boolean hayRepetido = false;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		numAnterior = num;
		
		while(num >= 0) {
			System.out.print("Teclea un número: ");
			num = teclado.nextInt();
			if(num == numAnterior) {
				hayRepetido = true;
			}
			numAnterior = num;
			
		}
		
		if(hayRepetido) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		teclado.close();
	}
}
