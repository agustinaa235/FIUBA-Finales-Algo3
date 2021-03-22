package modelo.inversiones;

import modelo.inversiones.TipoDeInversion;
import modelo.inversionistas.InversionistaAgresivo;
import modelo.inversionistas.InversionistaArriesgado;
import modelo.inversionistas.InversionistaConservador;

public class Tipo0 extends TipoDeInversion {


    public Tipo0(){
        this.valorDeInversion = 2;
    }

    @Override
    public int calcularInversion(int monto, InversionistaArriesgado inversionistaArriesgado) {
        return monto*valorDeInversion;
    }

    public int calcularInversion(int monto, InversionistaConservador inversionistaConservador) {
        return monto*valorDeInversion;
    }

    @Override
    public int calcularInversion(int monto, InversionistaAgresivo inversionistaAgresivo) {
        return monto;
    }

}
