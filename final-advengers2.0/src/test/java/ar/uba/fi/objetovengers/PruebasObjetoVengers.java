package test.java.ar.uba.fi.objetovengers;

import main.java.ar.uba.fi.objetovengers.armaduras.FabricaDeArmaduras;
import main.java.ar.uba.fi.objetovengers.venger.IronMan;
import main.java.ar.uba.fi.objetovengers.NosePuedeAtacarEstaMuertoError;
import main.java.ar.uba.fi.objetovengers.venger.Thanos;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PruebasObjetoVengers {

    private static final double DELTA = 1e-12;

    @Test
    public void test01ThanosEmpiezaSiempreCon250PuntosDeVida() {
        Thanos thanos = new Thanos();

        assertEquals(250, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test02IronManEmpiezaSiempreCon100PuntosDeVida() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmamaduraMarkII());
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArMaduraWarMachine());

        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test03ThanosAtacaAIronManYLeQuita15PuntosDeVida() {
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());

        thanos.atacar(ironMan);

        assertEquals(85, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test04IronManConArmaduraMarkIQuita10PuntosDeVidaAThanos() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test05IronManConArmaduraMarkIIQuita12PorCientoDeSuVidaAThanos() {
        IronMan  ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmamaduraMarkII());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); // Ataca con 12

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);

        thanos.atacar(ironMan); // IronMan pasa a tener 85 puntos de vida

        ironMan.atacar(thanos); // Ataca con 12

        assertEquals(226, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test06IronManConArmaduraWarMachineAtacaAThanosYLeRoba10PuntosDeVida() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArMaduraWarMachine());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test07IronManConArmaduraMarkISePoneArmaduraMarkIIYAtacaAThanos() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmamaduraMarkII());

        // Le quita los 10 de MarkI y otros 12 mas por tener MarkII.
        ironMan.atacar(thanos);

        assertEquals(218, thanos.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test08IronManConArmaduraMarkISePoneArmaduraWarMachineYAtacaAThanos() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(100, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArMaduraWarMachine());

        // Le quita los 10 de MarkI y otros 10 mas por tener WarMachine. Ademas absorbe 10 puntos
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test09IronManConArmaduraMarkIISePoneLasOtrasArmadurasYAtacaAThanos() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmamaduraMarkII());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos);

        assertEquals(238, thanos.getPuntosDeVida(), DELTA);

        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());

        // Le quita los 12 de MarkII y otros 10 mas por tener MarkI.
        ironMan.atacar(thanos);

        assertEquals(216, thanos.getPuntosDeVida(), DELTA);

        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArMaduraWarMachine());

        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(184, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test10IronManConArmaduraWarMachineSePoneLasOtrasArmadurasYAtacaAThanos() {
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArMaduraWarMachine());
        Thanos thanos = new Thanos();

        ironMan.atacar(thanos); // Ataca con 10 y absorbe 10

        assertEquals(240, thanos.getPuntosDeVida(), DELTA);
        assertEquals(110, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());

        // Le quita los 10 de WarMachine y otros 10 mas por tener MarkI. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(220, thanos.getPuntosDeVida(), DELTA);
        assertEquals(120, ironMan.getPuntosDeVida(), DELTA);

        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmamaduraMarkII());

        // Le quita los 12 de MarkII, 10 de MarkI y otros 10 de WarMachine. Absorbe 10 puntos.
        ironMan.atacar(thanos);

        assertEquals(188, thanos.getPuntosDeVida(), DELTA);
        assertEquals(130, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test
    public void test11ThanosConsigueLasGemasDelInfinitoYAtacaConElCuadrupleDePoder() {
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());

        thanos.conseguirLasGemasDelInfinito();

        thanos.atacar(ironMan); // ataca con 60

        assertEquals(40, ironMan.getPuntosDeVida(), DELTA);
    }

    @Test

    public void test12IronManLeRobaLasGemasDElInfinitoAThanosYAtacaConElCuadrupleDelPoderPeroSeMuere(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());
        ironMan.robarGemasA(thanos);
        assertEquals(0, ironMan.getPuntosDeVida());
        assertEquals(210, thanos.getPuntosDeVida());
    }

    @Test
    public void test13IronManLeRobaLasGemasDelInfinitoAThanosYMuereEntoncesNoPuedeVolverAAtacar(){
        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());
        ironMan.robarGemasA(thanos);
        assertThrows(NosePuedeAtacarEstaMuertoError.class, () -> {
            ironMan.atacar(thanos);
        });
    }

    @Test

    public void test14ThanoAtacaAIronManHastaQueLoMataYNoPuedeRecibirMaDanio(){

        Thanos thanos = new Thanos();
        IronMan ironMan = new IronMan();
        ironMan.agregarArmadura(FabricaDeArmaduras.CrearArmaduraMarkI());

        thanos.conseguirLasGemasDelInfinito();

        thanos.atacar(ironMan); // ataca con 60
        thanos.atacar(ironMan);
        assertThrows(NosePuedeAtacarEstaMuertoError.class, () -> {
            thanos.atacar(ironMan);
        });


    }

}
