package algoiii.formasDePago;

import algoiii.formasDePago.MetodoDeCobro;

public class Vaca implements MetodoDeCobro {


    private static final int COTIZACIONVACUNA = 10;

    @Override
    public double precioTotal(int precio, int costo) {
        return precio*COTIZACIONVACUNA - costo;
    }

}
