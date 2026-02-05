package Arrays;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {

        int[] original = {34,54,12,85,45};
        int[] resultado = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            int lugarMayor = 0;
            for (int j = 0; j < resultado.length; j++) {
                if (original[i] > original[lugarMayor]){
                    lugarMayor = i;
                }
            }
            resultado[i] = lugarMayor;
            original[lugarMayor] = 0;
        }

    }
}
