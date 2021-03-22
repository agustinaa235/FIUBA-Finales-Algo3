import celda.Celda;
import org.junit.Test;
import palabra.Palabra;

import static junit.framework.TestCase.assertEquals;

public class PalabraTest {

    @Test
    public void testEnUnaPalabraConDosCeldasIgualesQueCotieneUnaVocalEntoncesSoloSeContabilizaUna(){

        Palabra palabra = new Palabra();
        Celda unaCelda = new Celda();
        unaCelda.setLetra("A", 2);
        palabra.agregarCelda(unaCelda);
        palabra.agregarCelda(unaCelda);
        assertEquals(4, palabra.puntaje());
    }
    @Test
    public void testEnunaPalabraSinCeldasEntoncesElPuntajeTotalEsCero(){
        Palabra palabra= new Palabra();
        assertEquals(0, palabra.puntaje());
    }

    @Test
    public void testEnUnaPalabraConVariasCeldasDistintasEntoncesSeSumaElPesoDeTodas(){
        Palabra palabra = new Palabra();
        Celda celda1 = new Celda();
        Celda celda2 = new Celda();
        Celda celda3 = new Celda();
        Celda celda4 =  new Celda();

        celda1.setLetra("A", 2);
        celda2.setLetra("G", 6);
        celda3.setLetra("U", 3);
        celda4.setLetra("S", 4);
        palabra.agregarCelda(celda1);
        palabra.agregarCelda(celda2);
        palabra.agregarCelda(celda3);
        palabra.agregarCelda(celda4);

        assertEquals(20, palabra.puntaje());
    }
}
