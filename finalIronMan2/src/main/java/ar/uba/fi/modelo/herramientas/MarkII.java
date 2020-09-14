package main.java.ar.uba.fi.modelo.herramientas;

import main.java.ar.uba.fi.modelo.personajes.IronMan;
import main.java.ar.uba.fi.modelo.personajes.ObjetoVenger;

public class MarkII extends Armadura {

    public MarkII(){
        danioAtaque = 12;
    }
    @Override
    public void atacarA(ObjetoVenger unVenger, IronMan ironMan) {
        unVenger.recibirDanio(danioAtaque*poderGemas);
    }
}
