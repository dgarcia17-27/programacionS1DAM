public class Book {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int publicacion;
    private String genero;

    // CONSTRUCTOR
    public Book(String titulo, String autor, int publicacion, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.genero = genero;
    }

    public Book(int publicacion, String genero){
        this.publicacion = publicacion;
        this.genero = genero;
    }

    // METODO
    public void leerLibro(){
        System.out.println("Leyendo " + titulo + " escrito por " + autor);
    }

    public void mostrarInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + publicacion);
        System.out.println("Género: " + genero);
    }
}
