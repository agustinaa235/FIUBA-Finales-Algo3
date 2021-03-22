package modelo.cupones;

import modelo.envio.Envio;

public class CyberMonday implements Cupon {

    private static final Double DESCUENTO_CYBER_MONDAY = 0.5;

    @Override
    public double precioTotal(Double precio, Envio envio) {
        return envio.precioTotal(precio*DESCUENTO_CYBER_MONDAY);
    }
}
