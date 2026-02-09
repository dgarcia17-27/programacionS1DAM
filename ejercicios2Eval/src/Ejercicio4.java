import java.util.Scanner;

public class Ejercicio4 {

    /**
        Crear un método función que corrija una cadena de tiempo dada. Además, había un problema, por lo que
        muchas de las cadenas de tiempo están rotas. La hora se formatea utilizando el reloj de 24 horas, es decir, de
        00:00:00 a 23:59:59.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Teclea una hora compuesta de: H:M:S : ");
        StringBuilder hora = new StringBuilder(teclado.nextLine() + ':');
        String aux = "";
        int seg = 0, min = 0, horas = 0;

        for (int i = 0; i < hora.length(); i++) {
            if (hora.charAt(i) != ':'){
                aux += hora.charAt(i); // Voy agregando cada apartado de la hora completa
            } else {
                if (horas == 0){ // compruebo que están vacías y las voy rellenaando de forma escalonada
                    horas = Integer.parseInt(aux); // Las convierto a enteros
                } else if (min == 0) {
                    min = Integer.parseInt(aux);
                } else {
                    seg = Integer.parseInt(aux);
                }
                aux = ""; // voy vaciando la variable en cada vuelta
            }
        }
        // paso todo a segundos
        seg += horas * 3600;
        seg += min * 60;

        // Convierto todo
        horas = seg / 3600;
        seg %= 3600;
        min = seg / 60;
        seg %= 60;

        // Imprimo la hora correcta
        System.out.printf("%02d:%02d:%02d",horas,min,seg);
    }

}
