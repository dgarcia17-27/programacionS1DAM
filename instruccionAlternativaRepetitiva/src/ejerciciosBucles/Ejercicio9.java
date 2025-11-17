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
		
		while(n > 0) {
			resto = n % 2;
			binario = resto * 10 + binario;
			n /= 2;
		}
		System.out.println(binario);
	}
	
	public static void ejprofe(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un número: ");
		int decimal = teclado.nextInt();
		
		int binario = 0;
		int pos = 0;
		
		while(decimal > 0) {
			int resto = decimal % 2;
			decimal /= 2;
			binario += resto * Math.pow(10,pos);
			pos += 1;
		}
		
		binario += decimal % 2 * Math.pow(10, pos);
		System.out.println(binario);
	}

}
