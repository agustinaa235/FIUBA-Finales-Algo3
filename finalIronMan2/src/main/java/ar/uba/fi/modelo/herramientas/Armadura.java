package main.java.ar.uba.fi.modelo.herramientas;

import main.java.ar.uba.fi.modelo.personajes.IronMan;
import main.java.ar.uba.fi.modelo.personajes.ObjetoVenger;

public abstract class Armadura {
    protected int danioAtaque;
    protected int poderGemas = 1;
    public abstract void atacarA(ObjetoVenger unVenger, IronMan ironMan);

    public void agregarPoderGemas(){
        poderGemas = 4;
    }
}
