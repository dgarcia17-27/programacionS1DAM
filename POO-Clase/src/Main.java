public class Main {
    public static void main(String[] args) {
        Book lotr = new Book("El Hobbit","Tolkien", 1900, "Ficción");
        Book quijote = new Book("El quijote","Cervantes", 1800, "Novela");

        lotr.leerLibro();
        quijote.leerLibro();
    }
}
