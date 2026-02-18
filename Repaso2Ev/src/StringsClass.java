import java.util.Arrays;
import java.util.Random;

public class StringsClass {
    public static void main(String[] args) {
        /*
            - Cadena de carácteres INMUTABLE
                Cualquier operacion que "modifica" un String crea un nuevo objeto
            - Se pueden crear con literal "texto" con new String("Texto")
                Los literales se guardan en el String pool
            - Siempre usa .equals() para comparar contenido
                El operador == compara referencias, no valores.

         */


        // METODOS ESENCIALES:

        String s = "Hola mundo";

        // Info básica:
        s.length(); //11
        s.isEmpty(); // false
        s.isBlank(); // false
        s.charAt(0); // 'H'

        // Búsqueda:
        s.contains("Mundo"); // true
        s.indexOf("o"); // 1
        s.lastIndexOf("o"); // 9
        s.startsWith("Hola"); // true
        s.endsWith("do"); // true

        // Transformacion:
        s.toUpperCase(); // HOLA MUNDO
        s.toLowerCase(); // hola mundo
        s.trim(); // Elimina espacios al inicio y al final
        s.strip(); // Lo mismo que el trim() pero es más moderno
        s.replace("Mundo","Java"); // Hola Mundo -> Hola Java

        // Extracción:
        s.substring(6); // Java
        s.substring(0,4); // Hola

        // División y unión:
        String[] partes = s.split(","); // ["Hola", "Mundo"]
        String unido = String.join("-", "A", "B", "C"); // A-B-C

        // Comparación:
        s.equals("Hola, Mundo"); // true
        s.equalsIgnoreCase("hola, mundo"); // true
        s.compareTo("Hola"); // Orden lexicográfico

        // Formateo (Java 15+)
        String msg = "Hola, %s! Tienes %d años".formatted("Ana", 21);

        // Conversión de/a otros tipos
        String.valueOf(42); // int -> String
        Integer.parseInt("42"); // String -> int
        char[] chars = s.toCharArray();

        /*
            INMUTABILIDAD:
            Cuando escribes s = s + "Hola", Java crea un nuevo objeto String y descarta
            el anterior. En bucles con muchas concatenaciones, usa STRINGBUILDER
            para evitar problemas de rendimiento.
        */


        /*
            2. StringBuilder

               String (Inmutable)
               - Cada operación crea un nuevo objeto
               - Lento en bucles con concatenación
               - Para texto que no cambia

               ---------------------------------------------

               StringBuilder(Mutable)
               - Modifica el mismo objeto en memoria
               - Muy eficiente en bucles
               - Para construcción dinánica de texto
         */

        // Métodos principales
        StringBuilder sb = new StringBuilder("Hola");

        sb.append(" Mundo"); // Hola Mundo
        sb.append("!"); // Hola Mundo!
        sb.insert(4,","); // Hola, Mundo!
        sb.delete(4,5); // Hola Mundo!
        sb.replace(5,10, "Java"); // Hola Java!
        sb.reverse(); // !avaJ aloH
        sb.length(); // length actual
        sb.charAt(0); // a
        sb.indexOf("Java"); // posicion
        sb.deleteCharAt(0); // Elimina el caracter en esa

        // Encadenamiento de llamadas
        StringBuilder resultado = new StringBuilder().append("Java")
                .append(" es")
                .append(" guay");
                resultado.toString(); // Java es guay

        // Uso eficiente en bucles
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb2.append(i).append("-");
        }


        /*
            3. ARRAYS
            - Coleccion de tamaño FIJO. Los indices van de 0 a lenght - 1
                Pueden ser de cualquier tipo (Primitivos u Objetos)
            - Error si el índice que accedes está fuera de rango.
            - Java soporta arrays de arrays : int[][] (matrices 2D)
                                              int[][][] (3D matrices de matrices)
            - Cada fila puede tener una long diferente. (arrays irregulares).
         */

        // DECLARACION, RECORRIDO Y UTILIDADES
        // Declaración e inicialización
        int[] nums = new int[5]; // [0,0,0,0,0]
        int[] nums2 = {10,20,30,40,50};

        String[] names = new String[3]; // [null,null,null]

        // Acceso y modificación
        nums[0] = 7; // Asignar
        int val = nums[0]; // Leer
        int len = nums.length; // tamaño

        // Recorridos
        //  FOR
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        //  FOR-EACH
        for (int num : nums2){
            System.out.println(num);
        }

        // CLASE ARRAYS
        Arrays.sort(nums2); // [10,20,30,40,50]
        Arrays.fill(nums,99); // [99,99,99,99,99]
        int[] copia = Arrays.copyOf(nums2,2); // [10,20]
        int[] parte = Arrays.copyOfRange(nums2,1,3); // [20,30] excluye la posicion del final
        boolean igual = Arrays.equals(copia,parte); // false
        String str = Arrays.toString(nums2); // "[10,20,30,40,50]"

        // Busqueda binaria (el array debe estar ordenado)
        int pos = Arrays.binarySearch(nums2,20);
        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };
        int elem = matriz[1][2];
        int filas = matriz.length;
        int cols = matriz[0].length;

        /*
            4. CLASE RANDOM. Generador de numeros aleatorios.
            Alternativa: Math.random() devuelve un double entre 0.0 (incl) y 1.0 (excl)
            más simple pero menos flexible.
         */

        // Generación de numeros
        Random random = new Random();
        int n = random.nextInt(6);
        int dado = random.nextInt(6); // 0 - 5
        int dadoReal = random.nextInt(6) + 1; // 1 - 6
        boolean d = random.nextBoolean();
    }
}
