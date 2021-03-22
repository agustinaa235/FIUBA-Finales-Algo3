import org.junit.Test;
import transportes.Moto;

import static junit.framework.TestCase.assertEquals;

public class MotoTest {

    @Test

    public void testUnaMotoSinTelepaseSuPejaeEsElCorrecto(){
        Moto moto = new Moto();
        assertEquals(4, moto.pagarPeaje(2));
    }
}
