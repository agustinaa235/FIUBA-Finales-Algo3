import cabina.CabinaDePeaje;
import org.junit.Test;
import transportes.Auto;
import transportes.BichoRaro;
import transportes.Camion;
import transportes.Moto;

import static junit.framework.TestCase.assertEquals;

public class CabinaDePeajeTest {

    @Test
    public void testEnUNaCabinaConUnaMotoSinTelepaseSuPejaeEsCorrecto(){
        CabinaDePeaje cabina = new CabinaDePeaje();
        assertEquals(4, cabina.cobrarPeaje(new Moto()));
    }

    @Test

    public void testEnUnaCabinaConUnCamionConTelepaseSuPeajeEsCorrecto(){
        CabinaDePeaje cabina = new CabinaDePeaje();
        assertEquals(36, cabina.cobrarPeaje(new Camion()));
    }

    @Test

    public void testEnUnaCambinaConUnCamionConTelepaseSuPeajeEnCorrecto(){
        CabinaDePeaje cabina = new CabinaDePeaje();
        Camion camion =new Camion();
        camion.registrarTelepase();
        assertEquals(9, cabina.cobrarPeaje(camion));
    }

    @Test

    public void testEnUnaCabinaCpnUnBichoRaroConTelapseSuPeajeEsCorrecto(){
        CabinaDePeaje cabina = new CabinaDePeaje();
        BichoRaro bicho =new BichoRaro();
        bicho.registrarTelepase();
        assertEquals(15, cabina.cobrarPeaje(bicho));
    }

    @Test

    public void testEnUnaCabinaConUnAutoConTelepaseSuPeajeEsCorrecto(){
        CabinaDePeaje cabina = new CabinaDePeaje();
        Auto auto =new Auto();
        auto.registrarTelepase();
        assertEquals(4, cabina.cobrarPeaje(auto));
    }

    @Test

    public void testEnUnaCambinaConUnAutoSinTelepaseSuPeajeEsCorrecto(){
        CabinaDePeaje cabina = new CabinaDePeaje();
        assertEquals(8, cabina.cobrarPeaje(new Auto()));
    }
}
