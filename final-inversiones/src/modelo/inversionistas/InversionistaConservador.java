package modelo.inversionistas;

import modelo.inversiones.TipoDeInversion;

public class InversionistaConservador implements Inversionista {

    @Override
    public int calcularInversion(int monto, TipoDeInversion tipoDeInversion) {
        return tipoDeInversion.calcularInversion(monto, this);
    }
}
