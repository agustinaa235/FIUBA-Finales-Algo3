package telepase;

public class SinTelepase implements EstadoTelepase {
    @Override
    public int pagarPeaje(int precio_por_rueda, int cantidadRuedas) {
        return precio_por_rueda*cantidadRuedas;
    }
}
