package ejerciciosInstrucciones;

import java.util.Scanner;

public class Ejercicio11 {
	
	/*
	 	Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar:
		cincuenta y seis.
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num,decenas,unidades;
		String textoDecenas = "",textoUnidades = "";
		
		System.out.print("Introduce un número entre 0 - 99: ");
		num = teclado.nextInt();
		teclado.close();
		
		if (num < 0 || num > 99) {
			System.out.println("ERROR: El número introducido no es válido.");
		} else {
			
			decenas = num / 10;
			unidades = num % 10;
			
			switch (decenas) {
			case 1:
				if(unidades == 0) {
					textoDecenas = "Diez";
				}else if(unidades == 1) {
					textoDecenas = "Once";
				}else if(unidades == 2) {
					textoDecenas = "Doce";
				}else if(unidades == 3) {
					textoDecenas = "Trece";
				}else if(unidades == 4) {
					textoDecenas = "Catorce";
				}else if(unidades == 5) {
					textoDecenas = "Quince";
				}else {
					textoDecenas = "Dieci";
				}
				break;
			case 2:
				if(unidades == 0) {
					textoDecenas = "Veinte";
				}else {
					textoDecenas = "Veinti";
				}
				break;
			case 3:
				textoDecenas = "Treinta";
				break;
			case 4:
				textoDecenas = "Cuarenta";
				break;
			case 5:
				textoDecenas = "Cincuenta";
				break;
			case 6:
				textoDecenas = "Sesenta";
				break;
			case 7:
				textoDecenas = "Setenta";
				break;
			case 8:
				textoDecenas = "Ochenta";
				break;
			case 9:
				textoDecenas = "Noventa";
				break;
			}
			
			switch (unidades) {
			case 0:
				if(decenas == 0) {
					textoUnidades = "Cero";
				}else {
					textoUnidades = "";
				}
				break;
			case 1:
				textoUnidades = "Uno";
				break;
			case 2:
				textoUnidades = "Dos";
				break;
			case 3:
				textoUnidades = "Tres";
				break;
			case 4:
				textoUnidades = "Cuatro";
				break;
			case 5:
				textoUnidades = "Cinco";
				break;
			case 6:
				textoUnidades = "Seis";
				break;
			case 7:
				textoUnidades = "Siete";
				break;
			case 8:
				textoUnidades = "Ocho";
				break;
			case 9:
				textoUnidades = "Nueve";
				break;
			}
			if (decenas == 0) {
				System.out.printf(textoUnidades);
			} else if(decenas == 1 && unidades >= 1 && decenas == 1 && unidades <= 5) {
				System.out.printf(textoDecenas);
			} else if(decenas == 1 || decenas == 2){
				System.out.printf("%s%s",textoDecenas,textoUnidades.toLowerCase());
			}else {
				System.out.printf("%s y %s",textoDecenas,textoUnidades.toLowerCase());
			}
			
		}		

	}

}