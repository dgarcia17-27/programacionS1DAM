public class PersonalServicio extends Empleado {
    // Atributos
    private String seccion;

    // Constructor
    public PersonalServicio(String nombre, String apellidos, String dni, int anio, int despacho, String seccion) {
        super(nombre, apellidos, dni, anio, despacho);
        this.seccion = seccion;
    }
}
