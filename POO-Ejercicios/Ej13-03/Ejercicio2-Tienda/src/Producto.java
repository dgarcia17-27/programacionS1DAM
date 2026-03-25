public class Producto {
    // ATRIBUTOS
    private int codigo;
    private String descripcion;
    private double precio;
    private int cantidad;
    private int minimo;

    // CONSTRUCTOR
    public Producto(int codigo, String descripcion, double precio, int cantidad, int minimo){
        setCodigo(codigo);
        setDescripcion(descripcion);
        setPrecio(precio);
        setCantidad(cantidad);
        setMinimo(minimo);
    }

    // GETTERS Y SETTERS
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        if (codigo > 0){
            this.codigo = codigo;
        } else {
            System.out.println("El código de producto introducido no es válido.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        if (descripcion.isEmpty()){
            System.out.println("La descripcion no puede estar vacía.");
        } else {
            this.descripcion = descripcion;
        }
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio < 0){
            System.out.println("El precio introducido no es válido!");
        } else {
            this.precio = precio;
        }
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        if (cantidad < 0){
            System.out.println("La cantidad introducida no es válida!");
        } else {
            this.cantidad = cantidad;
        }
    }

    public int getMinimo() {
        return minimo;
    }
    public void setMinimo(int minimo) {
        if (minimo < 0){
            System.out.println("El minimo introducido no es válido!");
        } else {
            this.minimo = minimo;
        }
    }

}
