package modelo;

public class Quebracho extends Madera{
    private int pureza;
    public Quebracho(int precio, int pureza) {
        this.precio = precio;
        this.pureza = pureza;


    }

    @Override
    public int gastoDeMadera(int metros) {
        return metros*kilos*pureza*precio;
    }

}
