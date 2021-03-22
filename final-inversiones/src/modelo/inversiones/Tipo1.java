package modelo.inversiones;

import modelo.inversiones.TipoDeInversion;
import modelo.inversionistas.InversionistaAgresivo;
import modelo.inversionistas.InversionistaArriesgado;
import modelo.inversionistas.InversionistaConservador;

public class Tipo1 extends TipoDeInversion {

    public Tipo1(){
        this.valorDeInversion = 3;
    }

    @Override
    public int calcularInversion(int monto, InversionistaArriesgado inversionistaArriesgado) {
        return monto*valorDeInversion;
    }

    @Override
    public int calcularInversion(int monto, InversionistaConservador inversionistaConservador) {
        return monto;
    }

    @Override
    public int calcularInversion(int monto, InversionistaAgresivo inversionistaAgresivo) {
        return monto;
    }
}
