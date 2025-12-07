public class Ejercicio3 {

    /**
         Escribe una función que devuelva el recuento de caracteres alfabéticos y dígitos numéricos distintos, sin
         distinción entre mayúsculas y minúsculas, que aparecen más de una vez en la cadena de entrada.
     */

    public static void main(String[] args) {
        System.out.print(ContarCadena());
    }

    public static String ContarCadena(){
        String cadenaPrueba = "ajbguehbbaueh1234423", cuenta = "",unicos = "";
        int contador = 0;
        char letra;

        for (int i = 0; i < cadenaPrueba.length(); i++) {
            letra = cadenaPrueba.charAt(i);

            // Aquí compruebo que la letra no exista como caracter único
            if (unicos.indexOf(letra) != -1){
                continue; // para pasar a la siguiente iteracion si ya se contó el caracter
            }

            // Cuento cuantas veces aparece la letra en la string
            for (int j = 0; j < cadenaPrueba.length(); j++) {
                if (cadenaPrueba.charAt(i) == cadenaPrueba.charAt(j)) {
                    contador++; // contador de cuantas veces aparece en la string
                }
            }

            // Añado el caracter con su conteo a la string que va a ser el return
            cuenta += cadenaPrueba.charAt(i) + " = " + contador + "\n";
            unicos += letra; // agregar el caracter al comprobador
            contador = 0; // reseteo del contador para cada iteración
        }
        return cuenta;
    }
}
