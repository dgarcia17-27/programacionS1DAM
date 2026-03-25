import java.util.ArrayList;
import java.util.Iterator;

public class Stock{
    // ATRIBUTOS
    public ArrayList<Producto> productos = new ArrayList<>();

    // CONSTRUCTOR
    public Stock(){}

    // MÉTODOS
    public void añadirProducto(Producto p){
        this.productos.add(p);
    }

    public void buscarProducto(int codigo){
        System.out.print("Se encuentra el producto en el almacen: ");
        for(Producto p : productos){
            if (p.getCodigo() == codigo){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }

    public void mostrarProductos(){
        System.out.println("Hay " + productos.size() + " productos diferentes en el almacén.");
        for (Producto p : productos){
            System.out.println("\nID: " + p.getCodigo() + "\nDesc: " + p.getDescripcion());
        }
    }

    public void borrarProducto(int codigo){
        productos.removeIf(p -> p.getCodigo() == codigo);
    }

    public void productosAgotados(){
        System.out.println("\nProductos agotados: ");
        for(Producto p : productos){
            if (p.getCantidad() == 0){
                System.out.println(p.getDescripcion() + " - " + p.getCodigo());
            } else {
                System.out.println("No hay productos agotados.");
            }
        }
    }

    public void productosBajoMinimos(){
        System.out.println("\nProductos bajo mínimos: ");
        for(Producto p : productos){
            if (p.getCantidad() < p.getMinimo()){
                System.out.println(p.getDescripcion() + " - " + p.getCodigo());
            } else {
                System.out.println("No hay productos bajo mínimos.");
            }
        }
    }

}
