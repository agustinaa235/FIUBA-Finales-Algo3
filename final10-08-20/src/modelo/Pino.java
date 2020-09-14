package modelo;

public class Pino extends Madera {
    private int calorico;
    public Pino(int precio, int calorico) {
        this.precio = precio;
        this.calorico = calorico;
    }

    @Override
    public int gastoDeMadera(int metros) {
        return (metros*kilos*precio)/(calorico);
    }
}
