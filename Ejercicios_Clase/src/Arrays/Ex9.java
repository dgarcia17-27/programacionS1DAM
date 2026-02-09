package Arrays;

import java.util.Arrays;

public class Ex9 {

    /**
         Programa que mezcla dos arrays ordenados de N elementos, consiguiendo un
         array de N*2 elementos igualmente ordenados.

             Array A  4 8 15 22 25 40
             Array B  3 6 18 21 25 47
             Array C  3 4 6 8 15 18 21 22 25 25 40 47
     */

    public static void main(String[] args) {
        int[] a = {4,8,15,22,25,40};
        int[] b = {3,6,18,21,25,47};
        int[] c = new int[a.length + b.length];

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
