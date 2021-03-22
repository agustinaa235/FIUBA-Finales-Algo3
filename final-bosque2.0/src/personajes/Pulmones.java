package personajes;

import casas.CasaDelChanchito;

public class Pulmones implements Herramienta{
    @Override
    public void atacarCasa(CasaDelChanchito casa) {
            casa.serAtacadaCon(this);
    }
}
