package modelo;

import java.util.ArrayList;

public class Salamandra implements Artefacto {

    private int metrosCudrados;
    private int cantDeKilos = 0;
    private ArrayList<Madera> maderas = new ArrayList<Madera>();

    public Salamandra(int metrosCuadrados){
        this.metrosCudrados = metrosCuadrados;

    }

    @Override
    public int getConsumo() {
        int consumo =0;
        for(Madera madera: maderas){
            consumo += madera.gastoDeMadera(metrosCudrados);

        }
        return consumo;
    }

    public void agregarMaderaConKilos(Madera unaMadera, int kilos) {
        if(cantDeKilos>15 | kilos>15 | (cantDeKilos + kilos)>15){
            throw new RuntimeException("No se agregar mas madera, la salamandra esta llena");
        }
        unaMadera.agregarKilos(kilos);
        maderas.add(unaMadera);
        cantDeKilos += kilos;

    }
}
