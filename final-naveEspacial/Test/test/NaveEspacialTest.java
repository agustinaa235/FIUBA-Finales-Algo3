package test;

import modelo.Excepciones.FaltaDeCombustibleError;
import modelo.Excepciones.NoPuedeSeguirAtacandoVidaCeroError;
import modelo.naveEspacial.NaveEspacial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NaveEspacialTest {
	
	@Test
	public void naveEspacialEmpiezaCon100DeVida() {
		
		// 1. A
		boolean conCamuflaje = false;
		NaveEspacial nave = new NaveEspacial();

		// 2. A

		// 3. A
		Assert.assertEquals(100, nave.vida());
	}
	

	@Test
	public void naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {
		
		// 1. A
		NaveEspacial nave = new NaveEspacial();
		NaveEspacial naveEnemiga = new NaveEspacial();

		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(75, naveEnemiga.vida());
	}
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeInactivoProduciria25DeDanio() {
		
		// 1. A

		NaveEspacial nave = new NaveEspacial();

		NaveEspacial naveEnemiga = new NaveEspacial();
		naveEnemiga.obtenerCamuflaje();
		naveEnemiga.desactivarCamuflaje();

		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(75, naveEnemiga.vida());
	}
	
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial();
		boolean conCamuflaje = true;
		NaveEspacial naveEnemiga = new NaveEspacial();
		naveEnemiga.obtenerCamuflaje();
		naveEnemiga.activarCamuflaje();
		
		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(100, naveEnemiga.vida());
	}
	
	@Test
	public void naveEspacialSeDesplaza10UnidadesPorTurno() {
		
		// 1. A
		NaveEspacial nave = new NaveEspacial();

		
		// 2. A
		int unidadesDesplazadas = nave.moverse();
		
		
		// 3. A
		Assert.assertEquals(10, unidadesDesplazadas);
	}
	@Test
	public void naveEspacialSeDesplaza100UnidadesEn1oTurnosYEnElOnceavoNoPuedePorqueSeQuedoSinCombustibleEntoncesLanzaExcepcion(){

		NaveEspacial nave = new NaveEspacial();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		nave.moverse();
		assertThrows(FaltaDeCombustibleError.class, () -> {
			nave.moverse();
		});

	}
	@Test
	public void testEnUnaNaveEspacialCuandoSeLeCabaLavidaNoPuedeSeguirAtacandoEntoncesLanzaUnaExcepcion(){

		NaveEspacial nave = new NaveEspacial();
		nave.actualizarVida(150);
		NaveEspacial naveEnemiga = new NaveEspacial();
		assertThrows(NoPuedeSeguirAtacandoVidaCeroError.class, () -> {
			nave.atacar(naveEnemiga);
		});
	}



}
