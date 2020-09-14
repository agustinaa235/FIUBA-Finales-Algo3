package modelo;

public abstract class Madera {
    protected int precio;
    protected int kilos;

    public void agregarKilos(int kilos) {
        this.kilos += kilos;
    }

    public abstract int gastoDeMadera(int metros);
}
