import java.util.ArrayList;

public class Stock {
    // ATRIBUTOS
    private ArrayList<Producto> productos;

    // CONSTRUCTOR
    public Stock(){
        this.productos = new ArrayList<>();
    }

    // MÉTODOS
    public void añadirProducto(Producto p){
        if (productos.contains(p)){
            System.out.println("El producto ya existe");
        } else {
            productos.add(p);
        }
    }

    public void borrarProducto(Producto p){
        if (productos.contains(p)){
            productos.remove(p);
            System.out.println("El producto se borró de forma correcta");
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void buscarProducto(int codigo){
        for(Producto p : productos){
            if (p.getCodigo() == codigo){
                System.out.println("El producto existe");
            } else {
                System.out.println("El producto no existe");
            }
        }
    }

    public void productosBajoMinimos(){
        int contador = 0;
        System.out.println("\nProductos bajo minimos:");
        for(Producto p : productos){
            if (p.getCantidad() < p.getMinimo()){
                System.out.println("- " + p.getDescripcion());
                contador++;
            }
        }
        System.out.printf("Total bajo mínimos: %d\n", contador);
    }

    public void productosAgotados(){
        int contador = 0;
        System.out.println("Productos agotados lista: ");
        for (Producto p : productos){
            if (p.getCantidad() <= 0){
                System.out.println("- " + p.getDescripcion());
                contador++;
            }
        }
        System.out.printf("Cantidad de productos agotados: %d", contador);
    }

}
