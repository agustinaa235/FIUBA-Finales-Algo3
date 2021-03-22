package especialistas;

import comidas.Comida;
import comidas.ConGluten;
import comidas.SinGluten;
import comidas.SinSal;

public class FabricaDeCocineros {

    public static Cocinero CrearPanaderoQueCocinaConGluten(){

        Cocinero cocinero = new Cocinero();
        cocinero.puedePreparar("pan", new Comida(10, new ConGluten()));
        return cocinero;
    }
    public static Cocinero CrearPanaderoQueCocinaSinGluten(){
        Cocinero cocinero = new Cocinero();
        cocinero.puedePreparar("pan", new Comida(10, new SinGluten()));
        return cocinero;
    }
    public static Cocinero CrearEmpanadorQueCocinaSinGluten(){
        Cocinero cocinero = new Cocinero();
        cocinero.puedePreparar("empanada", new Comida(15, new SinGluten()));
        return cocinero;
    }
    public static Cocinero CrearEmpanadorQueCocinaConGluten(){
        Cocinero cocinero = new Cocinero();
        cocinero.puedePreparar("empanada", new Comida(15, new ConGluten()));
        return cocinero;
    }
    public static Cocinero CrearEmpanadorYPanaderoQueCocinaConGluten(){
        Cocinero cocinero = new Cocinero();
        cocinero.puedePreparar("empanada", new Comida(15, new ConGluten()));
        cocinero.puedePreparar("pan", new Comida(10, new ConGluten()));
        return cocinero;
    }
    public  static Cocinero CrearUnMasterChef(){

        Cocinero cocinero = new Cocinero();
        cocinero.puedePreparar("empanadaCG", new Comida(15, new ConGluten()));
        cocinero.puedePreparar("panCG", new Comida(10, new ConGluten()));
        cocinero.puedePreparar("empanadaSG", new Comida(15, new SinGluten()));
        cocinero.puedePreparar("panSG", new Comida(10, new SinGluten()));
        cocinero.puedePreparar("panSS", new Comida(9, new SinSal()));
        //cocinero.puedePreparar("panCS", new Comida(10, new COSal()));
        cocinero.puedePreparar("empanadaSS", new Comida(13, new SinSal()));

        return cocinero;

    }
}
