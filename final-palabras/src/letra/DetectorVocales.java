package letra;

import java.util.ArrayList;

public class DetectorVocales {
    private  ArrayList<String> vocales;
    public DetectorVocales(){
        vocales = new ArrayList<String>();
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
    }


    public  int verificarVocales(String contenido, int pesoLetra){


        if(vocales.contains(contenido)){
            return pesoLetra*2;
        }
        return pesoLetra;
    }
}
