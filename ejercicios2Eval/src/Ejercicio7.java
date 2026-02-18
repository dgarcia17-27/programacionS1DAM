public class Ejercicio7 {
    public static void main(String[] args) {
        int [][] sudoku = {
        {7,8,4, 1,5,9, 3,2,6},
        {5,3,9, 6,7,2, 8,4,1},
        {6,1,2, 4,3,8, 7,5,9},
        {9,2,8, 7,1,5, 4,6,3},
        {3,5,7, 8,4,6, 1,9,2},
        {4,6,1, 9,2,3, 5,8,7},
        {8,7,6, 3,9,4, 2,1,5},
        {2,4,3, 5,6,1, 9,7,8},
        {1,9,5, 2,8,7, 6,3,4}
        };
        int filas = sudoku.length; //filas
        int columnas = sudoku[0].length; //columnas
        int numIncorrecto;
        //dimensión
        //comprobar si es cuadrada, mayor que 0, y raíz cuadrada numero entero
        if (filas == columnas && filas>0 && Math.sqrt(filas) == (int)Math.sqrt(filas)){
            //comparar las filas y las columnas, para comprobar si hay algún número repetido
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < sudoku[i].length; j++) { //podría usarse columnas
                    for (int k = 0; k < sudoku[i].length; k++) {
                        if (j == k){
                            break;
                        }

                        if (sudoku[j][i]==sudoku[k][i]){
                            System.out.printf("Hay un valor %d repetido en columna posiciones: (%d,%d) (%d,%d) %n", sudoku[k][i], j, i, k, i);
                        }

                        if (sudoku[i][j]==sudoku[i][k]){
                            System.out.printf("Hay un valor %d repetido en fila posiciones: (%d,%d) (%d,%d) %n",sudoku[i][k], i, j, i, k);
                        }
                    }
                }
            }

            //recorrer secciones de 3x3
            int raiz = (int)Math.sqrt(sudoku.length);
            for (int i = 0; i < sudoku.length; i+= raiz){
                for (int j = 0; j < sudoku[i].length; j+= raiz){
                    for (int k = i; k < i + raiz; k++) {
                        for (int l = j; l < j + raiz; l++) {
                            for (int m = i; m < i + raiz; m++){
                                for (int n = j; n < j + raiz; n++) {
                                    if (sudoku[k][l] == sudoku[m][n]) {
                                        if (l == n || k == m) {
                                            continue;
                                        }
                                        System.out.printf("Hay un valor repetido en un 3x3. Valor repetido: %d %n", sudoku[k][l]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.print("Dimensión no válida");
        }
    }
}
