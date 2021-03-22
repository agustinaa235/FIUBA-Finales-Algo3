package main.java.ar.uba.fi.algo3.modelo.deudor;

import main.java.ar.uba.fi.algo3.modelo.deudor.Deudor;

public class Alumno implements Deudor {
    private static final double CUOTA = 100.0;

    //private final Alumno hermano;
    private String nombre;
    private String apellido;

    public Alumno(String nombre) {
        this.nombre = nombre;
        //this.apellido = "NN";

        //this.hermano = null;
    }
/*
    public Double deuda() {

        if (this.hermano == null) {
            return CUOTA;
        }

        if ( this.hermano != null &&
            this.apellido.equals(this.hermano.apellido)
        ) {
            return .75 * CUOTA;
        }

        return CUOTA;
    }*/

    @Override
    public Double pagarDeuda() {
        return CUOTA;
    }
}
