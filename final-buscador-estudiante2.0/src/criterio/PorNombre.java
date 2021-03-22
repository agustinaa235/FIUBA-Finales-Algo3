package criterio;

import criterio.Criterio;
import exactitudNombre.ExactitudNombre;
import producto.IProducto;

public class PorNombre implements Criterio {

    private String nombreBuscado;
    private ExactitudNombre exactitud;
    public PorNombre(String nombreBuscado, ExactitudNombre exactitud) {
        this.nombreBuscado = nombreBuscado;
        this.exactitud = exactitud;

    }


    @Override
    public boolean cumple(IProducto producto) {
        return producto.cumpleNombre(nombreBuscado, exactitud);
    }
}
