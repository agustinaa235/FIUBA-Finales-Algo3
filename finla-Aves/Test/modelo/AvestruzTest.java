package modelo;

import modelo.superficie.Barro;
import modelo.superficie.Hielo;
import modelo.superficie.PistaAtletismo;
import org.junit.Test;
import personajes.Avestruz;

import static junit.framework.TestCase.assertEquals;

public class AvestruzTest {

    @Test
    public void AveztruzCorreLaCantidadAdecuandoEnPistaDeAtlestimo() {
        Avestruz avestruz = new Avestruz();
        PistaAtletismo pista = new PistaAtletismo();
        assertEquals(70,avestruz.correr(pista));

    }

    @Test
    public void AvetruzCorreLaCantidaddecuadaEnBarro() {
        Avestruz avestruz = new Avestruz();
        Barro pista = new Barro();
        assertEquals(70,avestruz.correr(pista));
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        Avestruz avestruz = new Avestruz();
        Hielo hielo = new Hielo();
        assertEquals(0,avestruz.correr(hielo));
    }



}
