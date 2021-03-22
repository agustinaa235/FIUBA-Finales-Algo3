import celda.Celda;
import estadoCelda.Contabilizada;
import excepciones.LetraSePasaDelLargoPermitido;
import excepciones.PesoMenorQueCeroError;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CeldaTest {

    @Test
    public void testEnUnaCeldaConUnaLetraEnVocalSuPrecioSeDuplica(){
        Celda celda = new Celda();
        celda.setLetra("E", 3);
        assertEquals(6,celda.calcularPesoLetra());
    }
    @Test
    public void testEnUnaCeldaYaContabilizadSuPesoEsCero(){
        Celda celda = new Celda();
        celda.setLetra("P", 3);
        celda.actualizarEstado(new Contabilizada());
        assertEquals(0,celda.calcularPesoLetra());
    }
    @Test
    public void testEnunaCeldaSeLeSeteaUnaLetraConPesoNegativoEntoncesSeLanzaUnaExcepcion(){
        Celda celda = new Celda();
        assertThrows(PesoMenorQueCeroError.class, () -> {
            celda.setLetra("W", -2);
        });

    }
    @Test
    public void testEnunaCelaSeLeSeteaUnaLetraConlargoMayorA2EntonceSelanzaUnaExcepcion(){

        Celda celda = new Celda();
        assertThrows(LetraSePasaDelLargoPermitido.class, () -> {
            celda.setLetra("AA", 3);
        });
    }
}
