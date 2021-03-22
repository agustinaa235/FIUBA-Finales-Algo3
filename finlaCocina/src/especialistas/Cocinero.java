package especialistas;

import comidas.*;

import java.util.HashMap;

public class Cocinero {

	private HashMap<String,Comida> comidas= new HashMap<String, Comida>();

	public Comida hacerComida(String unaComida) {

		return comidas.get(unaComida);
	}


	public void puedePreparar(String unaComida, Comida comida) {
		comidas.put(unaComida, comida);
	}
}
