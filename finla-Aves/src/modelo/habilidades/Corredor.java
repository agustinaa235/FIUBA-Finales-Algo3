package modelo.habilidades;

import modelo.superficie.Superficie;

public interface Corredor {

    int correr(Superficie superficie);

    int getCoeficientePista();

    int getCoeficienteHielo();

    int getCoeficienteBarro();
}
