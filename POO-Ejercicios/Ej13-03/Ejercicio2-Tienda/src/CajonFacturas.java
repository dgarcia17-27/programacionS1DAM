import java.util.ArrayList;

public class CajonFacturas {
    // ATRIBUTOS
    private ArrayList<Factura> facturas = new ArrayList<>();

    // CONSTRUCTOR
    public CajonFacturas(){}

    // MÉTODOS
    public void añadirFactura(Factura f){
        this.facturas.add(f);
    }

    public void buscarFactura(Factura f){
        for(Factura factura : facturas){
            if (factura.getNumeroFactura() == f.getNumeroFactura()){
                System.out.println();
                factura.getDatos();
            }
        }
    }

    public void facturasPendientesCobro(){
        for (Factura factura : facturas){
            if (!factura.isPagada()){
                factura.getDatos();
            }
        }
    }


    // GETTERS Y SETTERS


}
