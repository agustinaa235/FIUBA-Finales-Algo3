package modelo.estadoCamuflaje;

import modelo.naveEspacial.NaveEspacial;

public class CamuflajeDesactivdado implements EstadoCamuflaje {
    @Override
    public void serAtacadaCon(NaveEspacial naveEspacial, int danio) {
        naveEspacial.actualizarVida(danio);
    }
}
