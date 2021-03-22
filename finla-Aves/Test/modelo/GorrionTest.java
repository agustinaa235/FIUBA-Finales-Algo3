package modelo;

import org.junit.Test;
import personajes.Gorrion;

import static junit.framework.TestCase.assertEquals;

public class GorrionTest {

    @Test
    public void gorrionPuedeVolar() {
        Gorrion gorrion= new Gorrion();
        assertEquals(50,gorrion.volar());
    }

    @Test
    public void gorrionPuedeCantar() {
        Gorrion gorrion = new Gorrion();
        assertEquals("pio pio", gorrion.cantar());
    }


}
