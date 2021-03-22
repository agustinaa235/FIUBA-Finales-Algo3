package exactitudCategoria;

import java.util.List;

public class CategoriaExacta implements ExactitudCategoria {



    @Override
    public boolean cumple(String categoria, String categoriaBuscada) {
        return (categoria.equals(categoriaBuscada));
    }
}
