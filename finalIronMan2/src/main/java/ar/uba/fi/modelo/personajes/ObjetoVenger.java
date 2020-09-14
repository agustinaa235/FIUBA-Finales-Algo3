package main.java.ar.uba.fi.modelo.personajes;

public abstract class ObjetoVenger {
    protected int puntosDeVida;
    protected boolean tieneGemasDelInfinito;


    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }
    public void sumarVida(double vida){
        this.puntosDeVida +=vida;
    }

    public void recibirDanio(double danio){
        this.puntosDeVida -= danio;
    }
    //implementa cada uno
    public abstract void atacar(ObjetoVenger unVenger);
    public void conseguirLasGemasDelInfinito() {
        this.tieneGemasDelInfinito = true;
    }

    public void quitarGemasDelInfinto() {
        this.tieneGemasDelInfinito = false;
    }

}
