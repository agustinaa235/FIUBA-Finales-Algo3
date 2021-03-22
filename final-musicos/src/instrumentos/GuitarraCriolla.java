package instrumentos;

public class GuitarraCriolla implements InstrumentoMadera, InstrumentoPlastico{

	private int decibeles;
	public GuitarraCriolla(){
		this.decibeles = 20;
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
