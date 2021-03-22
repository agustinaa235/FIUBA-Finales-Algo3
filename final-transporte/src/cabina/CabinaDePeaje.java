package cabina;

import transportes.Transporte;

public class CabinaDePeaje {

	private int PRECIO_POR_RUEDA = 2;

	public int cobrarPeaje(Transporte transporte) {

		return transporte.pagarPeaje(PRECIO_POR_RUEDA);

	}
}
