package main.java.ar.uba.fi.modelo.herramientas;

import main.java.ar.uba.fi.modelo.personajes.IronMan;
import main.java.ar.uba.fi.modelo.personajes.ObjetoVenger;

    public class WarMachine extends Armadura{
        public WarMachine(){
            danioAtaque = 10;
        }
        @Override
        public void atacarA(ObjetoVenger unVenger, IronMan ironMan) {
            unVenger.recibirDanio(danioAtaque*poderGemas);
            ironMan.sumarVida(danioAtaque);
        }
}
