package primerPrograma;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		// Vamos a probar los tipos de datos boolean
//		boolean hayToner;
		
//		hayToner = true;
//		hayToner = false;
		
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
		
		
		// Tipos númericos decimales
		
		float pocosDecimales;
		double muchosDecimales;
		
		pocosDecimales = 179819847.0958937F;
		muchosDecimales = 87.9875938745632897;
		
		boolean resultado = mediana > grande;
		System.out.println(resultado);
		
		
		
		// probar los operadores lógicos
		boolean hayToner = true;
		boolean hayPapel = false;
		resultado = hayToner && hayPapel;
		System.out.println("Puedo imprimir?: " + resultado);
		
		
		boolean familiaNumerosa = true;
		boolean rentaFamiliaBaja = false;
		resultado = familiaNumerosa || rentaFamiliaBaja;
		System.out.println("¿Me darán beca?: " + resultado);
		
	}
}