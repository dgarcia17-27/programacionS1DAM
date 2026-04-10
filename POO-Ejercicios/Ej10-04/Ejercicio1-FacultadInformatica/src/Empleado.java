public abstract class Empleado extends Persona {
    // Atributos
    private int añoIncorporacion;
    private int despacho;

    // Constructor
    public Empleado(String nombre, String apellidos, String dni, int añoIncorporacion, int despacho) {
        super(nombre, apellidos, dni);
        this.añoIncorporacion = añoIncorporacion;
        this.despacho = despacho;
    }

    // Getters y setters
    public int getDespacho() { return despacho; }
}