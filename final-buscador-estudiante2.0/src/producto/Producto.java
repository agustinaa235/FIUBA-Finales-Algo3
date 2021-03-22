package producto;

import exactitudCategoria.ExactitudCategoria;
import exactitudNombre.ExactitudNombre;

public class Producto implements IProducto {

    private String nombre;
    private float precio;
    private String categoria;

    public Producto(String nombre, float precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }


    @Override
    public boolean cumpleCategoria(String categoriaBuscada, ExactitudCategoria exactitud) {
        return exactitud.cumple(this.categoria, categoriaBuscada);
    }

    @Override
    public boolean cumpleNombre(String nombreBuscado, ExactitudNombre exactitud) {
        return exactitud.cumple(this.nombre, nombreBuscado);
    }

    @Override
    public boolean cumplePrecio(int precioMin, int precioMax) {
        return ((precio >= precioMin && precio <= precioMax));
    }
}


