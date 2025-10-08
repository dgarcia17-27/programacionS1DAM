package multiple;

import java.util.Scanner;

public class SignosZodiaco {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int dia,mes;
		
		System.out.print("Introduce tu día de nacimiento: ");
		dia = teclado.nextInt();
		System.out.print("Introduce tu mes de nacimiento: ");
		mes = teclado.nextInt();
		teclado.close();
		
		switch (mes) {
		
		case 1:
			if (dia <= 19) {
				System.out.println("Eres capricornio");
			}else {
				System.out.println("Eres Acuario");
			}
			break;
		case 2:
			if (dia <= 18) {
				System.out.println("Eres Acuario");
			}else {
				System.out.println("Eres Piscis");
			}
			break;
		case 3:
			if (dia <= 20) {
				System.out.println("Eres Piscis");
			}else {
				System.out.println("Eres Aries");
			}
			break;
		case 4:
			if (dia <= 19) {
				System.out.println("Eres Aries");
			}else {
				System.out.println("Eres Tauro");
			}
			break;
		case 5:
			if (dia <= 20) {
				System.out.println("Eres Tauro");
			}else {
				System.out.println("Eres Geminis");
			}
			break;
		case 6:
			if (dia <= 20) {
				System.out.println("Eres Geminis");
			}else {
				System.out.println("Eres Cancer");
			}
			break;
		case 7:
			if (dia <= 22) {
				System.out.println("Eres Cancer");
			}else {
				System.out.println("Eres Leo");
			}
			break;
		case 8:
			if (dia <= 22) {
				System.out.println("Eres Leo");
			}else {
				System.out.println("Eres Virgo");
			}
			break;
		case 9:
			if (dia <= 22) {
				System.out.println("Eres Virgo");
			}else {
				System.out.println("Eres Libra");
			}
			break;
		case 10:
			if (dia <= 22) {
				System.out.println("Eres Libra");
			}else {
				System.out.println("Eres Escorpio");
			}
			break;
		case 11:
			if (dia <= 21) {
				System.out.println("Eres Escorpio");
			}else {
				System.out.println("Eres Sagitario");
			}
			break;
		case 12:
			if (dia <= 21) {
				System.out.println("Eres Sagitario");
			}else {
				System.out.println("Eres Capricornio");
			}
			break;
		default:
			System.out.println("Fecha incorrecta.");
			break;
		}

	}

}