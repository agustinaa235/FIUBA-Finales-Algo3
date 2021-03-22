package modelo;

import main.java.ar.uba.fi.algo3.modelo.deudor.Alumno;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AlumnoTest {

    @Test
    public void unAlumnoPagaCuotaCompleta()
    {
        Alumno gabi = new Alumno("gabi");

        assertEquals(100, gabi.pagarDeuda());
    }

}
