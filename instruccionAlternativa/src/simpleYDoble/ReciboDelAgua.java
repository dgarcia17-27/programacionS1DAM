package simpleYDoble;

import java.util.Scanner;


public class ReciboDelAgua {

	public static void main(String[] args) {
		// Calculamos cuanto tengo que pagar en el recibo de Aqualia
		// Pedimos por teclado cuantos metros cúbicos hemos consumido
		 
		// menos de 10 m3, cada uno vale 1€
		// los que van de 10 a 19 valen a 4€
		// >20 10€
		
		Scanner teclado = new Scanner(System.in);
		int metrosConsumidos, precio;
		
		
		System.out.print("Introduce los m3 consumidos: ");
		metrosConsumidos = teclado.nextInt();
		teclado.close();
		
		
		if (metrosConsumidos < 0) {
			System.out.println("Revisa bien el contador!");
		}else if(metrosConsumidos <= 10){
			precio = metrosConsumidos * 1;
			System.out.printf("Tienes que pagar: %d€",precio);
		}else if(metrosConsumidos > 10 && metrosConsumidos <= 19){
			precio = metrosConsumidos * 4;
			System.out.printf("Tienes que pagar: %d€",precio);
		}else if(metrosConsumidos > 20){
			precio = metrosConsumidos * 10;
			System.out.printf("Tienes que pagar: %d€",precio);
		}else {
			System.out.println("No tienes que pagar nada.");
		}
	}

}
