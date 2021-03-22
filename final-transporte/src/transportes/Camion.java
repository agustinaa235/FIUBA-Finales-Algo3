package transportes;

import telepase.ConTelepase;
import telepase.PagadorTelepase;
import telepase.SinTelepase;
import tipoTransportes.TransporteNormal;
import transportes.Transporte;

public class Camion extends Transporte implements PagadorTelepase {

    private static final int COEFICIENTE_CAMION = 4;

    public Camion(){
        this.cantidadRuedas = 18;
        this.tipodePagador = new SinTelepase();
    }
    @Override
    public void registrarTelepase() {
        this.tipodePagador = new ConTelepase(COEFICIENTE_CAMION, new TransporteNormal());
    }

    @Override
    public int pagarPeaje(int precio_por_rueda) {
        return tipodePagador.pagarPeaje(precio_por_rueda, cantidadRuedas);
    }
}
