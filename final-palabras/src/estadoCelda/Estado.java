package estadoCelda;

import celda.Celda;
import letra.Letra;

public interface Estado {
    int calcularPrecio(Celda unaCelda, Letra unaLetra);
}
