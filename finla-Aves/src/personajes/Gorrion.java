package personajes;

import modelo.habilidades.Cantante;
import modelo.habilidades.Volador;

public class Gorrion implements Volador, Cantante {

	@Override
	public String cantar() {
		return "pio pio";
	}

	@Override
	public int volar() {
		return 50;
	}


}
