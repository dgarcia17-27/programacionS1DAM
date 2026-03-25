public class LineaFactura {
    // ATRIBUTOS
    private int codigo;
    private double precio;
    private int cantidad;

    // CONSTRUCTOR
    public LineaFactura(Producto p){
        this.codigo = p.getCodigo();
        this.precio = p.getPrecio();
        this.cantidad = p.getCantidad();
    }

    // GETTERS Y SETTERS
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void getDatosLinea(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
    }
}
