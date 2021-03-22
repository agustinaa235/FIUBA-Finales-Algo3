package letra;

import java.util.ArrayList;

public class Letra {

    private String contenido;
    private int pesoLetra = 0;

    public Letra(String contendio, int pesoLetra){
        DetectorVocales detectorVocales= new DetectorVocales();
        this.contenido = contendio;
        this.pesoLetra = detectorVocales.verificarVocales(contenido, pesoLetra);
    }


    public int calularPeso() {
        return pesoLetra;
    }



}
