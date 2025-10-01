package simpleYDoble;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		// Programa que pida una letra del estado civil y responde poniendo la pallabra que corresponda
		// S == Soltero/a
		// C ==  Casado/a
		// V == Viudo/a
		// D == Divorciado/a
		
		Scanner teclado = new Scanner(System.in);
		char letra;
		
		System.out.print("Teclea la letra de su estado civil (S, C, V, D): ");
		letra = teclado.nextLine().charAt(0); // Leemos una letra de teclado
		teclado.close();
		
		if ( letra == 'S' || letra == 's') {
			System.out.println("Soltero/a");
		} else if (letra == 'C' || letra == 'c') {
			System.out.println("Casado/a");
		}else if (letra == 'V' || letra == 'v') {
			System.out.println("Viudo/a");
		}else if (letra == 'D' || letra == 'd') {
			System.out.println("Divorciado/a");
		}else {
			System.out.println("No es una letra válida.");
		}

	}

}
