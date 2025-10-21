package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*
	 	Programa que lea números hasta que se teclee un número negativo y después
		indique si se ha dado el mismo número dos veces consecutivas:
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, numAnterior = 0;
		boolean hayRepetido = false;
		
		do {
			System.out.print("Teclea un número: ");
			num = teclado.nextInt();
			if(num == numAnterior) {
				hayRepetido = true;
			}
			numAnterior = num;
			
		}while(num >= 0);
		
		if(hayRepetido) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		teclado.close();
	}
}
