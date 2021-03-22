package casas;

import personajes.Hacha;
import personajes.Herramienta;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public abstract class CasaDelChanchito {
	
	protected EstadoCasa estadoCasa = new Habiltable();

	public abstract void serAtacadaCon(Pulmones pulmones);

	public abstract void serAtacadaCon(Hacha hacha);

	public boolean estaDestruida() {
		return estadoCasa.estaDestruida();
	}

	public abstract void serAtacadaCon(TaladroRotopercutor taladroRotopercutor);
}
