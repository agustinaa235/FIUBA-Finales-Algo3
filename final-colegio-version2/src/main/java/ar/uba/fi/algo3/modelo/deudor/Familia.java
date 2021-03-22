package main.java.ar.uba.fi.algo3.modelo.deudor;

import main.java.ar.uba.fi.algo3.modelo.tarifa.Tarifa;
import main.java.ar.uba.fi.algo3.modelo.tarifa.TarifaPorDos;
import main.java.ar.uba.fi.algo3.modelo.tarifa.TarifaPorTres;
import main.java.ar.uba.fi.algo3.modelo.tarifa.TarifaSimple;

import java.util.ArrayList;

public class Familia implements Deudor {
    private ArrayList<Alumno> miembros;
    private String apellido;
    private Tarifa tarifa;

    public Familia(String apellido){
        this.apellido = apellido;
        this.miembros = new ArrayList<Alumno>();

    }

    public void agregarMiembro(Alumno unMiembro) {

        this.miembros.add(unMiembro);
    }

    @Override
    public Double pagarDeuda() {

        tarifa = new TarifaSimple();
        if (miembros.size()==2){
            tarifa = new TarifaPorDos();
        }else if(miembros.size()==3){
            tarifa = new TarifaPorTres();
        }
        return tarifa.calularDeuda(this.miembros);

    }
}
