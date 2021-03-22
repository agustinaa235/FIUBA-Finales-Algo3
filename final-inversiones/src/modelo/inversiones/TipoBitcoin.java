package modelo.inversiones;

import modelo.inversiones.TipoDeInversion;
import modelo.inversionistas.Inversionista;
import modelo.inversionistas.InversionistaAgresivo;
import modelo.inversionistas.InversionistaArriesgado;
import modelo.inversionistas.InversionistaConservador;

public class TipoBitcoin extends TipoDeInversion {
    public TipoBitcoin(){
        this.valorDeInversion = 4;
    }

    @Override
    public int calcularInversion(int monto, InversionistaArriesgado inversionistaArriesgado) {
        return monto;
    }

    @Override
    public int calcularInversion(int monto, InversionistaConservador inversionistaConservador) {
        return monto;
    }

    @Override
    public int calcularInversion(int monto, InversionistaAgresivo inversionistaAgresivo) {
        return monto*valorDeInversion;
    }

}
