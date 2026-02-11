import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class claseSet {

    // Un SET es una coleccion desordenada que (a diferencia del list) no contiene valores duplicados.
    // El parámetro de tipo genérico de la interfaz SET indica el tipo de elementos que contiene el SET

    public static void main(String[] args) {

        Set<Integer> ints = Set.of(1,2,3);
        Set<String> strings = Set.of("alpha","beta","gamma");
        Set<Object> mixed = Set.of(1, false, "foo");

        // Nota:
        // El metodo Set.of() creo una instancia de Set inmutable (NO modificable)
        // No puedo llamar a metodos como add/remove en estos Set provocará una excepcion de tiempo de ejecución

        // Para crear un Set modificable, necesito instanciar una clase que implemente la interfaz Set.
        // La clase más utilizada que implementa esta interfaz es HASHSET
        // Existen otras como: TreeSet / LinkedHash

        Set<Integer> intsModificado = new HashSet<>();

        // La interfaz Set extiende de las interfaces Collection e Iterable
        // por lo que comparte mucho con otros métodos con otros tipos de Collection
        // Una diferencia importante con Collection es que métodos como add/remove
        // devuelve un boolean (en lugar de void)
        // indicando si el elemento estaba o no en el Set cuando se llamó al método

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        set.size();

        set.contains(1); // true
        set.contains(3); // false

        set.remove(3);

        /// Operaciones entre Sets
        // retainAll() --> INTERSECCION entre Sets
        Set<String> yo = new HashSet<>(Set.of("Pikachu","Charmander","Squirtle"));
        Set<String> amigo = new HashSet<>(Set.of("Pikachu","Bulbasur"));
        yo.retainAll(amigo);

        // addAll() --> UNION
        Set<String> yo1 = new HashSet<>(Set.of("Pikachu","Charmander"));
        Set<String> amigo1 = new HashSet<>(Set.of("Squirtle"));
        yo1.addAll(amigo1);

        // removeAll() --> Diferencia
        Set<String> yo2 = new HashSet<>(Set.of("Pikachu","Charmander","Squirtle"));
        Set<String> amigo2 = new HashSet<>(Set.of("Pikachu"));
        yo2.retainAll(amigo2);


        /// EJEMPLO CONCEPTUAL
        class GottaSnatchEmAll{
            // En este ejercicio usarás la interfaz Set para ayudarte a gestionar tu colección de cartas Pokemon
            // ya que las cartas duplicadas no son importantes cuando tu objetivo es conseguir todas las cartas existentes

            /// TASK 1. Empezar una coleccion
            // Acabas de encontrar tu monton de cartas pokemon
            // El monton contiene muchas cartas duplicadas asi que es momento de empezar una nueva coleccion
            // eliminando los duplicados.
            // y la mejor forma es inicar su coleccion regalandoles una carta.
            // Implementa un metodo que transforma una lista de cartas en un set que represente tu nueva coleccion

            static Set<String> newCollection(List<String> cards){
                return new HashSet<>(cards);
            }

            /// TASK 2. Hacer crecer la coleccion
            // Una vez tienes una coleccion esta cobra vida y debe crecer.
            // Implementa un metodo que recibe una carta nueva y tu set actual de cartas coleccionadas
            // El metodo debe añadir la carta a la coleccion, si no está ya presente y debe devolver un boolean que indique
            // si la coleccion fue actualizada
            static boolean addCards(String card, Set<String> collection){
                return collection.add(card);
            }

            /// TASK 3. Empezar a intercambiar
            // Intercambiamos cartas pokemon con tus amigos y no todos los intercambios valen la pena
            // ni son posibles, solo deberías intercambiar si tanto tu como tu amigo teneis una carta que el otro no tiene
            // implementa un metodo que reciba tu coleccion actual y la coleccion de uno de tus amigos, debe devolver
            // un boolean indicando si el intercambio es posible siguiendo las reglas anteriores.
            static boolean canTrade(Set<String> myCollection, Set<String> theirCollection){
                for(String card : myCollection){
                    return !theirCollection.contains(card);
                }
                return false;
            }

            /// TASK 4. Identificar cartas comunes
            // Tu y tus amigos os reunís y os preguntais, cuales son las cartas más comunes
            // Implementa un método que recibe una lista de colecciones y devuelve un set con las cartas que estan
            // presentes en todas las colecciones

            static Set<String> commonCards(List<Set<String>> collection){
                if (collection == null || collection.isEmpty()) {
                    return new HashSet<>();
                }
                Set<String> resultado = 
            }

        }
    }
}
