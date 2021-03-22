package criterio;

import producto.IProducto;
import verificador.VerificadorCriterios;

import java.util.ArrayList;
import java.util.List;

public class ContenedorDeCriterios {

    private List<Criterio> criterios = new ArrayList<Criterio>();
    private List<IProducto> productosMatch = new ArrayList<IProducto>();


    public void agregarCriterio(Criterio unCriterio) {
        criterios.add(unCriterio);
    }

    public List<IProducto> buscar(List<IProducto> productos, int limite) {
        int indice = 0;
        Boolean cumpleCriterio = false;

        while (productos.size() > indice && productosMatch.size() < limite) {
            IProducto producto = productos.get(indice);
            cumpleCriterio = VerificadorCriterios.verificarCriterio(producto, criterios);

            if (cumpleCriterio) {
                productosMatch.add(producto);
            }
            indice = indice +1;

        }

        return productosMatch;
    }
}
