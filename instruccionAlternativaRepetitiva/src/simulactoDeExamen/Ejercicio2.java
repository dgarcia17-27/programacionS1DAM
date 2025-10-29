package simulactoDeExamen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, resultado = 0;
		
		System.out.print("Teclea un número: ");
		n = teclado.nextInt();
		teclado.close();
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				resultado += i;
			}
		}
		if(n == resultado) {
			System.out.println("Es perfecto");
		}else {
			System.out.println("No es perfecto");
		}
	}
}
