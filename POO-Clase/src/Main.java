public class Main {
    public static void main(String[] args) {
        Personaje pikachu = new Personaje("Pikachu",10,3);
        Personaje charizard = new Personaje("Charizard",30,39);

        pikachu.entrenar(5);
        charizard.pelear(15);
        Personaje.displayPj();
    }
}
