package main.java.ar.uba.fi.modelo.personajes;

import main.java.ar.uba.fi.modelo.herramientas.Armadura;
import main.java.ar.uba.fi.modelo.herramientas.MarkI;

import java.util.ArrayList;

public class IronMan extends ObjetoVenger {

    public ArrayList<Armadura> armaduras = new ArrayList<Armadura>();

    public IronMan(Armadura unaArmadura) {
        this.puntosDeVida = 100;
        this.armaduras.add(unaArmadura);
    }

    public void agregarArmadura(Armadura unaArmadura) {
        armaduras.add(unaArmadura);
    }

    @Override
    public void atacar(ObjetoVenger unVenger) {
        for (Armadura armadura : armaduras) {
            armadura.atacarA(unVenger, this);
        }
    }

    public void robarLasGemasDelInfitnoA(Thanos thanos){
        thanos.quitarGemasDelInfinto();
        this.conseguirLasGemasDelInfinito();
        for(Armadura armadura: armaduras){
            armadura.agregarPoderGemas();
        }
        this.puntosDeVida = 0;
    }

}
