package modelo.envio;

import modelo.cupones.Cupon;

public interface Envio {


    double precioTotal(Double total);

    boolean eslocal();
}
