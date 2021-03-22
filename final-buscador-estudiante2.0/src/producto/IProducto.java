package producto;

import exactitudCategoria.ExactitudCategoria;
import exactitudNombre.ExactitudNombre;

public interface IProducto {

    boolean cumpleCategoria(String categoriaBuscada, ExactitudCategoria exactitud);
    boolean cumpleNombre(String nombreBuscado, ExactitudNombre exactitud);
    boolean cumplePrecio(int precioMin, int precioMax);
}
