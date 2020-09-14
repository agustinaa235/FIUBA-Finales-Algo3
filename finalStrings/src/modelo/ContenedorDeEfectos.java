package modelo;

import java.util.ArrayList;

public class ContenedorDeEfectos {
    private ArrayList<Efecto> efectos = new ArrayList<Efecto>();
    public void agregarEfecto(Efecto unEfecto) {

        efectos.add(unEfecto);

    }

    public String aplicarA(String unaCadena) {

        if (unaCadena.equals("")) {
                throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }
        for(Efecto efecto: efectos){
            unaCadena = efecto.aplicarEfecto(unaCadena);
        }
        return unaCadena;
    }
}
