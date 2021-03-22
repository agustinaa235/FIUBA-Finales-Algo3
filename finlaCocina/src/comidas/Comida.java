package comidas;

public class Comida {
    private int calorias = 0;
    private Estado estado;

    public Comida(int calorias, Estado estado){
        this.calorias = calorias;
        this.estado = estado;
    }

    public boolean poseeGluten() {
        return estado.esConGluten();
    }

    public int getCalorias() {
        return calorias;
    }
}
