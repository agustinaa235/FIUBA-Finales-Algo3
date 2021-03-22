package modelo.envio;

import modelo.cupones.Cupon;

public class EnvioLocal implements Envio {

    private static final Double RECARGO_LOCAL = 1.1;


    @Override
    public double precioTotal(Double precio) {
        return precio*RECARGO_LOCAL;

    }

    @Override
    public boolean eslocal() {
        return true;
    }
}
