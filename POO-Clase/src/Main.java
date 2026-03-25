import animales.Animal;
import animales.Gato;
import animales.Perro;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Canela");
        Perro perro = new Perro("Tobi", "Dalmata");
        Gato gato = new Gato("Misifu", "Naranja");

        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
    }

    /// ========================= HERENCIAS =======================
    // Consist en que una clase nueva llamada SUBCLASE hereda los métodos y propiedades de una clase
    // ya existente llamada clase BASE. Esto significa que la SUBCLASE puede aprovechar los comportamientos
    // y las características para si misma.

    // EJ: imagina que tienes una clase VEHICULO que tiene propiedades comunes a todos los vehiculos como el
    // número de ruedas o la velocidad. Bien, pues puedes crear SUBCLASES especificas como coche o bicicleta
    // que heredan todas las características de vehiculo pero estas SUBCLASES tendrán sus características propias
    // específicas. A la clase COCHE le podemos añadir un metodo que sea rrancar motor, y este metodo no tendría
    // sentido en BICICLETA


}
