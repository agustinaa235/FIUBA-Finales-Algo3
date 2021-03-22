package modelo.inversiones;

import modelo.inversionistas.InversionistaAgresivo;
import modelo.inversionistas.InversionistaArriesgado;
import modelo.inversionistas.InversionistaConservador;

public abstract class TipoDeInversion {
    protected int valorDeInversion;

    public abstract int calcularInversion(int monto, InversionistaArriesgado inversionistaArriesgado);

    public abstract int calcularInversion(int monto, InversionistaConservador inversionistaConservador);

    public abstract int calcularInversion(int monto, InversionistaAgresivo inversionistaAgresivo);
}
