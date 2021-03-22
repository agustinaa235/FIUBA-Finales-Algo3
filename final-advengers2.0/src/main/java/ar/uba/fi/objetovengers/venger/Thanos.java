package main.java.ar.uba.fi.objetovengers.venger;

import main.java.ar.uba.fi.objetovengers.NosePuedeAtacarEstaMuertoError;
import main.java.ar.uba.fi.objetovengers.estadoGemas.NoPoseeGemas;
import main.java.ar.uba.fi.objetovengers.venger.Venger;

public class Thanos extends Venger {


    private static final int DANIO_DE_ATAQUE = 15;

    public Thanos() {
        this.puntosDeVida = 250;
        this.gemasDelInfinito = new NoPoseeGemas();
    }

    @Override
    public void atacar(Venger venger) {
        if(puntosDeVida<=0){
            throw new NosePuedeAtacarEstaMuertoError();
        }
        gemasDelInfinito.atacarA(venger, DANIO_DE_ATAQUE);

    }

}
