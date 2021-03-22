package modelo.naveEspacial;

import modelo.Excepciones.NoPuedeSeguirAtacandoVidaCeroError;
import modelo.camuflaje.Camuflaje;
import modelo.camuflaje.ConCamuflaje;
import modelo.camuflaje.SinCamuflaje;
import modelo.estadoCamuflaje.CamuflajeDesactivdado;
import modelo.estadoCamuflaje.EstadoCamuflaje;

public class NaveEspacial {

	private int vida;
	private Canion canion;
	private Propulsor propulsor;
	private Camuflaje camuflaje;
	private EstadoCamuflaje estadoCamuflaje;

	public NaveEspacial(){
		this.camuflaje = new SinCamuflaje();
		this.vida = 100;
		this.canion = new Canion();
		this.propulsor = new Propulsor();
	}
	public void obtenerCamuflaje(){
		this.camuflaje = new ConCamuflaje();
	}
	public void activarCamuflaje(){

		this.estadoCamuflaje = camuflaje.activacionDeCamuflaje();

	}
	
	public void desactivarCamuflaje(){
		this.estadoCamuflaje = new CamuflajeDesactivdado();
	}

	
	public void atacar(NaveEspacial naveEnemiga){
		if(vida<=0){
			throw new NoPuedeSeguirAtacandoVidaCeroError();
		}
		canion.atacarA(naveEnemiga);
	}
	
	public int moverse() {

		return propulsor.moverse();
	}

	public void serAtacadaConDanio(int danio) {
		camuflaje.serAtacadaCon(estadoCamuflaje, this, danio);
	}

	public void actualizarVida(int danio) {

		this.vida -= danio;
	}

	public int vida() {
		return vida;
	}
}
