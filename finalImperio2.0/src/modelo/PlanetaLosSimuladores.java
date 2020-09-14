package modelo;

public class PlanetaLosSimuladores implements Planeta{
    private double produccionRobada =0;

    @Override
    public double calcularImpuesto() {
        return 0;
    }

    @Override
    public double produccion() {
        return produccionRobada;
    }

    public void robarPorcentajeDeRecaudacion(Imperio imperio, double porcentaje) {
             double montoRobado =  imperio.robarRecaudacion(porcentaje);
             produccionRobada +=montoRobado;
    }
    public double getMontoRobado(){
        return produccionRobada;
    }
}
