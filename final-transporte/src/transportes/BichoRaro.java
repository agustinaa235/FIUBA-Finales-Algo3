package transportes;

import telepase.ConTelepase;
import telepase.PagadorTelepase;
import telepase.SinTelepase;
import tipoTransportes.TransporteDesconocido;
import transportes.Transporte;

public class BichoRaro extends Transporte implements PagadorTelepase {
    private static final int COEFICIENTE_BICHO_RARO = 15;

    public BichoRaro(){
        this.tipodePagador = new SinTelepase();
        this.cantidadRuedas = 3;
    }
    @Override
    public void registrarTelepase() {
        this.tipodePagador = new ConTelepase(COEFICIENTE_BICHO_RARO, new TransporteDesconocido());
    }

    @Override
    public int pagarPeaje(int precio_por_rueda) {
        return tipodePagador.pagarPeaje(precio_por_rueda, cantidadRuedas);
    }
}
