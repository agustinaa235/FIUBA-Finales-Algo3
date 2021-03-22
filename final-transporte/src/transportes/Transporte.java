package transportes;

import telepase.EstadoTelepase;

public abstract class Transporte {
    protected int cantidadRuedas;
    protected EstadoTelepase tipodePagador;

    public abstract int pagarPeaje(int precio_por_rueda);
}
