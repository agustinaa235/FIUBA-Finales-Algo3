package exactitudCategoria;

import java.util.List;

public class CategoriaAproximada implements ExactitudCategoria {

    @Override
    public boolean cumple(String categoria, String categoriaBuscada) {
        return (categoria.contains(categoriaBuscada));
    }
}
