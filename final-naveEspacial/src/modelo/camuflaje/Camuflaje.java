package modelo.camuflaje;

import modelo.estadoCamuflaje.EstadoCamuflaje;
import modelo.naveEspacial.NaveEspacial;

public interface Camuflaje {
   EstadoCamuflaje activacionDeCamuflaje();

   void serAtacadaCon(EstadoCamuflaje estadoCamuflaje, NaveEspacial naveEspacial, int danio);
}
