import org.junit.Test;
import transportes.Auto;

import static junit.framework.TestCase.assertEquals;

public class AutoTest {

    @Test
    public void testUnAutoSinTelepaseSuPeajeEsCorrecto(){
        Auto auto = new Auto();
        assertEquals(8, auto.pagarPeaje(2));

    }
    @Test
    public void testUnAutoConTelepaseSuPeajeEsCorrecto(){

        Auto auto = new Auto();
        auto.registrarTelepase();
        assertEquals(4, auto.pagarPeaje(2));
    }

}
