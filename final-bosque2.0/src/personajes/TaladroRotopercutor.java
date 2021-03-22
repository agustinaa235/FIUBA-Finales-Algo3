package personajes;

import casas.CasaDelChanchito;

public class TaladroRotopercutor implements Herramienta {
    @Override
    public void atacarCasa(CasaDelChanchito casa) {
        casa.serAtacadaCon(this);
    }
}
