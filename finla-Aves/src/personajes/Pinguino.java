package personajes;

import modelo.superficie.Superficie;
import modelo.habilidades.Nadador;
import modelo.habilidades.Corredor;

public class Pinguino implements Corredor, Nadador {
    private static final int COEFICIENTE_NADAR = 20;
    private static final  int COEFICIENTE_PISTA_ATLETISMO = 0;
    private static final  int COEFICIENTE_BARRO = 0;
    private static final  int COEFICIENTE_HIELO = 5;

    @Override
    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public int getCoeficientePista() {
        return COEFICIENTE_PISTA_ATLETISMO;
    }

    @Override
    public int getCoeficienteHielo() {
        return COEFICIENTE_HIELO;
    }

    @Override
    public int getCoeficienteBarro() {
        return COEFICIENTE_BARRO;
    }

    @Override
    public int nadar() {
        return COEFICIENTE_NADAR;
    }
}
