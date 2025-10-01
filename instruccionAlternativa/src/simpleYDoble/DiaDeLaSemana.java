package simpleYDoble;

import java.util.Scanner;

public class DiaDeLaSemana {
	
	// Pedimos un día del 1 al 7 y ponemos en letras el día que corresponde
	// Si pongo un número raro me avisará
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		teclado.close();
		
		if (num > 7 || num < 1) {
			System.out.println("El número introducido no es válido.");
		}else if (num == 1) {
			System.out.println("L");
		}else if (num == 2) {
			System.out.println("M");
		}else if (num == 3) {
			System.out.println("X");
		}else if (num == 4) {
			System.out.println("J");
		}else if (num == 5) {
			System.out.println("V");
		}else if (num == 6) {
			System.out.println("S");
		}else {
			System.out.println("D");
		}

		
// 	Solución poco eficiente por que las estructuras no están relacionadas entre ellas.
		
//		if (num > 7 || num < 1) {System.out.println("El número introducido no es válido.");}
//		if (num == 1) {System.out.println("L");}
//		if (num == 2) {System.out.println("M");} 
//		if (num == 3) {System.out.println("X");}
//		if (num == 4) {System.out.println("J");}
//		if (num == 5) {System.out.println("V");}
//		if (num == 6) {System.out.println("S");}
//		if (num == 7){System.out.println("D");}
		
		
//		switch (num) {
//			case 1: 
//				System.out.println("L");
//				break;
//			case 2: 
//				System.out.println("M");
//				break;
//			case 3: 
//				System.out.println("X");
//				break;
//			case 4: 
//				System.out.println("J");
//				break;
//			case 5: 
//				System.out.println("V");
//				break;
//			case 6: 
//				System.out.println("S");
//				break;
//			case 7: 
//				System.out.println("D");
//				break;
//			default:
//				System.out.println("El número introducido no es válido.");
//		}
	}

}
