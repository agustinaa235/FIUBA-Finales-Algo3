package modelo.tienda;

public class Producto implements Iprecio{

    private double precio;
    private double stock;
    private int cantidad;
    public Producto(double precio, double stock){
        this.precio = precio;
        this.stock = stock;
    }


    public double stock() {
        return stock;
    }

    public Double calcularPrecio() {
        stock = stock - cantidad;
        return precio*cantidad;

    }

    @Override
    public void cantidadPedida(int cantidad) {
        this.cantidad = cantidad;
    }
}
