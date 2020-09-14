package modelo;

public class EstufaDeBanio implements Artefacto {

    private int ambientes;
    private int calorias;
    private int precioKw;

    public EstufaDeBanio(int ambientes, int preciokw, int calorias){

        this.ambientes = ambientes;
        this.precioKw = preciokw;
        this.calorias = calorias;

    }

    @Override
    public int getConsumo() {
        return ambientes * precioKw * calorias;
    }
}
