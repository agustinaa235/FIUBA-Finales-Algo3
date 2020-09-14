package modelo;

public class LosaRadiante implements Artefacto {

    private int metros;
    private int precioKw;

    public LosaRadiante(int metros, int preciokw) {
        super();
        this.metros = metros;
        this.precioKw = preciokw;
    }

    @Override
    public int getConsumo() {
        return precioKw * metros * metros;
    }
}
