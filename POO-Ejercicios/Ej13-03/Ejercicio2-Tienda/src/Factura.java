import java.util.ArrayList;
import java.util.Date;

public class Factura {
    // ATRIBUTOS
    private Date fecha;
    private int numeroFactura;
    private ArrayList<LineaFactura> lineaFacturas;
    private boolean pagada;

    // CONSTRUCTOR
    public Factura(){
        this.lineaFacturas = new ArrayList<>();
        this.pagada = false;
    }

    public Factura(int numeroFactura, Date fecha){
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.lineaFacturas = new ArrayList<>();
        this.pagada = false;
    }

    // GETTERS Y SETTERS
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public ArrayList<LineaFactura> getLineaFacturas() {
        return lineaFacturas;
    }

    public boolean isPagada() {
        return pagada;
    }
    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    // MÉTODOS
    public void añadirLineaFactura(LineaFactura linea){
        lineaFacturas.add(linea);
    }
}
