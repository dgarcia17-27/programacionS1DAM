package Ejercicio1;

import java.util.ArrayList;

public class Stock {
    // Atributos
    private ArrayList<Producto> productos;

    // Constructor
    public Stock(){
        this.productos = new ArrayList<>();
    }

    // Metodos
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public void borrarProducto(Producto p){
        this.productos.remove(p);
    }
    public void buscarProducto(int codigo){
        for(Producto prod : productos){
            if (prod.getCodigo() == codigo){
                System.out.println("El producto existe");
            }
        }
        System.out.println("Finalizó la busqueda con exito");
    }

    public void productosAgotados(){
        System.out.println("==== Productos sin existencias ====");
        for (Producto p : productos){
            if (p.getCantidad() == 0){
                System.out.println("- " + p.getDescripcion());
            }
        }
    }

    public void productosBajoMinimos(){
        System.out.println("==== Productos bajo mínimos ====");
        for (Producto p : productos){
            if (p.getCantidad() < p.getMinimo()){
                System.out.println("- " + p.getDescripcion());
            }
        }
    }
}