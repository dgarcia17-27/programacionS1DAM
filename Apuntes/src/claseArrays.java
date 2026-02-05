import java.util.Arrays;

public class claseArrays {
    static void main(String[] args) {
        demostrarAsignacion();

        int[] numeros = {5, 2, 8, 1, 9};

        // 1. Array.sort() - ordena numeros de un array
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        // 2. Array.toString() - convertir a string un array
        String arrayComoString = Arrays.toString(numeros);
        System.out.println(arrayComoString);

        // 3. Array.equals() - compara dos arrays
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,2,4};
        System.out.println(Arrays.equals(array1,array2));

        // 4. Array.fill() - Rellena un array


        // 5. Arrays.copyIf() - copia un array


    }
    public static void demostrarAsignacion() {
        int[] twoInteger = new int[2];
        int[] threeInteger = new int[]{1,2,3};

        twoInteger[1] = 8;
        int secondElement = twoInteger[1];
        System.out.println("Segundo elemento: " + secondElement);

        // Comando lenght:
        int arrayLength = twoInteger.length;

        // Array multidimensionales
        int[][] arr = new int[3][4];
        char[] vowels = {'a','e','i','o','u'};


        // BUCLE FOR-EACH
        System.out.println("\n--- FOR-EACH ---");
        for (char vowel : vowels){
            System.out.println(vowel);
        }

        // FOR CONTROLADO
        System.out.println("\n--- FOR CONTROLADO ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(vowels[i]);
        }
        
        // Array tridimensionales
        int [][][] triArr = {};
    }
}
