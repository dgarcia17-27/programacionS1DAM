package Ejercicio1;

public class LineaFactura {
    // Atributos
    private int codigo;
    private float precio;
    private int cantidad;

    // Constructor
    public LineaFactura(int codigo, float precio, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public String toString() {
        return "Línea -> Producto Cod: " + codigo + " | Cantidad: " + cantidad + " | Precio Ud: " + precio + "€";
    }
}
