package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio9 {
	
	/*
	 	Programa que lea un número entero positivo y lo transforme a su representación
		binaria.
			Introduciendo: 18
			Da como salida: 10010
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, resto;
		String binario = "";

		System.out.print("Teclea un número: ");
		n = teclado.nextInt();
		teclado.close();

		while (n > 0) {
			resto = n % 2;
			binario = resto + binario;
			n /= 2;
		}
		System.out.println(binario);
	}

}
