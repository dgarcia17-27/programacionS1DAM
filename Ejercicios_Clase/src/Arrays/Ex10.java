package Arrays;

public class Ex10 {

    /**
         Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura.

             0 1 2 3 4
             1 2 3 4 3
             2 3 4 3 2
             3 4 3 2 1
             4 3 2 1 0
     */

    public void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[j][i] = j + i;
            }
        }

        // Imprimir tabla
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
