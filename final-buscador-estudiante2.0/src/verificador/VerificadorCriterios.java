package verificador;

import criterio.Criterio;
import producto.IProducto;

import java.util.List;

public class VerificadorCriterios {

    public static Boolean verificarCriterio(IProducto producto, List<Criterio> criterios) {

        boolean cumple = true;
        for( Criterio criterio: criterios){
            if(!criterio.cumple(producto)){
                cumple = false;
            }
        }
        return cumple;
    }
}
