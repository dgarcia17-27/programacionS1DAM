package Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Crucero {
    // Atributos
    private String codigo;
    private String nombreComercial;
    private String nombreBarco;
    private LocalDate fechaPartida;
    private LocalDate fechaRegreso;
    private ArrayList<Escala> escalas;

    // Constructor
    public Crucero(String codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida, LocalDate fechaRegreso) {
        this.codigo = codigo;
        this.nombreComercial = nombreComercial;
        this.nombreBarco = nombreBarco;
        this.fechaPartida = fechaPartida;
        this.fechaRegreso = fechaRegreso;
        this.escalas = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombreComercial() { return nombreComercial; }
    public void setNombreComercial(String nombreComercial) { this.nombreComercial = nombreComercial; }

    public String getNombreBarco() { return nombreBarco; }
    public void setNombreBarco(String nombreBarco) { this.nombreBarco = nombreBarco; }

    public LocalDate getFechaPartida() { return fechaPartida; }
    public void setFechaPartida(LocalDate fechaPartida) { this.fechaPartida = fechaPartida; }

    public LocalDate getFechaRegreso() { return fechaRegreso; }
    public void setFechaRegreso(LocalDate fechaRegreso) { this.fechaRegreso = fechaRegreso; }

    public ArrayList<Escala> getEscalas() { return escalas; }

    // Métodos
    public void anadirEscala(Escala escala) {
        this.escalas.add(escala);
    }

    public double coste() {
        double precioTotal = 600.0;

        for (Escala e : escalas) {
            if (e instanceof EscalaCultural) {
                EscalaCultural cultural = (EscalaCultural) e;
                precioTotal += 100.0 + cultural.getPrecioGuia();
            } else if (e instanceof EscalaOcio) {
                precioTotal += 100.0;
            }
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CRUCERO: ").append(nombreComercial).append(" (Cod: ").append(codigo).append(")\n");
        sb.append("Barco: ").append(nombreBarco).append("\n");
        sb.append("Fechas: ").append(fechaPartida).append(" al ").append(fechaRegreso).append("\n");
        sb.append("ITINERARIO DE ESCALAS:\n");

        if (escalas.isEmpty()) {
            sb.append("  Sin escalas programadas.\n");
        } else {
            for (Escala e : escalas) {
                sb.append("  - ").append(e.toString()).append("\n");
            }
        }

        sb.append("COSTE TOTAL: ").append(coste()).append("€\n");

        return sb.toString();
    }
}
