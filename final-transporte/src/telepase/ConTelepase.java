package telepase;

import tipoTransportes.TipoTransporte;

public class ConTelepase implements EstadoTelepase {
    private int coeficiente;
    private TipoTransporte tipoTransporte;
    public ConTelepase(int coeficiente, TipoTransporte tipoTransporte){
        this.coeficiente = coeficiente;
        this.tipoTransporte = tipoTransporte;
    }
    @Override
    public int pagarPeaje(int precio_por_rueda, int cantidadRuedas) {
        return tipoTransporte.pagarPeaje(precio_por_rueda,cantidadRuedas, coeficiente);
    }
}
