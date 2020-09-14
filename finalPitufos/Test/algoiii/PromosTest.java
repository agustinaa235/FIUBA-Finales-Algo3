package algoiii;

import algoiii.formasDePago.Pesos;
import algoiii.productos.Gaseosa;
import algoiii.promos.DosPorUno;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class PromosTest {
    @Test
    public void test02ElPrecioDeDosGaseosasConUnComboDeDosPorUnoYMOnedaPesosEsCorrecto() {
        Gaseosa gaseosa01 = new Gaseosa();
        Gaseosa gaseosa02 = new Gaseosa();
        DosPorUno combo = new DosPorUno(Arrays.asList(gaseosa01, gaseosa02));

        // combo.setCosto(200);
        gaseosa01.setCosto(100);
        gaseosa02.setCosto(100);

        double renta = combo.setPrecio(1200, new Pesos());

        assertEquals(1000.0, renta);
    }
}
