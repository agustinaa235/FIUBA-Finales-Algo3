package modelo.inversiones;

import modelo.inversiones.TipoDeInversion;
import modelo.inversionistas.Inversionista;

public class Inversion {

	private TipoDeInversion tipoDeInversion;


	public Inversion(TipoDeInversion unTipo){
		this.tipoDeInversion = unTipo;
	}
	
	public int calcularPlata(int monto, Inversionista inversionista) {

		return inversionista.calcularInversion(monto, this.tipoDeInversion);

	}
	
}
