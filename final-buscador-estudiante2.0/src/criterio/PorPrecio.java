package criterio;

import criterio.Criterio;
import producto.IProducto;

public class PorPrecio implements Criterio {

    private int precioMin;
    private int precioMax;
    public PorPrecio(int precioMin, int precioMax) {
        this.precioMin = precioMin;
        this.precioMax = precioMax;
    }



    @Override
    public boolean cumple(IProducto producto) {
        return producto.cumplePrecio(precioMin, precioMax);
    }
}
