package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio9v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, num1,num2,num3,num4,num5;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		teclado.close();
		
		num1 = num % 10;
		num2 = (num / 10)%10;
		num3 = (num / 100)%10;
		num4 = (num / 1000)%10;
		num5 = (num / 10000)%10;
		
		
		
		System.out.println("Tu número al revés es: " + num1 + num2 + num3 + num4 + num5);
	}

}
