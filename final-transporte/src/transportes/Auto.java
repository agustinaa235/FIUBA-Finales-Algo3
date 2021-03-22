package transportes;

import telepase.*;
import tipoTransportes.TransporteNormal;
import transportes.Transporte;

public class Auto extends Transporte implements PagadorTelepase {

    private static final int COEFICIENTE_AUTO = 2;

    public Auto(){
        this.tipodePagador = new SinTelepase();
        this.cantidadRuedas = 4;
    }

    @Override
    public int pagarPeaje(int precio_por_rueda) {
        return tipodePagador.pagarPeaje(precio_por_rueda, cantidadRuedas);
    }

    @Override
    public void registrarTelepase() {
        this.tipodePagador = new ConTelepase(COEFICIENTE_AUTO, new TransporteNormal());
    }
}
