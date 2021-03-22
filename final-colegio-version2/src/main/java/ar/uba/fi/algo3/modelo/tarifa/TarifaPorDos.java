package main.java.ar.uba.fi.algo3.modelo.tarifa;

import main.java.ar.uba.fi.algo3.modelo.deudor.Alumno;
import main.java.ar.uba.fi.algo3.modelo.tarifa.Tarifa;

import java.util.ArrayList;

public class TarifaPorDos implements Tarifa {
    @Override
    public Double calularDeuda(ArrayList<Alumno> miembros) {
        Alumno miembro = miembros.get(0);
        return (miembro.pagarDeuda() + miembro.pagarDeuda()*0.75);
    }
}
