package animales;

public class Gato extends Animal{
    // ATRIBUTOS
    private String color;

    // CONSTRUCTOR
    public Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }

    // GETTERS Y SETTERS
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // MÉTODOS
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " está maullando.");
    }
    public void mostrarColor(){
        System.out.println(getNombre() + " es de color: " + this.color);
    }
}
