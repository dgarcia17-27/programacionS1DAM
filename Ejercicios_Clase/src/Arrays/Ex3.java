package Arrays;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        String[][] agenda = {{"Elena","direcc X"}, {"María", "direcc Y"},{"Sara", "direcc Z"},{"Luis","direcc K"}};

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿A quien buscas? ");
        String nombreABuscar = teclado.nextLine();

        boolean encontrado = false;

        // FOR
        for (int i = 0; i < agenda.length; i++) {
            if (nombreABuscar.equalsIgnoreCase(agenda[i][0])){
                System.out.println(agenda[i][1]);
                encontrado = true;
            }
        }

        // FOR-EACH
        for (String[] fila : agenda){
            if (nombreABuscar.equalsIgnoreCase(fila[0])){
                System.out.println(fila[1]);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println(" Sorry pero no está :( ");
        }
    }

    // VERSION 2
    public static String buscarDirecciones(String[][] agenda, String nombreBuscado){

        for (String[] nombre : agenda){
            if (nombreBuscado.equalsIgnoreCase(nombre[0])){
                return nombre[1];
            }
        }
        return null;
    }

    public static boolean existeEnAgenda(String[][] agenda, String nombreBuscado){
        for (String[] nombre : agenda) {
            if (nombreBuscado.equalsIgnoreCase(nombre[0])) {
                return true;
            }
        }
        return false;
    }
}
