package modelo.tienda;

import modelo.cupones.Cupon;
import modelo.cupones.SinCupon;
import modelo.envio.Envio;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Iprecio> productos = new ArrayList<Iprecio>();
    private Envio envio;
    private Cupon cupon = new SinCupon();

    public void agregarProducto(Iprecio unProducto) {

        this.productos.add(unProducto);

    }

    public void agregarEnvio(Envio envio) {
        this.envio = envio;
    }

    public void agregarCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public double calcularPrecio() {
        Double total = 0.0;
        for(Iprecio producto: productos){
            total += producto.calcularPrecio();
        }
        return cupon.precioTotal(total, envio);

    }
}
