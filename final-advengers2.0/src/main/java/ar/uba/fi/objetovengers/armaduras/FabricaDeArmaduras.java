package main.java.ar.uba.fi.objetovengers.armaduras;

import main.java.ar.uba.fi.objetovengers.armaduras.Armadura;

public class FabricaDeArmaduras {

    public static Armadura CrearArmaduraMarkI(){
        return new Armadura(10, 0);
    }

    public static Armadura CrearArmamaduraMarkII(){
        return new Armadura(12,0);
    }
    public static Armadura CrearArMaduraWarMachine(){
        return new Armadura(10, 10);
    }
}
