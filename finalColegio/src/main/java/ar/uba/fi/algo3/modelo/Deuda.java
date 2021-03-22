package main.java.ar.uba.fi.algo3.modelo;

import java.util.LinkedList;


public class Deuda {

    private static final double CUOTA = 100.0;
    public Double calcularDeudaPorFamilia(int tamanioFamilia) {

       if(tamanioFamilia>2){
            return (CUOTA*(tamanioFamilia-1));
        }
       return CUOTA + 0.75*(tamanioFamilia-1)*CUOTA;


    }
}
