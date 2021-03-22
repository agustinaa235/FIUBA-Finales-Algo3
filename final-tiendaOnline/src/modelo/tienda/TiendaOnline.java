package modelo.tienda;

import modelo.cupones.Cupon;
import modelo.envio.Envio;

import java.util.HashMap;
import java.util.Map;

public class TiendaOnline {

    private String nombre;

    private Map<String, Iprecio> precios = new HashMap<String, Iprecio>();
    private RegistroDePedidos registro = new RegistroDePedidos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(Map<String, Iprecio> precios){
        this.precios = precios;
    }

    public void agregarCuponDeDescuento(Cupon cupon, Pedido pedido){
        pedido.agregarCupon(cupon);
    }

    public void agregarEnvio(Envio envio, Pedido pedido) {
        pedido.agregarEnvio(envio);

    }

    public double cobrarPedido(Pedido unPedido) {

        return unPedido.calcularPrecio();

    }

    public void realizarPedidoConProducto(Pedido pedido, String producto, int cantidad) {
        RegistroDePedidos.realizarPedido(pedido, producto, cantidad, precios);

    }
}
