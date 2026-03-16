package base;

public class Empleado extends Persona {
    // ATRIBUTOS
    private String puesto;


    // CONTSTRUCTOR
    public Empleado(String nombre, int edad, String direccion, String pais, String puesto){
        super(nombre, edad, direccion, pais); // Asignar valores de la herencia con "super();"
        this.puesto = puesto;
    }


    // MÉTODOS
    public void mostrarEmpleado(){
        mostrarEdad();
        mostrarDireccion();
        System.out.println("País: " + this.pais);
        System.out.println("Nombre: " + getNombre());

        System.out.println("Puesto: " + this.puesto);
    }


    // GETTERS Y SETTERS
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
