package comidas;

import comidas.Estado;

public class SinSal implements Estado {
    @Override
    public boolean esSinGluten() {
        return false;
    }

    @Override
    public boolean esConGluten() {
        return false;
    }
    public boolean esSinasal(){
        return true;
    }
}
