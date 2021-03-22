package comensales;

import comidas.Comida;

public class Persona {
	
	private int calorias;
	//boolean celiaca;
	private Caracteristicas caracteristica;
	
	public Persona(Caracteristicas unaCaracteristica){
		this.calorias = 0;
		this.caracteristica = unaCaracteristica;
	}

	public void comer(Comida unaComida){

		caracteristica.comer(unaComida, this);

	}

	public int getCalorias() {
		return calorias;
	}

	public void sumarCalorias(int caloriasComida) {
		calorias += caloriasComida;
	}
}
