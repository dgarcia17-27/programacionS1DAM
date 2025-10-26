package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 	Realizar un programa que calcule la potencia de un numero a n . La potencia se
		hará por medio de multiplicaciones, está prohibido usar Math.pow().
			si n es mayor que cero se hará una potencia normal
			si n es menor que cero se hará 1/an
			y si n cero la solución será 1
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int a,n,resultado;

        System.out.print("Teclea un número: ");
        a = teclado.nextInt();
        System.out.print("Teclea una potencia: ");
        n = teclado.nextInt();
        teclado.close();

        if(n > 0){
            resultado = a;
            for (int i = 1; i < n; i++) {
                resultado *= a;
            }
            System.out.print(resultado);
        }else if(n < 0){
            resultado = a;
            n *= -1;
            for (int i = 1; i < n; i++) {
                resultado *= a;
            }
            System.out.print((double)1/resultado);
        }else{
            resultado = 1;
            System.out.print(resultado);
        }
		
	}
}
