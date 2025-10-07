package simpleYDoble;

import java.util.Scanner;


public class ReciboDelAgua {

	public static void main(String[] args) {
		// Calculamos cuanto tengo que pagar en el recibo de Aqualia
		// Pedimos por teclado cuantos metros cúbicos hemos consumido
		 
		// menos de 10 m3, cada uno vale 1€
		// los que van de 10 a 19 valen a 4€
		// >20 10€
		
		final int PRECIO_BARATO = 1;
		final int PRECIO_MEDIO = 4;
		final int PRECIO_CARO = 10;
		
		Scanner teclado = new Scanner(System.in);
		int metrosConsumidos, precio;
		
		
		System.out.print("Introduce los m3 consumidos: ");
		metrosConsumidos = teclado.nextInt();
		teclado.close();
		
		
		if(metrosConsumidos < 10){
			precio = metrosConsumidos;
			System.out.printf("Tienes que pagar: %d€",precio);
		}else if(metrosConsumidos < 20){
			precio = ((metrosConsumidos - 10)*4) + 9;
			System.out.printf("Tienes que pagar: %d€",precio);
		}else if(metrosConsumidos >= 20){
			precio = ((metrosConsumidos - 19)*10) + 49;
			System.out.printf("Tienes que pagar: %d€",precio);
		}
		
	}

}
