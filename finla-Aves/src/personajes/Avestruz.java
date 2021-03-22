package personajes;

import modelo.superficie.Superficie;
import modelo.habilidades.Corredor;

public class Avestruz implements Corredor {


	private static final  int COEFICIENTE_PISTA_ATLETISMO = 70;
	private static final  int COEFICIENTE_BARRO = 70;
	private static final  int COEFICIENTE_HIELO = 0;

	@Override
	public int correr(Superficie superficie) {

		return superficie.correr(this);

	}

	@Override
	public int getCoeficientePista() {
		return COEFICIENTE_PISTA_ATLETISMO;
	}

	@Override
	public int getCoeficienteHielo() {
		return COEFICIENTE_HIELO;
	}

	@Override
	public int getCoeficienteBarro() {
		return COEFICIENTE_BARRO;
	}

}
