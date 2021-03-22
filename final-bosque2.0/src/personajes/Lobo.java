package personajes;

import casas.CasaDelChanchito;

public class Lobo {

	private Herramienta herramienta;
	
	public Lobo(){
		this.herramienta = new Pulmones() ;
	}
	
	public void cambiarHerramienta(	Herramienta herramienta){
		this.herramienta = herramienta;
	}

	public void atacarCasaChanchito(CasaDelChanchito casa) {

		herramienta.atacarCasa(casa);

	}
}
