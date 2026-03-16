public class Rectangulo {

    // ATRIBUTOS
    private int alto;
    private int ancho;


    // CONSTRUCTOR
    // Constructor vacío con valores default
    public Rectangulo(){
        this.alto = 3;
        this.ancho = 12;
    }

    // Constructor con parámetros
    public Rectangulo(int alto, int ancho){
        setAlto(alto);
        setAncho(ancho);
    }


    // MÉTODOS
    // Setters
    private void setAlto(int alto){
        if (alto < 1){
            this.alto = 3;
        } else {
            this.alto = alto;
        }
    }

    private void setAncho(int ancho){
        if (ancho < 1){
            this.ancho = 12;
        } else {
            this.ancho = ancho;
        }
    }

    // Getters
    public int getAlto(){
        return alto;
    }
    public int getAncho(){
        return ancho;
    }

    // imprimir el rectángulo
    public void rectangulo(){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Calcular área del rectángulo
    public int areaRectangulo(){
        return alto * ancho;
    }

    // Perímetro del rectángulo
    public int perimetroRectangulo(){
        return (alto * 2) + (ancho * 2);
    }

    // Comprobar si es horizontal o vertical
    public void direccionRectangulo(){
        if (ancho < alto){
            System.out.println("El rectángulo es vertical");
        } else {
            System.out.println("El rectángulo es horizontal");
        }
    }

    // Datos del rectángulo
    public String datosRectangulo(){
        return "Alto: " + alto + "\nAncho: " + ancho;
    }
}