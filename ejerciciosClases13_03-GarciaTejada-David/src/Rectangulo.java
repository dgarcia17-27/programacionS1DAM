import java.util.Scanner;

public class Rectangulo {
    static int ancho = 5;
    static int alto = 3;

    public static boolean comprobar(int ancho, int alto){
        return ancho > 0 && alto > 0;
    }

    public static void Rectangulo(int ancho, int alto){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int areaRectangulo(int ancho, int alto){
        return ancho * alto;
    }

    public static int perimetroRectangulo(int ancho, int alto){
        return (ancho * 2) + (alto * 2);
    }

    public static String comprobarDireccion(int ancho, int alto){
        if (alto < ancho) {
            return "La dirección del rectángulo es horizontal";
        } else {
            return "La dirección del rectángulo es vertical";
        }
    }

    public static String datos(int ancho, int alto){
        return "Alto: " + String.valueOf(alto) + "\n" +
                "Ancho: " + String.valueOf(ancho);
    }
}
