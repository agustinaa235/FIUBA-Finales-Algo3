package instrumentos;

public class Piano implements InstrumentoMadera{
	
	private int decibeles;

	public Piano(){
		this.decibeles = 50;
	}


	@Override
	public int tocarDeMadera(int coeficienteMadera) {
		return coeficienteMadera*decibeles;
	}
}
