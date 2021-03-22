package modelo.camuflaje;

import modelo.estadoCamuflaje.EstadoCamuflaje;
import modelo.naveEspacial.NaveEspacial;

public class SinCamuflaje implements Camuflaje {
    @Override
    public EstadoCamuflaje activacionDeCamuflaje() {
        return null;
    }

    @Override
    public void serAtacadaCon(EstadoCamuflaje estadoCamuflaje, NaveEspacial naveEspacial, int danio) {

            naveEspacial.actualizarVida(danio);

    }
}
