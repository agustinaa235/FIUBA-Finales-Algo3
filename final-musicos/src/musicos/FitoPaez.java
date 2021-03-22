package musicos;

import instrumentos.InstrumentoMadera;
import instrumentos.InstrumentoPlastico;
import instrumentos.Piano;

public class FitoPaez implements MusicoPlastico, MusicoMadera{

	private static final int COEFICIENTE_PLASTICO = 5;
	private static final int COEFICIENTE_MADERA = 3;
/*
	public int tocar(Object i){
		try {
			Piano p = (Piano) i;
			
			if (p.material == "Madera"){
				return p.decibeles  * 3;
			}
		
			if (p.material == "Plastico"){
				return p.decibeles  - 5;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}*/

	@Override
	public int tocarInstrumentoMadera(InstrumentoMadera unInstrumento) {
		return unInstrumento.tocarDeMadera(COEFICIENTE_MADERA);
	}

	@Override
	public int tocarInstrumentoPlastico(InstrumentoPlastico unInstrumento) {
		return unInstrumento.tocarDePlastico(COEFICIENTE_PLASTICO);
	}
}
