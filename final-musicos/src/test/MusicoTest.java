package test;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import musicos.FitoPaez;
import musicos.LucianoPereyra;
import musicos.RicardoMollo;
import musicos.RobertoPetinatto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicoTest {

    @Test
    public void testMusicoLucianoPereyraSeLepideTocaUnInstrumentoDeMaderElPuntajeEsCCorrecto(){
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        assertEquals(20, lucianoPereyra.tocarInstrumentoMadera(new Charango()));
    }
    @Test

    public void testMusicoFitoPaezSeLePideTocarUnIntsrumentoDePlasticoElPuntajeEsCorrecto(){
        FitoPaez fito = new FitoPaez();
        assertEquals(17, fito.tocarInstrumentoPlastico(new GuitarraCriolla()));
    }

    @Test

    public void testMusicoRicardoMolloSeLePideTocarUnInstrumentoDeMaderaEntoncesElPuntajeEsCorrecto(){

        RicardoMollo richard = new RicardoMollo();
        assertEquals(50, richard.tocarInstrumentoMadera(new Piano()));
    }

    @Test
    public void testMusicoRobertoPetinattoSeLpideTocarElSaxoEntoncesElPuntajeEsElCorrecto(){

        RobertoPetinatto robert = new RobertoPetinatto();
        assertEquals(90, robert.tocarInstrumentoMetal(new Saxo()));
    }
}
