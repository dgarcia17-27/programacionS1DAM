public class Personaje {
    private String nombre;
    private int vida;
    private int nivel;

    public int totalPersonaje;

    public Personaje(String nombre, int vida, int nivel){
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        totalPersonaje++;
    }
}
