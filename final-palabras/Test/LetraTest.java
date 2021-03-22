import letra.Letra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LetraTest {

    @Test
    public void testEnUnaLetraCuyoContenidoEsUnaVocalSeDuplicaSuPeso(){

        Letra letra = new Letra("A", 2);
        assertEquals(4, letra.calularPeso());
    }
    @Test
    public void testEnunaLetraCuyoPesoEsCeroEntoncesSuPesoEsCero(){

        Letra letra = new Letra("M", 0);
        assertEquals(0, letra.calularPeso());

    }
}
