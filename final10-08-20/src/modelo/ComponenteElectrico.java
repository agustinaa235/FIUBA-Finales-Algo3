package modelo;

public class ComponenteElectrico {

    private Artefacto tipo;



    public ComponenteElectrico(Artefacto unComponente){

        this.tipo = unComponente;
    }

    public int getConsumo() {

        return tipo.getConsumo();

    }
}
