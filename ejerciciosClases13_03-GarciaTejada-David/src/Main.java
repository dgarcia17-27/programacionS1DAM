public class Main {
    public void main(String[] args) {
        Rectangulo prueba = new Rectangulo(2,5);

        prueba.rectangulo();

        System.out.println("\n--------- Datos ---------");
        System.out.println("Alto: " + prueba.getAlto() +
                            "\nAncho: " + prueba.getAncho());
        System.out.println("Área: " + prueba.areaRectangulo());
        System.out.println("Perímetro: " + prueba.perimetroRectangulo());
        System.out.println(prueba.direccionRectangulo());

    }
}
