import criterio.ContenedorDeCriterios;
import producto.IProducto;

import java.util.ArrayList;
import java.util.List;

public class Buscador {

    private List<IProducto> productos;
    private int limite = 100;


    public Buscador() {
        productos = new ArrayList<IProducto>();
    }

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }


    public List<IProducto> buscar(ContenedorDeCriterios criterios) {

        return criterios.buscar(this.productos, limite);
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
