public class Estudiante extends Persona {
    // Atributos
    private String curso;

    // Constructor
    public Estudiante(String nombre, String apellidos, String dni, String curso) {
        super(nombre, apellidos, dni);
        this.curso = curso;
    }

    // Getters y setters
    public String getCurso() { return curso; }
}