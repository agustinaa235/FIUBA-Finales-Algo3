package main.java.ar.uba.fi.objetovengers.estadoGemas;

import main.java.ar.uba.fi.objetovengers.NosePuedeAtacarEstaMuertoError;
import main.java.ar.uba.fi.objetovengers.venger.Venger;

public class NoPoseeGemas implements Estado {

    @Override
    public void atacarA(Venger vengerEnemigo, int danioAtaque) {
        if(vengerEnemigo.getPuntosDeVida()<=0){
            throw new NosePuedeAtacarEstaMuertoError();
        }
        vengerEnemigo.recibirDanio(danioAtaque);
    }
}
