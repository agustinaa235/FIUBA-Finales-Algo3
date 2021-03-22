package main.java.ar.uba.fi.algo3.modelo;

import java.util.LinkedList;

public class Familia {
    LinkedList<Alumno> hermanos = new LinkedList<Alumno>();
    Deuda deuda = new Deuda();

    public void agregarMiembro(Alumno alumno) {
        hermanos.add(alumno);

    }

    public Double calcularDeudaFamiliar() {
        return deuda.calcularDeudaPorFamilia(hermanos.size());
    }


}
