package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    // Atributos
    private LocalDate fecha;
    private int numeroFactura;
    private ArrayList<LineaFactura> lineasFactura;
    private boolean pagada;

    // Constructor
    public Factura(LocalDate fecha, int numeroFactura, boolean pagada) {
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.lineasFactura = new ArrayList<>();
        this.pagada = pagada;
    }

    // Metodos
    public void anadirLinea(LineaFactura linea) {
        this.lineasFactura.add(linea);
    }

    // Getters y Setters
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public int getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(int numeroFactura) { this.numeroFactura = numeroFactura; }

    public ArrayList<LineaFactura> getLineasFactura() { return lineasFactura; }
    public void setLineasFactura(ArrayList<LineaFactura> lineasFactura) { this.lineasFactura = lineasFactura; }

    public boolean isPagada() { return pagada; }
    public void setPagada(boolean pagada) { this.pagada = pagada; }

    @Override
    public String toString() {
        return "Factura Nº " + numeroFactura + " [Fecha: " + fecha + ", Pagada: " + pagada + ", Líneas: " + lineasFactura.size() + "]";
    }
}
