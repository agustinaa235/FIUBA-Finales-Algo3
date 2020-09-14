package modelo;

import modelo.ComponenteElectrico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Casa {

    public List<ComponenteElectrico> componentes = new ArrayList<ComponenteElectrico>();


    public int getGastoTotal() {

        int gasto = 0;

        Iterator<ComponenteElectrico> iterador = componentes.iterator();

        while (iterador.hasNext()) {
            ComponenteElectrico componenteElectrico = iterador.next();
            gasto = gasto + componenteElectrico.getConsumo();
        }
        return gasto;
    }
}
/*
        iterador = cercos.iterator();

        while (iterador.hasNext()){
            ComponenteElectrico cerco = iterador.next();
            gasto = gasto + cerco.getConsumo();
        }

        iterador = losas.iterator();

        while (iterador.hasNext()){
            ComponenteElectrico losa = iterador.next();
            gasto = gasto + losa.getConsumo();
        }

        return gasto;
    }
*/


