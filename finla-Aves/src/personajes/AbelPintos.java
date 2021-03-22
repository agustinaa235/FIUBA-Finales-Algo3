package personajes;

import modelo.superficie.Superficie;
import modelo.habilidades.*;

public class AbelPintos implements Corredor,Cantante {
	private static final  int COEFICIENTE_PISTA_ATLETISMO = 15;
	private static final  int COEFICIENTE_BARRO = 2;
	private static final  int COEFICIENTE_HIELO = 0;

	@Override
	public String cantar() {
		return "vas a entrar sin pedirme la llave...";
	}


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
