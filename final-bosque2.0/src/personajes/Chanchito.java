package personajes;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import casas.CasaDelChanchitoDeMadera;
import casas.CasaDelChanchitoDePaja;

public class Chanchito {

    private CasaDelChanchito casa;

    public Chanchito(){
        this.casa = new CasaDelChanchitoDePaja();
    }

    public void huirACasaDeMadera() {
        this.casa = new CasaDelChanchitoDeMadera();
    }

    public void huirACasaDeCemento() {
        this.casa = new CasaDelChanchitoDeCemento();
    }

    public void serAtacadoPor(Lobo loboFeroz) {
        loboFeroz.atacarCasaChanchito(casa);
    }

    public boolean casaSeEncuentraDestruida() {
        return casa.estaDestruida();
    }
}
