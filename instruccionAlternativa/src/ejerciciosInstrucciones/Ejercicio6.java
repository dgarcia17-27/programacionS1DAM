package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 	Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
		siguiente. suponiendo que cada mes tiene un número distinto de días (suponer
		que febrero tiene siempre 28 días).
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int dia,mes,año;
		
		System.out.print("Introduce un día: ");
		dia = teclado.nextInt();
		System.out.print("Introduce un mes (1-12): ");
		mes = teclado.nextInt();
		System.out.print("Introduce un año: ");
		año = teclado.nextInt();
		teclado.close();
		
		if(dia == 0) {
			System.out.println("ERROR: El día introducido no corresponde a ningún día.");
		}else {
			switch(mes) {
			case 1, 3, 5, 7,8, 10, 12:
				if (dia == 31) {
					dia = 1;
					if(mes == 12) {
						mes = 1;
						++año;
					}else {
						++mes;
					}
					System.out.printf("La fecha del día siguiente es: %d/%d/%d",dia,mes,año);
				}else {
					++dia;
					System.out.printf("La fecha del día siguiente es: %d/%d/%d",dia,mes,año);
				}
				break;
			case 4,6,9,11:
				if (dia == 30) {
					dia = 1;
					++mes;
					System.out.printf("La fecha del día siguiente es: %d/%d/%d",dia,mes,año);
				}else {
					++dia;
					System.out.printf("La fecha del día siguiente es: %d/%d/%d",dia,mes,año);
				}
				break;
			case 2:
				if (dia == 28) {
					dia = 1;
					++mes;
					System.out.printf("La fecha del día siguiente es: %d/%d/%d",dia,mes,año);
				}else {
					++dia;
					System.out.printf("La fecha del día siguiente es: %d/%d/%d",dia,mes,año);
				}
				break;
			default:
				System.out.println("ERROR: El valor introducido no corresponde a ningún mes.");
				break;
			}
		}

	}

}
