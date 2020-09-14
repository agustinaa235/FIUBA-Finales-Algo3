package main.java.ar.uba.fi.modelo.personajes;

public class Thanos extends ObjetoVenger {



    public Thanos() {
        this.puntosDeVida = 250;
        this.tieneGemasDelInfinito = false;
    }

    @Override
    public void atacar(ObjetoVenger ironMan){
        ironMan.recibirDanio(this.tieneGemasDelInfinito ? 60 : 15);
    }

}
