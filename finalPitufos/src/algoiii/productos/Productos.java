package algoiii.productos;

import algoiii.formasDePago.MetodoDeCobro;

public interface Productos {
    void setCosto(int costo) throws Exception;

    int getCosto();

    double setPrecio(int precio, MetodoDeCobro unMetodoDeCobro);
}