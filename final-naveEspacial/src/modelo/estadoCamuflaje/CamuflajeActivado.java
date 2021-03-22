package modelo.estadoCamuflaje;

import modelo.naveEspacial.NaveEspacial;

public class CamuflajeActivado implements EstadoCamuflaje {
    @Override
    public void serAtacadaCon(NaveEspacial naveEspacial, int danio) {

        naveEspacial.actualizarVida(0);

    }
}
