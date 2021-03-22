package modelo;

import modelo.superficie.Barro;
import modelo.superficie.Hielo;
import modelo.superficie.PistaAtletismo;
import org.junit.Test;
import personajes.Pinguino;

import static junit.framework.TestCase.assertEquals;

public class PinguinoTest {

    @Test
    public void testPingunoNoPuedeCorrerSobreLaPista() {
        Pinguino pinguno = new Pinguino();
        PistaAtletismo pista = new PistaAtletismo();
        assertEquals(0,pinguno.correr(pista));
    }

    @Test
    public void testPingunoNNoPuedeCorrerSobreElBarro() {
        Pinguino pinguno = new Pinguino();
        Barro barro = new Barro();
        assertEquals(0,pinguno.correr(barro));
    }

    @Test
    public void testPingunoCorreLaCantidadCCorrectaEnElHielo() {
        Pinguino pinguno = new Pinguino();
        Hielo hielo = new Hielo();
        assertEquals(5,pinguno.correr(hielo));
    }

    @Test
    public void testPingunoNadaLaCanctatidadCorrectaEnElAgua() {
        Pinguino pinguno =  new Pinguino();
        assertEquals(20, pinguno.nadar());
    }

}
