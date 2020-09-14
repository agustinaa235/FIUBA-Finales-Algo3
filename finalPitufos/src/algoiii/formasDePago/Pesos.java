package algoiii.formasDePago;

import algoiii.formasDePago.MetodoDeCobro;

public class Pesos implements MetodoDeCobro {


    @Override
    public double precioTotal(int precio, int costo) {
        return (precio - costo);
    }
}
