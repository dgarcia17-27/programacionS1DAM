package primerPrograma;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		// Vamos a probar los tipos de datos boolean
		boolean hayToner;
		
		hayToner = true;
		hayToner = false;
		
		// tipos caracter
		String frase; // variable donde guardar un texto largo ""
		char letra; // variable donde solo cabe una letra ''
		
		frase = "Hola a todos";
		letra = 'D';
		letra = '\t';
		letra = '\n';
		
		frase = "Hola\na todos";
		System.out.println(frase);
		
		// Tipos númericos enteros
		byte pequeña;
		short mediana;
		int grande;
		long enorme;
		
		pequeña = 16;
		mediana = 31000;
		grande = 1729805722;
		enorme = 2918378564535L;
		
		
	}

}
