package estadoCelda;

import celda.Celda;
import estadoCelda.Estado;
import letra.Letra;

public class Contabilizada implements Estado {
    @Override
    public int calcularPrecio(Celda unaCelda, Letra unaLetra) {
        return 0;
    }
}
