package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 	Programa que escriba los n primeros numeros de la sucesion de Fibonacci. El
		primer numero de la serie es 0, el segundo es 1 y cada uno de los siguientes es la
		suma de los dos anteriores a el.
			Introduciendo:10
			Da como salida: 0 1 1 2 3 5 8 13 21 34
	 */
	
	public static void main(String[] args) {
		
		int a,n,r = 0;

        System.out.print("Teclea un número: ");
        a = sc.nextInt();
        System.out.print("Teclea un número para la potencia: ");
        n = sc.nextInt();

        r = a;

        for (int i = 1; i < n; i++) {
            r = r * a;
        }
        System.out.print(r);
		}
		
	}
}
