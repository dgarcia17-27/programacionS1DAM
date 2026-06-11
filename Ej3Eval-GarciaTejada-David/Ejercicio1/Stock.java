package Ejercicio1;

import java.util.ArrayList;

public class Stock {
    // Atributos
    private ArrayList<Producto> productos;

    // Constructor
    public Stock() {
        this.productos = new ArrayList<>();
    }

    // Métodos
    public void anadir(Producto p) {
        productos.add(p);
    }

    public void borrar(int codigo) {
        productos.removeIf(p -> p.getCodigo() == codigo);
    }

    public Producto buscar(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Producto> productosAgotados() {
        ArrayList<Producto> agotados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCantidad() <= 0) {
                agotados.add(p);
            }
        }
        return agotados;
    }

    public ArrayList<Producto> productosBajoMinimos() {
        ArrayList<Producto> bajoMinimos = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCantidad() < p.getMinimo()) {
                bajoMinimos.add(p);
            }
        }
        return bajoMinimos;
    }
}
