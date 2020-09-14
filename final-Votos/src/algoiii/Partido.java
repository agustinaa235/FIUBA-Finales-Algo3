package algoiii;

import java.util.ArrayList;

public abstract class Partido {
    private int votosTotales =0;
    protected ArrayList<String> nombres;

    public  boolean votoPorEstePartido(String leyendaPartido){
        return nombres.contains(leyendaPartido);
    }

    public  void contabilizarVotos(int cantidadDeVotos){
        this.votosTotales +=cantidadDeVotos;

    }

    public int escrutino() {
        return votosTotales;
    }
}
