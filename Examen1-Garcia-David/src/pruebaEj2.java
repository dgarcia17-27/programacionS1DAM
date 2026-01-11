import java.util.Scanner;

public class pruebaEj2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, valorDepurado = 0, aux;

        System.out.println("Teclea el valor: ");
        valor = teclado.nextInt();
        teclado.close();

        while (valor > 0){
            aux = valor % 10;
            if (aux != 0){
                valorDepurado = valorDepurado * 10 + aux;
            }
            valor /= 10;
        }
        while (valorDepurado > 0){
            aux = valorDepurado % 10;
            valor = valor * 10 + aux;
            valorDepurado /= 10;
        }

        System.out.println(valor);
    }
}