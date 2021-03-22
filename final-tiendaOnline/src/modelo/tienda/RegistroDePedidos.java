package modelo.tienda;

import modelo.excepciones.NoHayStockError;
import modelo.excepciones.NoTenemosEseProducto;

import java.util.Map;

public class RegistroDePedidos {

    public static void realizarPedido(Pedido pedido, String nombreProducto, int cantidad, Map<String, Iprecio> productos) {

        Iprecio unProducto = productos.get(nombreProducto);
        verificarPedido(unProducto,cantidad);
        unProducto.cantidadPedida(cantidad);
        pedido.agregarProducto(unProducto);

    }

    private static void verificarPedido(Iprecio unProducto, int cantidad) {
        if(unProducto==null){
            throw new NoTenemosEseProducto();
        }
        if(unProducto.stock()<cantidad){
            throw new NoHayStockError();
        }
    }

}
