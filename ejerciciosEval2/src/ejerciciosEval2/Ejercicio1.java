package ejerciciosEval2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un número: ");
		String numero = teclado.nextLine();
		int n = Integer.parseInt(numero);
		
		if(n % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		teclado.close();
		
	}
}
