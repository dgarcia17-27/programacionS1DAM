import java.util.ArrayList;
import java.util.List;

public class claseList {
    public static void main(String[] args) {

        /*
            Las listas son colecciones ordenadas que pueden crecer dinámicamente.
            A diferencia de los 'arrays' una List puede cambiar de tamañopara acomodar cualquier
            número de elementos.
         */

        // Array
        String[] array = new String[3]; // Solo tres espacios

        // List
        List<String> lista = new ArrayList<>(); // Se puede crecer infinitamente


        // TIPOS DE IMPLEMENTACIONES
        // ArrayList: Usa un array redimensionable internamente (más rápido para acceder)
        // LinkedList: Usa nodos enlazados (más rápido para insertar/eliminar en medio)
        List<String> vacia = List.of(); // inmutable
        List<Integer> numeros = List.of(1,2,3); // no se puede modificar
        List<Character> vocales = List.of('a','e','i', 'o', 'u');

        ArrayList<String> nombres = new ArrayList<>(); // Lista mutable


        // MÉTODOS PRINCIPALES
        // 1. Añadir elementos - add()
        nombres.add("Elena"); // Añade al final
        nombres.add("Sanchez");

        // 2. Obtener tamaño - size()
        int capacidad = nombres.size();

        // 3. Acceder a elementos - get();
        String primero = nombres.get(0); // Elena
        String ultimo = nombres.get(nombres.size() - 1); // Sanchez
        // LinkedList
        String primero1 = nombres.getFirst();
        String ultimo1 = nombres.getLast();

        // 4. Modificar elementos - set()
        nombres.set(0, "María");

        // 5. Eliminar elementos - remove()
        nombres.remove(1);
        vocales.remove((Character) 'i'); // Elimina la primera 'i'

        // 6. Buscar elementos - contains()
        boolean existe = nombres.contains("Elena"); // True o false

        // 7. Limpiar lista - clear()
        nombres.clear(); // Dejar la lista vacía


        // RECORRER UNA LISTA
        // 1. Bucle Tradicional - FOR
        for (int i = 0; i < vocales.size(); i++) {
            char letra = vocales.get(i);
            System.out.println(letra);
        }

        // 2. Bucle FOR-EACH
        for (Character letra : vocales){
            System.out.println(letra);
        }

        // --------------------- CONCEPTOS CLAVE --------------------- //
        /*
            1. Las listas están ordenadas
            2. Pueden contener duplicados
            3. Los índices empiezan en 0. El primer elemento get(0), no get(1)
            4. Son genéricas
         */


        // --------------------- ERRORES COMUNES --------------------- //
        /*
            nombres[0] = "Elena" ❌
            nombres.add("Elena"); ✅
            nombres.get(10); // Si sólo hay 3 elementos da error.

            if (nombres.size() > 10){ ✅
                nombres.get(10);
            }
         */

        // --------------------- RESUMEN --------------------- //
        /*
            ArrayList inicialmente : [] (size = 0)
                      .add("A"); : [A] (size = 1)
                      .add("B"); : [A,B] (size = 2)
                      .set(0,"Z"); : [Z,B] (size = 2)
                      .remove(1); : [Z] (size = 1)
                      .clear(); : [] (size = 0)
         */
    }
}