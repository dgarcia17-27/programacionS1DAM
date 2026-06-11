package Ejercicio2;

import java.time.LocalTime;

public class EscalaOcio extends Escala {

    public EscalaOcio(String ciudad, LocalTime horaBajada, LocalTime horaRegreso) {
        super(ciudad, horaBajada, horaRegreso);
    }

    @Override
    public String toString() {
        return "[Escala de Ocio] -> " + super.toString();
    }
}
