package simpleYDoble;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		
		if (num == 0) {
			System.out.println("El número 0 no se considera ni par ni impar.");
		} else if (num % 2 == 0) {
				System.out.printf("El número: %d es par", num);
		} else {
				System.out.printf("El número: %d es impar", num);
		}
	}
}