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
		int n, r, n1 = 0,n2 = 1;
		
		System.out.print("Teclea un número: ");
		n = teclado.nextInt();
		teclado.close();
		
		System.out.printf("%d %d", n1, n2);
		
		for (int i = 3; i <= n; i++) {
			r = n1 + n2;
			System.out.print(" " + r);
			
			n1 = n2;
			n2 = r;
		}

        
	}
		
}

