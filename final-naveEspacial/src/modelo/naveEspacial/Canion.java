package modelo.naveEspacial;

public class Canion {

	int danio = 25;

	public void atacarA(NaveEspacial naveEnemiga) {
		naveEnemiga.serAtacadaConDanio(this.danio);
	}
}
