import java.util.Scanner;

public class Ejercicio4 {

    /**
        Crear un método función que corrija una cadena de tiempo dada. Además, había un problema, por lo que
        muchas de las cadenas de tiempo están rotas. La hora se formatea utilizando el reloj de 24 horas, es decir, de
        00:00:00 a 23:59:59.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seg, min, horas;

        System.out.print("Teclea las horas: ");
        horas = teclado.nextInt();
        System.out.print("Teclea los minutos: ");
        min = teclado.nextInt();
        System.out.print("Teclea los segundos: ");
        seg = teclado.nextInt();
        teclado.close();

        min += horas * 60;
        seg += min * 60;

        horas = seg / 3600;
        seg %= 3600;
        min = seg / 60;
        seg %= 60;

        System.out.printf("%d:%d:%d",horas,min,seg);
    }

}
