package celda;

import excepciones.LetraSePasaDelLargoPermitido;
import excepciones.PesoMenorQueCeroError;

public class Regla {

    private static final int LARGOPERMITIDO = 1;

    public static void verificarPeso(int pesoLetra) {
        if(pesoLetra<0){
            throw new PesoMenorQueCeroError();
        }

    }

    public static void verificarLargo(String letra) {
        if(letra.length()!=LARGOPERMITIDO){
            throw new LetraSePasaDelLargoPermitido();
        }
    }
}
