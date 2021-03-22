import org.junit.Test;
import transportes.BichoRaro;

import static junit.framework.TestCase.assertEquals;

public class BichoRaroTest {

    @Test
    public void testUnBichoRaroSinTelepaseSuPeajeEsCorrecto(){
        BichoRaro bicho = new BichoRaro();
        assertEquals(6, bicho.pagarPeaje(2));
    }

    @Test
    public void testUnBichoRaroConTelePaseSuPeajeEsCorrecto(){
        BichoRaro bichoRaro = new BichoRaro();
        bichoRaro.registrarTelepase();
        assertEquals(15, bichoRaro.pagarPeaje(2));
    }
}
