package main.java.ar.uba.fi.algo3.modelo.tarifa;

import main.java.ar.uba.fi.algo3.modelo.deudor.Alumno;
import main.java.ar.uba.fi.algo3.modelo.tarifa.Tarifa;

import java.util.ArrayList;

public class TarifaSimple implements Tarifa {
    @Override
    public Double calularDeuda(ArrayList<Alumno> miembros) {
       return (miembros.get(0).pagarDeuda());

    }
}
