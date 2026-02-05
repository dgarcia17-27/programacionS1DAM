package Arrays;

import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = random.nextInt(100) + 1;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

    }
}
