package main.java.ar.uba.fi.objetovengers.armaduras;

import main.java.ar.uba.fi.objetovengers.estadoGemas.Estado;
import main.java.ar.uba.fi.objetovengers.venger.Venger;

public class Armadura {

    private int danioAtaque;
    private int vidaARobar;
    public Armadura(int danioAtaque, int vidaARobar){
        this.danioAtaque = danioAtaque;
        this.vidaARobar = vidaARobar;
    }
    public void atacarA(Venger vengerEnemigo, Venger venger, Estado gemas){

        venger.sumarVida(vidaARobar);
        gemas.atacarA(vengerEnemigo, danioAtaque);
    }
}
