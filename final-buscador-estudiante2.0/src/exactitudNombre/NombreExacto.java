package exactitudNombre;

import java.util.List;

public class NombreExacto implements ExactitudNombre {


    @Override
    public boolean cumple(String nombre, String nombreBuscado) {
        return (nombre.equals(nombreBuscado));
    }
}
