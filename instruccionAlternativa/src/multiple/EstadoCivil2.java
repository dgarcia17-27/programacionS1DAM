package multiple;

import java.util.Scanner;

public class EstadoCivil2 {
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
		
		switch(letra) {
			case 'd', 'D':
				System.out.println("Divorciado/a");
				break;
			case 's', 'S':
				System.out.println("Soltero/a");
				break;
			case 'c', 'C':
				System.out.println("Casado/a");
				break;
			case 'v', 'V':
				System.out.println("Viudo/a");
				break;
			default:
				System.out.println("Error: Letra introducida no válida.");
		}
	}
}
