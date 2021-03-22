package modelo.cupones;

import modelo.envio.Envio;

public interface Cupon {

    double precioTotal(Double precio, Envio envio);
}
