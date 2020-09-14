package algoiii.formasDePago;

import algoiii.formasDePago.MetodoDeCobro;

public class Dollar implements MetodoDeCobro {
    private static int COTIZACIONDOLLAR = 50;

    @Override
    public double precioTotal(int precio, int costo) {
        return (precio*COTIZACIONDOLLAR - costo);
    }
}
