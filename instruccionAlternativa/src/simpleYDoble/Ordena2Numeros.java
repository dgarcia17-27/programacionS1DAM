package simpleYDoble;

import java.util.Scanner;

public class Ordena2Numeros {

	// Pedir dos números por teclado y los imprimimos en orden creciente.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		
		System.out.print("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		teclado.close();
		
		if (num1 == num2) {
			System.out.printf("El número %d es igual que el número %d", num2,num1);
		}else if(num1 > num2){
			System.out.printf("El número %d es mayor que el número %d", num1,num2);
		}else {
			System.out.printf("El número %d es mayor que el número %d", num1,num2);
		}


	}

}
