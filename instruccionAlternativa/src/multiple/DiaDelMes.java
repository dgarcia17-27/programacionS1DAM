package multiple;

import java.util.Scanner;

public class DiaDelMes {

	public static void main(String[] args) {
		// Pedimos numero del 1 al 12
		// e imprimimos los dias que tiene el mes
		
		Scanner teclado = new Scanner(System.in);
		int mes;
		
		System.out.print("Introduce un número entre el 1 y 12: ");
		mes = teclado.nextInt();
		teclado.close();
		
		switch(mes) {
		case 1, 3, 5, 7,8, 10, 12:
			System.out.printf("Tiene 31 días el mes: %d", mes);
			break;
		case 4,6,9,11:
			System.out.printf("Tiene 30 días el mes: %d",mes);
			break;
		case 2:
			System.out.printf("Tiene 28 días el mes: %d",mes);
			break;
		default:
			System.out.println("Error: El valor introducido no corresponde a ningún mes.");
			break;
		}
		
	}

}
