package algoiii.promos;

import algoiii.formasDePago.MetodoDeCobro;
import algoiii.productos.Productos;

import java.util.List;

public class DosPorUno  implements Productos {
    private List<Productos> productos;

    public DosPorUno(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public void setCosto(int precio) throws Exception {
        throw new Exception();
    }

    @Override
    public int getCosto() {
        int result = 0;

        for (Productos producto: productos) {
            result += producto.getCosto();
        }

        return result;
    }

    @Override
    public double setPrecio(int precio, MetodoDeCobro unMetodoDeCobro) {


        return (unMetodoDeCobro.precioTotal(precio,getCosto()));
    }
/*
    private double valorCotizacion(int i, Moneda dollars) {
        if (dollars == Moneda.DOLLARS) {
            return i * 50;
        }

        return i;
    }

 */
}
