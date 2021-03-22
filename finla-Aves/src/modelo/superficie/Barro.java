package modelo.superficie;

import modelo.habilidades.Corredor;

public class Barro implements Superficie {
    @Override
    public int correr(Corredor unCorredor) {
        return (unCorredor.getCoeficienteBarro());
    }
}
