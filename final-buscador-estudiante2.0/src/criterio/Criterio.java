package criterio;

import producto.IProducto;

import java.util.List;

public interface Criterio {


    boolean cumple(IProducto producto);
}
