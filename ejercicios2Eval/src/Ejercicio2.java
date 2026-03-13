public class Ejercicio2 {

    /**
         ¿Alguna vez has visto palabras como camelCasing o miVariableSuperLarga? Este estilo de escritura se llama
         ”Camel Case” y es muy común en programación. Las palabras se escriben juntas, sin espacios, y cada palabra
         después de la primera empieza con mayúscula.
         Tu misión es crear una función que rompa el Camel Case, insertando un espacio antes de cada letra mayúscula
         que encuentre dentro de la palabra. EJEMPLOS:
         camelCasing = ”camel” + ”Casing”
         miVariableLarga = ”mi” + ”Variable” + ”Larga”
     */

    public static void main(String[] args) {
        System.out.print(DeCamelCasing());
    }

    public static String DeCamelCasing(){
        String camelCasing = "miVariableLarga";
        String deCamelCasing = "";

        for (int i = 0; i < camelCasing.length(); i++) {
            if (camelCasing.charAt(i) == camelCasing.toUpperCase().charAt(i)){
                deCamelCasing += " " + camelCasing.charAt(i);
            } else {
                deCamelCasing += camelCasing.charAt(i);
            }
        }
        return deCamelCasing;
    }
}
