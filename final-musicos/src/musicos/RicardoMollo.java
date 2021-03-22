package musicos;

import instrumentos.GuitarraCriolla;
import instrumentos.InstrumentoMadera;
import instrumentos.InstrumentoPlastico;

public class RicardoMollo implements MusicoPlastico, MusicoMadera{
	private static final int COEFICIENTE_PLASTICO = 3;
	private static final int COEFICIENTE_MADERA = 1;

	@Override
	public int tocarInstrumentoPlastico(InstrumentoPlastico unInstrumento) {
		return unInstrumento.tocarDePlastico(COEFICIENTE_PLASTICO);
	}
	@Override
	public int tocarInstrumentoMadera(InstrumentoMadera unInstrumento){
		return unInstrumento.tocarDeMadera(COEFICIENTE_MADERA);
	}
	/*
	public int tocar(Object i){
		try {
			GuitarraCriolla g = (GuitarraCriolla) i;
			
			if (g.material == "Madera"){
				return g.decibeles;
			}
		
			if (g.material == "Plastico"){
				return g.decibeles  - 3;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}*/
}
