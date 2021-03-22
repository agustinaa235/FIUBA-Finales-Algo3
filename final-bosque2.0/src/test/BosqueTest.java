package test;

import static org.junit.Assert.*;

import org.junit.Test;

import personajes.*;

public class BosqueTest {


	@Test

	public void testLaCasaDEChanchitosDePajaCuandoElLoboNoAtacaEntoncesNoEstaDEstruida(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);

		assertFalse(bosque.casaDestruida());
	}

	@Test

	public void testLaCasaDeChanchitosDePajaCunadoElLoboAtacaConPulmonesEntoncesSeDestruye(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);

		bosque.loboAtacarCasaDelChanchito();

		assertTrue(bosque.casaDestruida());
	}

	@Test

	public void testLosChanchitosImigarnALaCasaDeMaderaCuandoElLoboIntentaAtacarConPulmonesEntoncesNoSeDestruye(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.chanchitoHuirHaciaUnaCasaDeMadera();
		bosque.loboAtacarCasaDelChanchito();

		assertFalse(bosque.casaDestruida());
	}

	@Test

	public void testLosChanchitosHUyenALaCasaDEMaderaCuandoElLoboAtacaConElHachaEntoncesLaCasaSeDestruye(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.chanchitoHuirHaciaUnaCasaDeMadera();
		lobo.cambiarHerramienta(new Hacha());
		bosque.loboAtacarCasaDelChanchito();

		assertTrue(bosque.casaDestruida());
	}

	@Test

	public void testLosChanchitosImigranALaCasaDeCementoCuandoElLoboAtacaConSusPulmonesEntoncesLaCasaNoSeDestruye(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.chanchitoHuirHaciaUnaCasaDeCemento();
		lobo.cambiarHerramienta(new Pulmones());
		bosque.loboAtacarCasaDelChanchito();

		assertFalse(bosque.casaDestruida());
	}

	@Test

	public void testLosChanchitosImigranALaCasaDECementoCuandoElLOboAtacaConElHachaEntoncesLaCasaNoSEDEstruye(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.chanchitoHuirHaciaUnaCasaDeCemento();
		lobo.cambiarHerramienta(new Hacha());
		bosque.loboAtacarCasaDelChanchito();

		assertFalse(bosque.casaDestruida());
	}

	@Test

	public void testLosChanchitosHuyenALaCasaDeCementoCuandoElLoboAtacaConElTaladroRotopercutorEntoncesLaCasaSeDestruye(){
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo);
		bosque.chanchitoHuirHaciaUnaCasaDeCemento();
		lobo.cambiarHerramienta(new TaladroRotopercutor());
		bosque.loboAtacarCasaDelChanchito();

		assertTrue(bosque.casaDestruida());
	}

}
