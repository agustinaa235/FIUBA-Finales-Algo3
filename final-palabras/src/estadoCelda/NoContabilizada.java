package estadoCelda;

import celda.Celda;
import letra.Letra;

public class NoContabilizada implements Estado {
    @Override
    public int calcularPrecio(Celda unaCelda, Letra unaLetra) {
        unaCelda.actualizarEstado(new Contabilizada());
        return unaLetra.calularPeso();
    }
}
