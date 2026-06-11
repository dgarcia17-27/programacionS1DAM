package Ejercicio2;

import java.time.LocalTime;

public class EscalaCultural extends Escala {
    private double precioGuia;

    public EscalaCultural(String ciudad, LocalTime horaBajada, LocalTime horaRegreso, double precioGuia) {
        super(ciudad, horaBajada, horaRegreso);
        this.precioGuia = precioGuia;
    }

    // Getters y Setters específicos
    public double getPrecioGuia() { return precioGuia; }
    public void setPrecioGuia(double precioGuia) { this.precioGuia = precioGuia; }

    @Override
    public String toString() {
        return "[Escala Cultural] -> " + super.toString() + " | Precio Guía: " + precioGuia + "€";
    }
}
