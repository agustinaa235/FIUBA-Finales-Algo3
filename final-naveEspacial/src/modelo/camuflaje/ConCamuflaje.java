package modelo.camuflaje;

import modelo.estadoCamuflaje.CamuflajeActivado;
import modelo.estadoCamuflaje.EstadoCamuflaje;
import modelo.naveEspacial.NaveEspacial;

public class ConCamuflaje implements Camuflaje {

    public EstadoCamuflaje activacionDeCamuflaje() {
        return new CamuflajeActivado();
    }

    @Override
    public void serAtacadaCon(EstadoCamuflaje estadoCamuflaje, NaveEspacial naveEspacial, int danio) {
            estadoCamuflaje.serAtacadaCon(naveEspacial, danio);
    }
}
