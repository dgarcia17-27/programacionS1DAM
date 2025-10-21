package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 	Programa que escriba los n primeros numeros de la sucesion de Fibonacci. El
		primer numero de la serie es 0, el segundo es 1 y cada uno de los siguientes es la
		suma de los dos anteriores a el.
			Introduciendo:10
			Da como salida: 0 1 1 2 3 5 8 13 21 34
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, numAnterior1 = 0, numAnterior2 = 1, resultado;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		teclado.close();
		
		System.out.printf("%d %d",numAnterior1,numAnterior2);
		
		for (int i = 2; i < num; i++) {
			resultado = numAnterior1 + numAnterior2;
			System.out.printf(" %d",resultado);
			
			numAnterior1 = numAnterior2;
			numAnterior2 = resultado;
		}
		
	}
}
