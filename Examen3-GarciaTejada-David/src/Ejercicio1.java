public class Ejercicio1 {
    public static void main(String[] args) {
        int cantidadCoches = 22, objetivo = 3000, cantidadHoras = 0;
        double prodTotal = 0;

        for (int i = 1; i <= 100; i++) {
            switch (i){
                case 1,40:
                    cantidadHoras = objetivo / (cantidadCoches * i);
                    prodTotal = cantidadHoras * ((cantidadCoches * i) * 1);
                    break;
                case 41,80:
                    cantidadHoras = objetivo / (cantidadCoches * i);
                    prodTotal = cantidadHoras * ((cantidadCoches * i) * 0.9);
                    break;
                case 81,95:
                    cantidadHoras = objetivo / (cantidadCoches * i);
                    prodTotal = cantidadHoras * ((cantidadCoches * i) * 0.8);
                    break;
                case 96,100:
                    cantidadHoras = objetivo / (cantidadCoches * i);
                    prodTotal = cantidadHoras * ((cantidadCoches * i) * 0.77);
                    break;
            }
            System.out.printf("Velocidad: %d Horas: %d Total: %f\n",i,cantidadHoras,prodTotal);
        }
    }
}