import java.util.Scanner;

public class Garcia_David_Ejercicio2 {

    /**
        @author David García I Tejada
     */

    public static void main(String[] args) {
        int unidades,centenas;
        for (int i = 100; i < 1000; i++) { // Hacer bucle que empieza en 100 y acaba en 999
            unidades = i % 10; // Extraigo la unidad de la iteracion
            centenas = i / 100; // Extraigo la centena de la iteracion
            if (unidades == centenas){ // Compruebo si las centenas y las unidades son iguales para saber si es un NSR.
                System.out.println(i); // Imprimo el numero NSR
            }
        }
    }
}
