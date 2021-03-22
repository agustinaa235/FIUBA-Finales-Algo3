package main.java.ar.uba.fi.algo3.modelo;

public class Mascota{
    private static final double CUOTAMASCOTA = 150.0;

    Boolean ataco = false;
    String nombre;

    public Mascota(String unNombre){
        this.nombre = unNombre;
    }
    public void mordioAAlguein(){
        ataco = true;
    }
    public  boolean atacoAAlguiern(){
        return ataco;
    }

    public String nombre() {
        return nombre;
    }

    public Double calcularDeudaFamiliar() {
        if(atacoAAlguiern()){
            return CUOTAMASCOTA*2;
        }
        return CUOTAMASCOTA;
    }
}
