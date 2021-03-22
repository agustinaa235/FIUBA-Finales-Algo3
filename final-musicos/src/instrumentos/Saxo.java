package instrumentos;

public class Saxo implements InstrumentoMetal{
    private int decibeles;
    public Saxo(){
        this.decibeles = 30;
    }
    @Override
    public int tocarConMetal(int coeficienteMetal) {
        return coeficienteMetal*decibeles;
    }
}
