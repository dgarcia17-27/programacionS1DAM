package simpleYDoble;

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.print("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Introduce el tercer número: ");
		num3 = teclado.nextInt();
		teclado.close();
		
		if (num1 > num2 && num2 > num3) {
			System.out.printf("%d, %d, %d", num3,num2,num1);
		}else if(num1 < num2 && num2 < num3){
			System.out.printf("%d, %d, %d", num1,num2,num3);
		}else if(num1 > num2 && num2 < num3 && num1 > num3){
			System.out.printf("%d, %d, %d", num2,num3,num1);
		}else {
			System.out.printf("%d, %d, %d", num2,num1,num3);
		}
		
		// Intercambiando valores
		int aux;
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
	}

}
