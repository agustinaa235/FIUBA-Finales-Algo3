package modelo.superficie;

import modelo.habilidades.Corredor;

public class Hielo implements Superficie {
    @Override
    public int correr(Corredor unCorredor) {
        return (unCorredor.getCoeficienteHielo());
    }
}
