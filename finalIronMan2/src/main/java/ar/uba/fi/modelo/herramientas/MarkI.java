package main.java.ar.uba.fi.modelo.herramientas;

import main.java.ar.uba.fi.modelo.personajes.IronMan;
import main.java.ar.uba.fi.modelo.personajes.ObjetoVenger;

public class MarkI extends Armadura{

    public MarkI(){
        danioAtaque = 10;
    }

    @Override
    public void atacarA(ObjetoVenger unVenger, IronMan ironMan) {
        unVenger.recibirDanio(danioAtaque*poderGemas);
    }
}
