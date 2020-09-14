import modelo.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasaTest {

    @Test
    public void test() {
        Casa casa =  new Casa();

       // EstufaDeBanio estufaDeBanio = new EstufaDeBanio(1,10,1000);
        /*
        estufaDelBanio.ambientes = 1;
        estufaDelBanio.precioKw = 10;
        estufaDelBanio.calorias = 1000;

         */
        ComponenteElectrico estufaDelBanio = new ComponenteElectrico(new EstufaDeBanio(1,10,1000));

        casa.componentes.add(estufaDelBanio);

        ComponenteElectrico losaComedor = new ComponenteElectrico(new LosaRadiante(10,10));
        //losaComedor.metros = 10;
        //losaComedor.precioKw = 10;

        casa.componentes.add(losaComedor);

        ComponenteElectrico cercoFondo = new ComponenteElectrico(new CercoElectrico(10,10));
        //cercoFondo.metros = 10;
        //cercoFondo.precioKw = 10;

        casa.componentes.add(cercoFondo);

        assertEquals(11100, casa.getGastoTotal());
    }

    @Test
    public void seCalculaElGastoConUnaSalamandraYMaderaQuebracaSeCalculaElGastoTotal(){
        Casa casa = new Casa();
        Salamandra salamandra = new Salamandra(10);
        salamandra.agregarMaderaConKilos(new Quebracho(4,2),3);
        ComponenteElectrico artefacto = new ComponenteElectrico(salamandra);
        casa.componentes.add(artefacto);

        assertEquals(240, casa.getGastoTotal());

    }
    @Test
    public void seCalculaElGastoConUnaSalamandraYMaderaPinoSeCalculaElGastoTotal(){
        Casa casa = new Casa();
        Salamandra salamandra = new Salamandra(10);
        salamandra.agregarMaderaConKilos(new Pino(2,3),3);
        ComponenteElectrico artefacto = new ComponenteElectrico(salamandra);
        casa.componentes.add(artefacto);

        assertEquals(20, casa.getGastoTotal());

    }
    @Test
    public void seCalculaElGastoConUnaSalamndarDeAmabasMaderasConMasDe15KilosEntoncesLanzaUnaExcepcion(){
        Casa casa = new Casa();
        Salamandra salamandra = new Salamandra(10);
        salamandra.agregarMaderaConKilos(new Pino(2,3),3);
        ComponenteElectrico artefacto = new ComponenteElectrico(salamandra);
        casa.componentes.add(artefacto);

        try {
            salamandra.agregarMaderaConKilos(new Quebracho(4,2),20);
            Assert.fail("No se arrojo exception al exceder los 15 kg de la salamandra");
        } catch (RuntimeException exception) {
            assertEquals("No se agregar mas madera, la salamandra esta llena", exception.getMessage());
        }

    }
}
