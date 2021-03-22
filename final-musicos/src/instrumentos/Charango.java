package instrumentos;

public class Charango implements InstrumentoMadera, InstrumentoPlastico{

	private int decibeles;
	public Charango(){
		this.decibeles = 10;
	}

	@Override
	public int tocarDeMadera(int coeficienteMadera) {
		return coeficienteMadera*decibeles;
	}

	@Override
	public int tocarDePlastico(int coeficientePlastico){
		return (decibeles - coeficientePlastico);
	}
}
