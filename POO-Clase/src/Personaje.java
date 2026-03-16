public class Personaje {
    // Atributos
    private String nombre;
    private int vida;
    private int nivel;

    public static int totalPersonaje;

    // Constructor
    public Personaje(String nombre, int vida, int nivel){
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        totalPersonaje++;
    }

    // Métodos instancia
    public void entrenar(int incremento){
        vida += incremento;
        System.out.println(nombre + " ha entrenado. Vida: " + vida);
    }

    public void pelear(int decremento){
        vida -= decremento;
        if (vida < 0){
            vida = 0;
        }
        System.out.println(nombre + " ha peleado. Vida actual: " + vida);
    }

    // Métodos estaticos
    public static void displayPj(){
        System.out.println("Número total de personajes: " + totalPersonaje);
    }

    // GETTER y SETTERS
    // Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Nivel
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    // Vida
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
}
