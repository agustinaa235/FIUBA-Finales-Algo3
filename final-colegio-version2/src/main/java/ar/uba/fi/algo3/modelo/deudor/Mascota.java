package main.java.ar.uba.fi.algo3.modelo.deudor;

import main.java.ar.uba.fi.algo3.modelo.deudor.Deudor;

public class Mascota implements Deudor {

    private double cuota = 150;
    private String nombre;
    private int cantidadDeMordidas;
    public Mascota(String nombre){
        this.nombre = nombre;
        this.cantidadDeMordidas =0;
    }
    @Override
    public Double pagarDeuda() {
        return cuota;
    }

    public void morder(){
        this.cantidadDeMordidas +=1;
        this.cuota = cuota*2;
    }

    public int mordeduras() {
        return cantidadDeMordidas;
    }
}
