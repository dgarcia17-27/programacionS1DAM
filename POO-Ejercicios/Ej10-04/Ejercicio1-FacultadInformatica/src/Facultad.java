import java.util.ArrayList;
import java.util.List;

public class Facultad {
    // Atributos
    private List<Persona> listaPersonas;

    // Constructor
    public Facultad() {
        this.listaPersonas = new ArrayList<>();
    }

    // Métodos
    public void darDeAlta(Persona p) {
        listaPersonas.add(p);
    }

    public List<Estudiante> getAlumnosPorCurso(String curso) {
        List<Estudiante> resultado = new ArrayList<>();
        for (Persona p : listaPersonas) {
            if (p instanceof Estudiante) {
                Estudiante e = (Estudiante) p;
                if (e.getCurso().equalsIgnoreCase(curso)) {
                    resultado.add(e);
                }
            }
        }
        return resultado;
    }

    public List<Empleado> getPersonalPorDespacho(int numDespacho) {
        List<Empleado> resultado = new ArrayList<>();
        for (Persona p : listaPersonas) {
            if (p instanceof Empleado) {
                Empleado e = (Empleado) p;
                if (e.getDespacho() == numDespacho) {
                    resultado.add(e);
                }
            }
        }
        return resultado;
    }
}