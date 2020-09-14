package modelo;

public class CercoElectrico implements Artefacto {

    private int metros;
    private int precioKw;
    public CercoElectrico(int metros, int preciokw) {
        super();
        this.metros = metros;
        this.precioKw = preciokw;
    }

    @Override
    public int getConsumo() {
        return metros * precioKw;
    }
}
