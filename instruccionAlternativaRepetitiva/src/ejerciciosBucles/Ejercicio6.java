package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 	Realizar un programa que calcule la potencia de un numero a n . La potencia se
		hará por medio de multiplicaciones, está prohibido usar Math.pow().
			si n es mayor que cero se hará una potencia normal
			si n es menor que cero se hará 1/an
			y si n cero la solución será 1
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float num;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		teclado.close();
		
		if (num > 0) {
			System.out.println((int)(num * num));
		} else if (num < 0){
			System.out.println(1/(num*num));
		}else {
			System.out.println((int)1);
		}
		
	}
}
