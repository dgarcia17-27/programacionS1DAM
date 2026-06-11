package Ejercicio1;

import java.util.ArrayList;

public class CajonFacturas {
    private ArrayList<Factura> facturas;

    // Constructor
    public CajonFacturas() {
        this.facturas = new ArrayList<>();
    }

    // Métodos
    public void anadir(Factura f) {
        facturas.add(f);
    }

    public Factura buscar(int numeroFactura) {
        for (Factura f : facturas) {
            if (f.getNumeroFactura() == numeroFactura) {
                return f;
            }
        }
        return null;
    }

    public ArrayList<Factura> facturasPendientesCobro() {
        ArrayList<Factura> pendientes = new ArrayList<>();
        for (Factura f : facturas) {
            if (!f.isPagada()) {
                pendientes.add(f);
            }
        }
        return pendientes;
    }
}
