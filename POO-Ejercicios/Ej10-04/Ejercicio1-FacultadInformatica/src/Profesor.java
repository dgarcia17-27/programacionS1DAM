public class Profesor extends Empleado {
    // Atributos
    private String departamento;

    // Constructor
    public Profesor(String nombre, String apellidos, String dni, int anio, int despacho, String departamento) {
        super(nombre, apellidos, dni, anio, despacho);
        this.departamento = departamento;
    }
}
