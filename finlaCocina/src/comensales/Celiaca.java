package comensales;

import comidas.Comida;

public class Celiaca implements Caracteristicas {
    @Override
    public void comer(Comida unaComida, Persona persona) {
        if(unaComida.poseeGluten()){
            throw new RuntimeException("no puedo comer esto,SOY CELIACA");
        }
        persona.sumarCalorias(unaComida.getCalorias());
    }
}
