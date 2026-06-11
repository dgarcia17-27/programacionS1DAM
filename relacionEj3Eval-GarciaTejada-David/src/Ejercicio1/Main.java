package Ejercicio1;

public class Main {
    static void main(String[] args) {
        Stock sk = new Stock();
        Producto telefono = new Producto(132,"iPhone 17 Pro Max", 1799.99, 9,10);

        sk.agregarProducto(telefono);
        sk.productosAgotados();
        sk.productosBajoMinimos();
        sk.buscarProducto(132);
    }
}
