import java.util.Scanner;

public class Ejercicio1 {

    /**
     Ejercicio 1: Calculadora de IMC (Índice de Masa Corporal)
     •	Objetivos: Uso de variables, tipos de datos (double, String), lectura de datos por teclado (Scanner)
        y operaciones matemáticas básicas.
     •	Descripción: Crea un programa que pida al usuario su nombre, su peso (en kilogramos) y su altura
        (en metros). El programa debe calcular el IMC (Peso / Altura al cuadrado) y mostrar por consola un
        mensaje como: "Hola [Nombre], tu IMC es de [Resultado]".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double altura, peso, imc;

        System.out.println("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduzca su altura en metros: ");
        altura = sc.nextDouble();
        System.out.println("Introduzca su peso en kilogramos: ");
        peso = sc.nextDouble();
        sc.close();

        imc = peso / Math.pow(altura,2);

        System.out.printf("Hola %s, tu IMC es de %.02f", nombre,imc);
    }
}
