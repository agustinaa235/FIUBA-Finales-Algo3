package modelo.naveEspacial;

import modelo.Excepciones.FaltaDeCombustibleError;

public class Propulsor {

	private static final int UNIDAD = 1;
	private int nivelDeCombustible;
	private int coeficienteDeDesplazamiento;
	
	public Propulsor(){
		this.nivelDeCombustible = 100;
		this.coeficienteDeDesplazamiento = 10;
	}


	public int moverse() {
		if(nivelDeCombustible<=0){
			throw new FaltaDeCombustibleError();
		}
		int distancia = UNIDAD*coeficienteDeDesplazamiento;
		this.modificarCombustible(distancia);
		return distancia;
	}

	public void modificarCombustible(int distancia) {
		this.nivelDeCombustible -=distancia;
	}
}
