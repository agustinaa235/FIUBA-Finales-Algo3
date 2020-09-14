package test;

import modelo.Imperio;
import modelo.PlanetaAgricola;
import modelo.PlanetaLosSimuladores;
import modelo.PlanetaMinero;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImperioTest {

    @Test
    public void imperioSinPlanetasNoObtieneRemesaDeProduccion() {
        Imperio imperio = new Imperio();
        imperio.solicitarRemesaDeProduccion();
        assertEquals(0, imperio.getFondoAcumulado());
    }

    @Test
    public void imperioConUnPlanetaObtieneRemesaDeProduccionDeEsePlaneta() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        // El Imperio se queda con la mitad de lo que produce el Planeta
        imperio.solicitarRemesaDeProduccion();
        assertEquals(500,  imperio.getFondoAcumulado());
    }

    @Test
    public void imperioConDosPlanetaObtieneRemesaDeProduccionDeTodosLosPlanetas() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaAgricola marte = new PlanetaAgricola(5, 10);
        imperio.agregarPlaneta(marte);

        // El Imperio recibe la mitad de lo que producen la tierra y marte
        imperio.solicitarRemesaDeProduccion();
        assertEquals(525, imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioConUnPlanetaMineroObtieneRemesaDeProduccionDeEsePlaneta(){
        Imperio imperio = new Imperio();
        PlanetaMinero tierra = new PlanetaMinero(100);
        imperio.agregarPlaneta(tierra);

        // El Imperio se queda con la 30% de lo que produce el Planeta
        imperio.solicitarRemesaDeProduccion();
        assertEquals(15,  imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioConDosPlanetaDistintosObtieneRemesaDeProduccionDeTodosLosPlanetas() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaMinero marte = new PlanetaMinero(100);
        imperio.agregarPlaneta(marte);

        // El Imperio recibe la mitad de lo que produce la tierra y 30% de lo que produce marte
        imperio.solicitarRemesaDeProduccion();
        assertEquals(515, imperio.getFondoAcumulado());
    }

    @Test
    public void testImperioQuedaEn0SiLoSSimuladoresRobanYNoHayFondos(){
        Imperio imperio = new Imperio();
        PlanetaLosSimuladores simuladores = new PlanetaLosSimuladores();
        imperio.agregarPlaneta(simuladores);
        simuladores.robarPorcentajeDeRecaudacion(imperio,0.3);

        imperio.solicitarRemesaDeProduccion();
        assertEquals(0, imperio.getFondoAcumulado());
    }

    @Test
    public void testPlanetaLosSimuladresRoba0SiImperioNoTieneFondos(){
        Imperio imperio = new Imperio();
        PlanetaLosSimuladores simuladores = new PlanetaLosSimuladores();
        imperio.agregarPlaneta(simuladores);
        simuladores.robarPorcentajeDeRecaudacion(imperio,0.3);
        imperio.solicitarRemesaDeProduccion();
        double montoRobado = simuladores.getMontoRobado();
        assertEquals(0, montoRobado, 1*10-3);
    }

    @Test
    public void testLosSimuladoresRobaRecaudacionDeDosPlanetasAImperio() {

        Imperio imperio = new Imperio();
        PlanetaAgricola tierra = new PlanetaAgricola(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaMinero marte = new PlanetaMinero(100);
        imperio.agregarPlaneta(marte);

        PlanetaLosSimuladores simuladores = new PlanetaLosSimuladores();
        imperio.agregarPlaneta(simuladores);

        // El Imperio recibe la mitad de lo que produce la tierra y 30% de lo que produce marte
        imperio.solicitarRemesaDeProduccion();
        simuladores.robarPorcentajeDeRecaudacion(imperio,0.3);
        assertEquals(360, imperio.getFondoAcumulado(),1*10-3); //Verificamos los fondos del imperio
        assertEquals(155, simuladores.getMontoRobado(), 1*10-3); //Verificamos los fondos de Los simuladores
    }
}
