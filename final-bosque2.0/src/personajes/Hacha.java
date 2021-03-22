package personajes;

import casas.CasaDelChanchito;

public class Hacha implements Herramienta{
    @Override
    public void atacarCasa(CasaDelChanchito casa) {
        casa.serAtacadaCon(this);
    }
}
