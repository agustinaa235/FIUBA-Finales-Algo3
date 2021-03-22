package comensales;

import comidas.Comida;

public class Hipertenso implements Caracteristicas {
    @Override
    public void comer(Comida unaComida, Persona persona) {
        persona.sumarCalorias(unaComida.getCalorias());
    }
}
