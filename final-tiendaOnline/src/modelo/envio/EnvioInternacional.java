package modelo.envio;

import modelo.cupones.Cupon;

public class EnvioInternacional implements Envio {


    private static final Double RECARGO_INTERNACIONAL =1.2 ;

    @Override
    public double precioTotal(Double precio) {
        return precio*RECARGO_INTERNACIONAL;
    }

    @Override
    public boolean eslocal() {
        return false;
    }
}
