package animales;

public class Perro extends Animal {
    // ATRIBUTOS
    private String raza;

    // CONSTRUCTOR
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    // GETTERS Y SETTERS
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // MÉTODOS
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " está ladrando.");
    }
    public void mostrarRaza(){
        System.out.println(getNombre() + " es de raza: " + this.raza);
    }
}
