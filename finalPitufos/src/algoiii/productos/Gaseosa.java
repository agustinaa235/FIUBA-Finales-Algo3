package algoiii.productos;

import algoiii.formasDePago.MetodoDeCobro;

public class Gaseosa implements Productos {
    private int costo;

    @Override
    public double setPrecio(int precio, MetodoDeCobro unMetodoDeCobro) {
        return (unMetodoDeCobro.precioTotal(precio,costo));

    }

    @Override
    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public int getCosto() {
        return this.costo;
    }

}
