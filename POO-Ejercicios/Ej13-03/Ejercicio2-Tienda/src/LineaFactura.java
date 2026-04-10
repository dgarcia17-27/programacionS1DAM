public class LineaFactura {
    // ATRIBUTOS
    private Producto producto;
    private int codigo;
    private double precio;
    private int cantidad;

    // CONSTRUCTOR
    public LineaFactura(int codigo, Producto producto, double precio, int cantidad){
        this.codigo = codigo;
        this.producto = producto;
        this.precio = producto.getPrecio();
        this.cantidad = cantidad;
    }

    // GETTERS Y SETTERS
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // MÉTODOS
    public double precioTotal(){
        return precio * cantidad;
    }
}
