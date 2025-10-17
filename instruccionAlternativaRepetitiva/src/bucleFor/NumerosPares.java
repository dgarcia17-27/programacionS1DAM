package bucleFor;

import java.util.Scanner;

public class NumerosPares {

	/*
	 	Mostrar los números pares hasta el que me digan
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		teclado.close();
		
		System.out.print("Estos son los números: ");
		for (int i = 2; i<=num; i+=2) {
			System.out.print(i + ", ");
		}

	}

}
