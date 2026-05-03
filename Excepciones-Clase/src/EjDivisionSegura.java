import java.util.Scanner;

public class EjDivisionSegura extends Exception{
    static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Teclea el numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Teclea el denominador: ");
            int denominador = sc.nextInt();
            sc.close();

            double resultado = numerador / denominador;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
