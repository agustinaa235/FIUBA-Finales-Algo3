package modelo.cupones;

import modelo.cupones.Cupon;
import modelo.envio.Envio;

public class SinCupon implements Cupon {
    @Override
    public double precioTotal(Double precio, Envio envio) {
        return envio.precioTotal(precio);
    }
}
