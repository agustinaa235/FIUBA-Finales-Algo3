package algoiii;

import java.util.ArrayList;

public class FoolMatic {

    private ArrayList<Partido> partidos = new ArrayList<Partido>();
    private Verificador verificadorVotos = new Verificador();

    public void AgregarPartido(Partido unPartido){
        partidos.add(unPartido);
    }
    public Partido obtenerPartido(String leyendaPartido){
        Partido unPartido = null;
        for (Partido partido: partidos){
            if(partido.votoPorEstePartido(leyendaPartido)){
                unPartido =  partido;
            }
        }
        return unPartido;
    }

    public void votar(String leyendaPartido, int cantidadDeVotos){
        Partido unPartido = this.obtenerPartido(leyendaPartido);
        if(unPartido==null){
            throw new RuntimeException("no existe este partido");
        }
        unPartido.contabilizarVotos(cantidadDeVotos);
        verificadorVotos.diferenciaDeVotos(partidos);


    }

    public int escrutinio(String leyendaPartido){
        Partido unPartido = obtenerPartido(leyendaPartido);
        if(unPartido==null){
            throw new RuntimeException("no existe este partido");
        }
        return unPartido.escrutino();

    }

    private boolean esLaDiferenciaTordosDiezVecesMayoraPoR(int votosPartidoTordos, int votosPartidoPoR) {
        return ( votosPartidoTordos > votosPartidoPoR * 10);
    }
}
