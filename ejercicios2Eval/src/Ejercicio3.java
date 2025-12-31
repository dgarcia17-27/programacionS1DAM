    public class Ejercicio3 {

        /**
             Escribe una función que devuelva el recuento de caracteres alfabéticos y dígitos numéricos distintos, sin
             distinción entre mayúsculas y minúsculas, que aparecen más de una vez en la cadena de entrada.
         */

        public static void main(String[] args) {
            System.out.print(ContarCadena());
        }

        public static String ContarCadena(){
            String cuenta = "", noRepetir = "", cadenaPrueba = "Hola mundo essto sirve para contar una cadena y sus valores";
            char letra;
            int contador = 0;

            for (int i = 0; i < cadenaPrueba.length(); i++) {
                letra = cadenaPrueba.toLowerCase().charAt(i);

                if (noRepetir.indexOf(letra) != -1 || letra == ' '){
                    continue;
                }

                for (int j = 0; j < cadenaPrueba.length(); j++) {
                    if (cadenaPrueba.charAt(i) == cadenaPrueba.charAt(j)){
                        contador++;
                    }
                }

                cuenta += letra + " = " + contador + "\n";
                noRepetir += letra;
                contador = 0;
            }

            return cuenta;
        }
    }
