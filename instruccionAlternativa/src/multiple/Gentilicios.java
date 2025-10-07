package multiple;

import java.util.Scanner;

public class Gentilicios {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String pueblo;
		
		System.out.println("¿En que pueblo vives: ");
		pueblo = teclado.nextLine().toLowerCase();
		teclado.close();
		
		switch (pueblo) {
			case "toledo":
				System.out.println("Toledano");
				break;
			case "illescas":
				System.out.println("Illarcuriense");
				break;
			case "fuensalida":
				System.out.println("Fuensalidano");
				break;
			default:
				System.out.println("No conozco ese pueblo de macacos");
		}

	}

}
