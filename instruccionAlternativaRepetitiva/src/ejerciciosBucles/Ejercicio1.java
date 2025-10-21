package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*
	 	Programa que lea números hasta que se den cinco ceros y escriba después la
		suma de los números leídos.
			
			Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
			Da como salida: 33
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, count = 0, resultado = 0;
		
		do {
			System.out.print("Introduce un valor para ser sumado: ");
			num = teclado.nextInt();
			if(num == 0) {
				count++;
			}else {
				resultado += num;
			}
		}while(count != 5);
		System.out.printf("Da como salida: %d", resultado);
	}
}
