public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println(Telefono("Hola mundo"));
    }
    public static String Telefono(String mensaje){
        boolean mayus = false;
        StringBuilder teclas = new StringBuilder("");
        String codigo = "";
        for (int i = 0; i < mensaje.length(); i++) {

            // Asignacion teclas
            if (Character.isDigit(mensaje.charAt(i))){
                codigo = mensaje.charAt(i) + "-";
            } else {
                switch (mensaje.toLowerCase().charAt(i)){
                    case 'a':
                        codigo = "2";
                        break;
                    case 'b':
                        codigo = "22";
                        break;
                    case 'c':
                        codigo = "222";
                        break;
                    case 'd':
                        codigo = "3";
                        break;
                    case 'e':
                        codigo = "33";
                        break;
                    case 'f':
                        codigo = "333";
                        break;
                    case 'g':
                        codigo = "4";
                        break;
                    case 'h':
                        codigo = "44";
                        break;
                    case 'i':
                        codigo = "444";
                        break;
                    case 'j':
                        codigo = "5";
                        break;
                    case 'k':
                        codigo = "55";
                        break;
                    case 'l':
                        codigo = "555";
                        break;
                    case 'm':
                        codigo = "6";
                        break;
                    case 'n':
                        codigo = "66";
                        break;
                    case 'o':
                        codigo = "666";
                        break;
                    case 'p':
                        codigo = "7";
                        break;
                    case 'q':
                        codigo = "77";
                        break;
                    case 'r':
                        codigo = "777";
                        break;
                    case 's':
                        codigo = "7777";
                        break;
                    case 't':
                        codigo = "8";
                        break;
                    case 'u':
                        codigo = "88";
                        break;
                    case 'v':
                        codigo = "888";
                        break;
                    case 'w':
                        codigo = "9";
                        break;
                    case 'x':
                        codigo = "99";
                        break;
                    case 'y':
                        codigo = "999";
                        break;
                    case 'z':
                        codigo = "9999";
                        break;
                    case ' ':
                        codigo = "0";
                        break;
                }
            }

            // Comprobar mayus
            if (Character.isUpperCase(mensaje.charAt(i))){
                if (mayus == false){
                    mayus = true;
                    teclas.append("#"+codigo);
                } else {
                    teclas.append(codigo);
                }
            } else {
                if (mayus == true) {
                    mayus = false;
                    teclas.append("#"+codigo);
                } else {
                    teclas.append(codigo);
                }
            }
        }
        return teclas.toString();
    }
}
