import java.util.Scanner;

class AccesoArray {
    int[] numeros = {2,8,9,34,6};
}

class ComprobarPosicion extends Exception{
    public ComprobarPosicion(String mensaje){
        super(mensaje);
    }
}