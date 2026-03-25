import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stock sk = new Stock();
        Producto placaBase = new Producto(120, "Placa base MSI Z590", 299.99, 200, 10);
        LineaFactura LF = new LineaFactura(placaBase);
        Factura factura = new Factura("18/03/2026",LF,true);
        CajonFacturas cf = new CajonFacturas();

        Producto placaAourus = new Producto(100, "Placa base Auorus", 299.99, 200, 10);
        LineaFactura lineaAourus = new LineaFactura(placaAourus);
        Factura facturaPlaca = new Factura("17/02/2025",lineaAourus,false);

        cf.añadirFactura(facturaPlaca);
        cf.añadirFactura(factura);

        cf.facturasPendientesCobro();
        cf.buscarFactura(factura);
    }
}
