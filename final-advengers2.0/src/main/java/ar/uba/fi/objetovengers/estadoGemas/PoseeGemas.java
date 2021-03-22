package main.java.ar.uba.fi.objetovengers.estadoGemas;

import main.java.ar.uba.fi.objetovengers.NosePuedeAtacarEstaMuertoError;
import main.java.ar.uba.fi.objetovengers.venger.Venger;

public class PoseeGemas implements Estado {


    private static final int DANIO_GEMAS = 4;

    @Override
    public void atacarA(Venger vengerEnemigo, int danioAtaque) {
        if(vengerEnemigo.getPuntosDeVida()<=0){
            throw new NosePuedeAtacarEstaMuertoError();
        }
        vengerEnemigo.recibirDanio(danioAtaque*DANIO_GEMAS);
    }
}
