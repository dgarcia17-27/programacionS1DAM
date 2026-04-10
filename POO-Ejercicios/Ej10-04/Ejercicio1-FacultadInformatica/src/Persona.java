public abstract class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private String dni;

    // Constructor
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getDni() { return dni; }

    // Métodos
    @Override
    public String toString() {
        return nombre + " " + apellidos + " (DNI: " + dni + ")";
    }
}