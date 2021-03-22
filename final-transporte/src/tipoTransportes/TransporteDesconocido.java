package tipoTransportes;

public class TransporteDesconocido implements TipoTransporte {
    @Override
    public int pagarPeaje(int precio_por_rueda, int cantidadRuedas, int coeficiente) {
        return coeficiente;
    }
}
