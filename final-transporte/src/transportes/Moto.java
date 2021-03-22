package transportes;

import telepase.SinTelepase;
import transportes.Transporte;

public class Moto extends Transporte {

    public Moto(){
        this.tipodePagador = new SinTelepase();
        this.cantidadRuedas = 2;
    }
    @Override
    public int pagarPeaje(int precio_por_rueda) {
        return tipodePagador.pagarPeaje(precio_por_rueda, cantidadRuedas);
    }
}
