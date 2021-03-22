package modelo;

import main.java.ar.uba.fi.algo3.modelo.deudor.Alumno;
import main.java.ar.uba.fi.algo3.modelo.deudor.Familia;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FamiliaTest {

    @Test
    public void unaFamiliaDe3HermanosSuDEudaEsCorrecta(){
        Familia gomez = new Familia("Gomez");
        gomez.agregarMiembro(new Alumno("gabi"));
        gomez.agregarMiembro(new Alumno("rupert"));
        gomez.agregarMiembro(new Alumno("shisus"));

        assertEquals(200.0, gomez.pagarDeuda());

    }
    @Test
    public void unaFamiliaDE2HermanosSuDeudaEsCorrecta(){

        Familia perez = new Familia("Perez");
        perez.agregarMiembro(new Alumno("ramiro"));
        perez.agregarMiembro(new Alumno("ramiro"));
        assertEquals(175.0, perez.pagarDeuda());
    }
    @Test
    public void unaFamiliaDe1HermanoSuDeudaEsCorrecta(){
        Familia perez = new Familia("Perez");
        perez.agregarMiembro(new Alumno("ramiro"));
        assertEquals(100.0, perez.pagarDeuda());
    }
}
