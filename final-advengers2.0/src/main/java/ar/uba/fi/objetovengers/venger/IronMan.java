package main.java.ar.uba.fi.objetovengers.venger;

import main.java.ar.uba.fi.objetovengers.NosePuedeAtacarEstaMuertoError;
import main.java.ar.uba.fi.objetovengers.armaduras.Armadura;
import main.java.ar.uba.fi.objetovengers.estadoGemas.NoPoseeGemas;
import main.java.ar.uba.fi.objetovengers.venger.Venger;

import java.util.ArrayList;

public class IronMan extends Venger {

    private ArrayList<Armadura> armaduras;
    public IronMan(){
        this.puntosDeVida = 100;
        this.armaduras = new ArrayList<Armadura>();
        this.gemasDelInfinito = new NoPoseeGemas();
    }
    @Override
    public void atacar(Venger vengerEnemigo) {
        if(puntosDeVida<=0){
            throw new NosePuedeAtacarEstaMuertoError();
        }
        for(Armadura armadura: armaduras){
            armadura.atacarA(vengerEnemigo, this, gemasDelInfinito);
        }

    }


    public void agregarArmadura(Armadura unaArmadura) {
        armaduras.add(unaArmadura);
    }

    public void robarGemasA(Venger vengerEnemigo){
        vengerEnemigo.perderGemas();
        this.conseguirLasGemasDelInfinito();
        this.atacar(vengerEnemigo);
        this.puntosDeVida = 0;
    }
}
