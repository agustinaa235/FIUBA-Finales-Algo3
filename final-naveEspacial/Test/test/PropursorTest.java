package test;

import modelo.Excepciones.FaltaDeCombustibleError;
import modelo.naveEspacial.Propulsor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PropursorTest {

    @Test
    public void testElPropusorSeMueveEn3TernosEntoncesLaDistanciaEsCorrecta(){
        Propulsor propulsor = new Propulsor();
        int distancia = propulsor.moverse();
        distancia += propulsor.moverse();
        distancia += propulsor.moverse();
        assertEquals(30, distancia);
    }

    @Test
    public void testElPropulsorSeMovioUnaDistancaMayorA100EntoncesNoSEPuedeVolverAMover(){

        Propulsor propulsor = new Propulsor();
        propulsor.modificarCombustible(120);
        assertThrows(FaltaDeCombustibleError.class, () -> {
            propulsor.moverse();
        });
    }
}
