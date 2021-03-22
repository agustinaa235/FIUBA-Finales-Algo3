package tipoTransportes;

public class TransporteNormal implements TipoTransporte {
    @Override
    public int pagarPeaje(int precio_por_rueda, int cantidadRuedas, int coeficiente) {
        return (precio_por_rueda*cantidadRuedas/coeficiente);
    }
}
