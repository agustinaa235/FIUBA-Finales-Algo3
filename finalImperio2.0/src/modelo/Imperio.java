package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Imperio {

    //private Collection<PlanetaAgricola> planetas = new ArrayList<>();
    private ArrayList<Planeta> planetas = new ArrayList<Planeta>();

    private int fondoAcumulado = 0;

    public void solicitarRemesaDeProduccion() {

        int totalSolicitado = 0;
        for(Planeta planeta: planetas){
            fondoAcumulado += planeta.calcularImpuesto();
        }
    }

    public void agregarPlaneta(Planeta planeta) {
        this.planetas.add(planeta);
    }

    public int getFondoAcumulado() {
        return this.fondoAcumulado;
    }

    public double robarRecaudacion(double porcentaje) {

        double montoARobar = fondoAcumulado*porcentaje;
        fondoAcumulado -= montoARobar;
        return montoARobar;

    }
}
