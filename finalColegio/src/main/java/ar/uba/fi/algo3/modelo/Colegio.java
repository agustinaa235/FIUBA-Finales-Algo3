package main.java.ar.uba.fi.algo3.modelo;

import java.util.*;

public class Colegio {
    //private List<Alumno> alumnos;
    private HashMap<String, Familia> alumnos;
    private HashMap<String, Mascota> mascotas;


    public Colegio() {

        this.alumnos = new HashMap<>();
        this.mascotas = new HashMap<>();
    }

    public void anotar(Alumno alumno) {
        if(alumnos.containsKey(alumno.apellido())){
            (alumnos.get(alumno.apellido())).agregarMiembro(alumno);
        }else {
            Familia familia = new Familia();
            familia.agregarMiembro(alumno);
            alumnos.put(alumno.apellido(), familia);
        }

    }
    public void anotarMascota(Mascota unaMascota){
        mascotas.put(unaMascota.nombre(), unaMascota);
    }
    public Double deudaAcumuladaMascostas(){
        Double deudaTotal = 0.0;

        Set<String> nombres = mascotas.keySet();
        for (String nombre : nombres) {
            deudaTotal += mascotas.get(nombre).calcularDeudaFamiliar();
        }
        return deudaTotal;
    }
    public Double deudaAcumulada(){
        Double deuda = 0.0;
        deuda = this.deudaAcumuladaAlumnos() + this.deudaAcumuladaMascostas();
        return deuda;
    }

    public Double deudaAcumuladaAlumnos() {

        Double deudaTotal = 0.0;

        Set<String> apellidos = alumnos.keySet();
        for (String apellido : apellidos) {
            deudaTotal += alumnos.get(apellido).calcularDeudaFamiliar();
        }

        return deudaTotal;
    }

}
