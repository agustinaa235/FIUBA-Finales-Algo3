package musicos;

import instrumentos.*;

public class LucianoPereyra implements MusicoMadera, MusicoPlastico{

	private static final int COEFICIENTE_MADERA = 2;
	private static final int COEFICIENTE_PLASTICO = 0;

	public int tocarInstrumentoMadera(InstrumentoMadera unInstrumento){
		return unInstrumento.tocarDeMadera(COEFICIENTE_MADERA);
	}
	public int tocarInstrumentoPlastico(InstrumentoPlastico unInstrumento){
		return unInstrumento.tocarDePlastico(COEFICIENTE_PLASTICO);
	}

	/*
	public int tocar(Object i){
		try {
			Charango c = (Charango) i;
			
			if (c.material == "Madera"){
				return c.decibeles * 2;
			}
		
			if (c.material == "Plastico"){
				return c.decibeles;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}*/
}
