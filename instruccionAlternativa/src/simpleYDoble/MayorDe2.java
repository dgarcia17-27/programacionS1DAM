package simpleYDoble;

import java.util.Scanner;

public class MayorDe2 {

	/* 
	  	Pedir dos números por teclado y mostrar en pantalla el mayor de los dos
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Teclea el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Teclea el segundo número: ");
		num2 = teclado.nextInt();
		teclado.close();
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		}else {
			if (num1 > num2) {
				System.out.printf("El mayor es: %d",num1);
			} else {
				System.out.printf("El mayor es: %d",num2);
			}	
		}
	}

}
