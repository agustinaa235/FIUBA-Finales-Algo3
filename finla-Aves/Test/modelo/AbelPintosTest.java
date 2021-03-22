package modelo;

import junit.framework.TestCase;
import modelo.superficie.Barro;
import modelo.superficie.Hielo;
import modelo.superficie.PistaAtletismo;
import modelo.superficie.Superficie;
import org.junit.Test;
import personajes.AbelPintos;

public class AbelPintosTest {

    @Test
    public void testCorreSobreBarro() {
        AbelPintos abelPintos = new AbelPintos();
        Superficie barro = new Barro();

        TestCase.assertEquals(2, abelPintos.correr(barro));
    }

    @Test
    public void testCorreSobreHielo() {
        AbelPintos abelPintos = new AbelPintos();
        Superficie hielo = new Hielo();

        TestCase.assertEquals(0, abelPintos.correr(hielo));
    }

    @Test
    public void testCorreSobrePistaDeAtletismo() {
        AbelPintos abelPintos = new AbelPintos();
        Superficie pistaDeAtletismo = new PistaAtletismo();

        TestCase.assertEquals(15, abelPintos.correr(pistaDeAtletismo));
    }


    @Test
    public void testCanto() {
        AbelPintos abelPintos = new AbelPintos();

        TestCase.assertEquals( "vas a entrar sin pedirme la llave...", abelPintos.cantar());
    }

}
