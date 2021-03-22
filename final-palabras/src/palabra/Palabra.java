package palabra;

import celda.Celda;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    private List<Celda> celdas;

    public Palabra() {

    	this.celdas = new ArrayList<Celda>();
    }


    public int puntaje() {

        int result = 0;

        for (Celda celda : this.celdas) {
        	
    		result += celda.calcularPesoLetra();

        }

        return result;
    }

    public void agregarCelda(Celda celda) {
        this.celdas.add(celda);
    }
}
 
