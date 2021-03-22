package main.java.ar.uba.fi.algo3.modelo.institucion;

import main.java.ar.uba.fi.algo3.modelo.deudor.Deudor;
import main.java.ar.uba.fi.algo3.modelo.deudor.Mascota;

import java.util.LinkedList;
import java.util.List;

public class Colegio {
    private List<Deudor> deudores;
    private List<Mascota> mascotas;

    public Colegio() {

       this.deudores = new LinkedList<Deudor>();
       this.mascotas = new LinkedList<Mascota>();
    }
    public void anotar(Deudor deudor){
        this.deudores.add(deudor);
    }
    public void anotar(Mascota unaMascota){
        this.deudores.add(unaMascota);
        this.mascotas.add(unaMascota);
    }

    public Double deudaAcumulada() {

        Double result = 0.0;

        for (Deudor deudor : this.deudores) {
            result += deudor.pagarDeuda();
        }
        return result;
    }
    public int mordeduras(){

        int mordeduras = 0;
        for(Mascota mascota: this.mascotas){
            mordeduras +=mascota.mordeduras();
        }
        return mordeduras;
    }

}
