package algoiii.productos;

import algoiii.formasDePago.MetodoDeCobro;

public class Alfajor implements Productos {

    private int costo; //cantidadDeVacas

    @Override
    public void setCosto(int costo) throws Exception {

        this.costo = costo;


    }

    @Override
    public int getCosto() {
        return this.costo;
    }

    @Override
    public double setPrecio(int precio, MetodoDeCobro unMetodoDeCobro) {
        return unMetodoDeCobro.precioTotal(precio,costo);
    }


}
