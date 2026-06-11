package Ejercicio1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Factura {
    // Atributos
    private LocalDateTime fecha;
    private int numeroFactura = 0;
    private ArrayList<LineaFactura> lineaFacturas;
    private boolean pagada;

    // Constructor
    public Factura(LineaFactura lineaFactura, boolean pagada){
        this.fecha = LocalDateTime.now();
        this.numeroFactura++;
        this.lineaFacturas.add(lineaFactura);
        this.pagada = pagada;
    }
}