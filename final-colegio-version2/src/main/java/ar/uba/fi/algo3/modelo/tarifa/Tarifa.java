package main.java.ar.uba.fi.algo3.modelo.tarifa;

import main.java.ar.uba.fi.algo3.modelo.deudor.Alumno;

import java.util.ArrayList;

public interface Tarifa {
    Double calularDeuda(ArrayList<Alumno> miembros);
}
