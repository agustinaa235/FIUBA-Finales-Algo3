package modelo.cupones;

import modelo.envio.Envio;

public class BlackFriday implements Cupon {
    private static final Double DESCUENTO_BLACK_FRIDAY = 0.15;

    @Override
    public double precioTotal(Double precio, Envio envio) {
        return envio.precioTotal(precio*DESCUENTO_BLACK_FRIDAY);
    }
}
