public class Ejercicio1 {
    public static void main(String[] args) {
        int cantidadCoches = 22, objetivo = 3000, cantidadHoras = 0;
        double prodTotal = 0;

        for (int i = 1; i <= 100; i++) {
            if (i <= 40){
                cantidadHoras = objetivo / (cantidadCoches * i);
                prodTotal = cantidadHoras * ((cantidadCoches * i) * 1);
            } else if(i <= 80){
                cantidadHoras = objetivo / (cantidadCoches * i);
                prodTotal = cantidadHoras * ((cantidadCoches * i) * .9);
            } else if (i <= 95) {
                cantidadHoras = objetivo / (cantidadCoches * i);
                prodTotal = cantidadHoras * ((cantidadCoches * i) * .8);
            } else {
                cantidadHoras = objetivo / (cantidadCoches * i);
                prodTotal = cantidadHoras * ((cantidadCoches * i) * .77);
            }
            System.out.printf("Velocidad: %d Horas: %d Total: %.2f\n",i,cantidadHoras,prodTotal);
        }
    }
}