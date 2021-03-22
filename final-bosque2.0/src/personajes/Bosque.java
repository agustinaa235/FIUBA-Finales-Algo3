package personajes;

import casas.CasaDelChanchito;
import casas.CasaDelChanchitoDeCemento;
import casas.CasaDelChanchitoDeMadera;
import casas.CasaDelChanchitoDePaja;

public class Bosque {
	
	private Lobo loboFeroz;
	private Chanchito chanchito;

	public Bosque(Lobo unLobo){

		this.loboFeroz = unLobo;
		this.chanchito = new Chanchito();
	}
	
	public void loboAtacarCasaDelChanchito(){
		chanchito.serAtacadoPor(loboFeroz);

		
	}

	public void chanchitoHuirHaciaUnaCasaDeMadera(){
		this.chanchito.huirACasaDeMadera();
	}

	public void chanchitoHuirHaciaUnaCasaDeCemento(){
		this.chanchito.huirACasaDeCemento();
	}

	public boolean casaDestruida(){
		return this.chanchito.casaSeEncuentraDestruida();
	}

}
