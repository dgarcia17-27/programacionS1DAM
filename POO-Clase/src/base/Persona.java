package base;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    protected int edad;
    String direccion; // Sin poner public se considera como tal
    public String pais;
    // La buena práctica es poner private, pero lo ponemos así por hacerlo didáctico

    // CONSTRUCTORES
    public Persona(){}

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String direccion, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.pais = pais;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null || !nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío!!!");
        }
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // MÉTODOS
    protected void mostrarEdad(){
        System.out.println("Edad: " + this.edad);
    }

    void mostrarDireccion(){
        System.out.println("Dirección: " + this.direccion);
    }

    public void displayInfo(){
        System.out.println("Nomnre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("País: " + this.pais);
    }

    private void saludar(){
        System.out.println("Hola, mi nombre es: " + this.nombre);
    }

    // esto se puede ejecutar desde otra clase porque estamos invocando a un metodo privado pero desde un metodo público
    public void realizarSaludo(){
        saludar();
    }

}
