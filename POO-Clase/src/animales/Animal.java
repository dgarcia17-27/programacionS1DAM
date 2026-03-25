package animales;

public class Animal {
    // ATRIBUTOS
    private String nombre;

    // CONSTRUCTOR
    public Animal(String nombre){
        this.nombre = nombre;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODOS
    public void hacerSonido(){
        System.out.println(this.nombre + " hace un sonido.");
    }

    public void mostrarNombre(){
        System.out.println("El nombre del animal es: " + this.nombre);
    }

    public void moverse(){
        System.out.println("El animal se está moviendo.");
    }

}
