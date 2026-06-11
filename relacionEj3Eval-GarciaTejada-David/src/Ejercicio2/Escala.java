package Ejercicio2;

import java.time.LocalTime;

public abstract class Escala {
    // Atributos
    protected String ciudad;
    protected LocalTime horaBajada;
    protected LocalTime horaRegreso;

    // Constructor
    public Escala(String ciudad, LocalTime horaBajada, LocalTime horaRegreso) {
        this.ciudad = ciudad;
        this.horaBajada = horaBajada;
        this.horaRegreso = horaRegreso;
    }

    // Getters y Setters
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public LocalTime getHoraBajada() { return horaBajada; }
    public void setHoraBajada(LocalTime horaBajada) { this.horaBajada = horaBajada; }

    public LocalTime getHoraRegreso() { return horaRegreso; }
    public void setHoraRegreso(LocalTime horaRegreso) { this.horaRegreso = horaRegreso; }

    @Override
    public String toString() {
        return "Ciudad: " + ciudad + " | Bajada: " + horaBajada + " | Regreso: " + horaRegreso;
    }
}
