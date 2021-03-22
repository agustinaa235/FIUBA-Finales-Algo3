package modelo.cupones;

import modelo.envio.Envio;

public class MerryChristmas implements Cupon {
    private static final Double DESCUENTO_NAVIDAD = 0.75;

    @Override
    public double precioTotal(Double precio, Envio envio) {
        return envio.precioTotal(precio*DESCUENTO_NAVIDAD);
    }
}
