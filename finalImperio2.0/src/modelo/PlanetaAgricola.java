package modelo;

public class PlanetaAgricola implements Planeta{

    private int produccionPorHabitante;
    private int poblacion;

    public PlanetaAgricola(int produccionPorHabitante, int poblacion) {
        this.produccionPorHabitante = produccionPorHabitante;
        this.poblacion = poblacion;
    }

    @Override
    public double calcularImpuesto() {
        return 0.5*produccion();
    }

    public double produccion() {
        return this.produccionPorHabitante * this.poblacion;
    }
}
