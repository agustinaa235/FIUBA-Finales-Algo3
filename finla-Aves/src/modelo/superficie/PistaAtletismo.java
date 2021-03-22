package modelo.superficie;

import modelo.habilidades.Corredor;

public class PistaAtletismo implements Superficie {
    @Override
    public int correr(Corredor unCorredor) {
        return (unCorredor.getCoeficientePista());
    }
}
