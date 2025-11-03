package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 	Realizar un programa que lea varios números por teclado hasta que se introduzca
		un cero, y entonces diga cuál es el mayor de los números introducidos y cuantas
		veces se repite ese número.
			Introduciendo: 1 3 5 5 4 6 6 7 1 4 7 2 0
			Da como salida: El mayor es el 7
							Se repite 2 veces
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int num, nMayor, nRepeticiones = 0;
        
        System.out.print("Teclea un número: ");
        num = teclado.nextInt();
        nMayor = num;

        while(num != 0){
            System.out.print("Teclea un número: ");
            num = teclado.nextInt();
            if (num > nMayor){
                nMayor = num;
                nRepeticiones = 0;
            }
            if (num == nMayor){
                nRepeticiones++;
            }
        }
        System.out.printf("El mayor es el %d\n",nMayor);
        System.out.printf("Se repite %d veces\n",nRepeticiones);

        teclado.close();
		
	}
}
