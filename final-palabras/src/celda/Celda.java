package celda;

import estadoCelda.*;
import letra.Letra;

public class Celda {

    private Letra letra;
    private Estado contabilizado;

    public Celda() {

        this.contabilizado = new NoContabilizada();
    }

    public void setLetra(String contenido, int pesoLetra) {
    	Regla.verificarPeso(pesoLetra);
    	Regla.verificarLargo(contenido);

        this.letra = new Letra(contenido, pesoLetra);
    }


    public int calcularPesoLetra() {


        return contabilizado.calcularPrecio(this, letra);

    }

    public void actualizarEstado(Estado nuevoEstado) {
        this.contabilizado = nuevoEstado;
    }
}
