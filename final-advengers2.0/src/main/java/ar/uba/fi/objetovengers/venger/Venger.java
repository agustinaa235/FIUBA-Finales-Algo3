package main.java.ar.uba.fi.objetovengers.venger;

import main.java.ar.uba.fi.objetovengers.estadoGemas.Estado;
import main.java.ar.uba.fi.objetovengers.estadoGemas.NoPoseeGemas;
import main.java.ar.uba.fi.objetovengers.estadoGemas.PoseeGemas;

public abstract class Venger {
    protected int puntosDeVida;
    protected Estado gemasDelInfinito;
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void recibirDanio(int danio){
        this.puntosDeVida -= danio;
    }
    public abstract void atacar(Venger unVenger);

    public void sumarVida(int vidaARobar) {
        this.puntosDeVida += vidaARobar;
    }

    public void conseguirLasGemasDelInfinito() {
        this.gemasDelInfinito = new PoseeGemas();
    }

    public void perderGemas() {
        this.gemasDelInfinito = new NoPoseeGemas();
    }
}
