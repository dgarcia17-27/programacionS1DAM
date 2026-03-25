public class Factura {
    // ATRIBUTOS
    private String fecha;
    private int numeroFactura;
    public LineaFactura lineaFacturas;
    private boolean pagada;

    // CONTSTRUCTOR
    public Factura(String fecha, LineaFactura lineaFacturas, boolean pagada){
        this.fecha = fecha;
        this.lineaFacturas = lineaFacturas;
        this.pagada = pagada;
        this.numeroFactura++;
    }

    // GETTERS Y SETTERS
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public LineaFactura getLineaFacturas() {
        return lineaFacturas;
    }
    public void setLineaFacturas(LineaFactura lineaFacturas) {
        this.lineaFacturas = lineaFacturas;
    }

    public boolean isPagada() {
        return this.pagada;
    }
    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public void getDatos(){
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Número factura: " + this.numeroFactura);
        System.out.println("Código: " + lineaFacturas.getCodigo());
        System.out.println("Precio: " + lineaFacturas.getPrecio());
        System.out.println("Cantidad: " + lineaFacturas.getCantidad());
        System.out.println("Pagada: " + this.pagada);
    }
}
