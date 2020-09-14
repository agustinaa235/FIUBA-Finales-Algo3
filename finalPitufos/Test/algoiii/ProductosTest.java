package algoiii;

import algoiii.formasDePago.Dollar;
import algoiii.formasDePago.Pesos;
import algoiii.formasDePago.Vaca;
import algoiii.productos.Alfajor;
import algoiii.productos.Gaseosa;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProductosTest {
    @Test
    public void test01ElPrecioDeUnaCageosaConMonedaPesosEsCCorecto() {
        Gaseosa petsi = new Gaseosa();

        petsi.setCosto(100);

        double renta = petsi.setPrecio(200, new Pesos());

        assertEquals(renta, 100.0);
    }



    @Test
    public void test03ElPrecioDeUnaGaseosaConMonedaDollarEsCorrecto() {
        Gaseosa gaseosa = new Gaseosa();
        gaseosa.setCosto(100);

        double renta = gaseosa.setPrecio(10, new Dollar());

        assertEquals(400.0, renta);
    }
    @Test
    public void test04ElPrecioDeUnAlfajorConPagaDeVacaEntoncesLaRentaEsEnPrecioVaca() throws Exception {
        Alfajor alfajor = new Alfajor();
        alfajor.setCosto(3);

        double renta = alfajor.setPrecio(2, new Vaca());

        assertEquals(17.0, renta); // trabajo con la cotizacion de una vaca( en numeroos/cant de vacas);

    }

}
