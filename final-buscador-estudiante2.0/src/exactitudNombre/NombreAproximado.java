package exactitudNombre;

import java.util.List;

public class NombreAproximado implements ExactitudNombre {



    @Override
    public boolean cumple(String nombre, String nombreBuscado) {
        return (nombre.startsWith(nombreBuscado));
    }
}
