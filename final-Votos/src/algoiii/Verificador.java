package algoiii;

import java.util.ArrayList;

public class Verificador {
    private static final int VOTOSSUMADOS = 10;

    public void diferenciaDeVotos(ArrayList<Partido> partidos) {

        for(Partido partido: partidos){
            if(this.tieneDiferenciaMayorA10(partido, partidos)){
                partido.contabilizarVotos(VOTOSSUMADOS);
            }

        }
    }

    private boolean tieneDiferenciaMayorA10(Partido partido, ArrayList<Partido> partidos) {
        for(Partido otroPartido: partidos){
            int votos = partido.escrutino();
            if( (votos!=otroPartido.escrutino()) && votos <(otroPartido.escrutino())*VOTOSSUMADOS && votos>0){
                return true;
            }
        }
        return false;
    }
}
