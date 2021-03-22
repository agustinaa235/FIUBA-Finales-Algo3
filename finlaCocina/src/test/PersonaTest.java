package test;

import comensales.Celiaca;
import comensales.Hipertenso;
import comensales.SinEspecificaciones;
import comensales.Persona;
import comidas.Comida;
import especialistas.*;
import org.junit.Assert;

public class PersonaTest {

	@org.junit.Test
	public void personaNoCeliacaComeCosasParaNoCeliacosEstaTodoBien() {

		Persona personaNoCeliaca = new Persona(new SinEspecificaciones());
		Assert.assertEquals(personaNoCeliaca.getCalorias(),0);
		
		Cocinero panadero =  FabricaDeCocineros.CrearPanaderoQueCocinaConGluten();
		Comida pan = panadero.hacerComida("pan");
		personaNoCeliaca.comer(pan);
		Assert.assertEquals(personaNoCeliaca.getCalorias(),10);
		
		Cocinero empandero = FabricaDeCocineros.CrearEmpanadorQueCocinaConGluten();
		Comida empanada = empandero.hacerComida("empanada");
		personaNoCeliaca.comer(empanada);
		Assert.assertEquals(personaNoCeliaca.getCalorias(),25);
	}

	@org.junit.Test
	public void personaCeliacaComeCosasParaCeliacosEstaTodoBien() {
		
		Persona celiaco = new Persona(new Celiaca());
		Assert.assertEquals(celiaco.getCalorias(),0);
		
		Cocinero panaderoCeliaco =  FabricaDeCocineros.CrearPanaderoQueCocinaSinGluten();
		Comida pan = panaderoCeliaco.hacerComida("pan");
		celiaco.comer(pan);
		Assert.assertEquals(celiaco.getCalorias(),10);
		
		Cocinero empanderoCeliaco = FabricaDeCocineros.CrearEmpanadorQueCocinaSinGluten();
		Comida empanada = empanderoCeliaco.hacerComida("empanada");
		celiaco.comer(empanada);
		Assert.assertEquals(celiaco.getCalorias(),25);
	}

	@org.junit.Test
	public void personaHipertensaComeCosasParaHipertensosYEstaTodoBien(){
		Persona hipertenso = new Persona(new Hipertenso());
		Cocinero panaderoParaHipertensos = FabricaDeCocineros.CrearUnMasterChef();
		Comida pan = panaderoParaHipertensos.hacerComida("panSS");
		hipertenso.comer(pan);

		Assert.assertEquals(hipertenso.getCalorias(),9);

	}


}
