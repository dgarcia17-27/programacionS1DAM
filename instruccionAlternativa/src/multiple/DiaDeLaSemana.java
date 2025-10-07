package multiple;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int dia;
		
		System.out.print("Teclea un número del 1 al 7: ");
		dia = teclado.nextInt();
		teclado.close();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El número introducido no equivale a nigún día de la semana.");
			break;
		}

	}

}
