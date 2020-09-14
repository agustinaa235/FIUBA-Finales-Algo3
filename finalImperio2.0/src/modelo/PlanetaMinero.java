package modelo;

public class PlanetaMinero implements Planeta{

    private int poblacion;
    public PlanetaMinero(int poblacion){
        this.poblacion = poblacion;
    }


    @Override
    public double calcularImpuesto() {
        return 0.3*produccion();
    }

    public double produccion() {
        return poblacion/2;
    }

}
