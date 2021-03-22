package criterio;

import criterio.Criterio;
import exactitudCategoria.ExactitudCategoria;
import producto.IProducto;

public class PorCategoria implements Criterio {

    private String categoriaBuscada;
    private ExactitudCategoria exactitud;

    public PorCategoria(String categoria, ExactitudCategoria exactitud) {
        this.categoriaBuscada = categoria;
        this.exactitud = exactitud;
    }



    @Override
    public boolean cumple(IProducto producto) {
        return producto.cumpleCategoria(categoriaBuscada, exactitud);
    }
}
