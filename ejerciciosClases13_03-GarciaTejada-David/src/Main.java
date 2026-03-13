import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho, alto;

        System.out.print("Teclea el ancho del rectángulo: ");
        ancho = sc.nextInt();
        System.out.print("Teclea el alto del rectángulo: ");
        alto = sc.nextInt();
        sc.close();

        if(Rectangulo.comprobar(ancho,alto)){
            Rectangulo.Rectangulo(ancho,alto);
        } else {
            ancho = Rectangulo.ancho;
            alto = Rectangulo.alto;
            Rectangulo.Rectangulo(ancho,alto);
        }

        System.out.println("\nDATOS DEL RECTANGULO");
        System.out.println(Rectangulo.datos(ancho,alto));
        System.out.println(Rectangulo.comprobarDireccion(ancho,alto));
        System.out.println("Área: " + Rectangulo.areaRectangulo(ancho,alto));
        System.out.println("Perímetro: " + Rectangulo.perimetroRectangulo(ancho,alto));
    }
}
