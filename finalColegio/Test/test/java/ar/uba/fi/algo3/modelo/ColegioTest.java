package test.java.ar.uba.fi.algo3.modelo;

import main.java.ar.uba.fi.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColegioTest {

	@Test
    public void conCuatroAlumnosNoHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        nacional.anotar( new Alumno("pepe", "rupertisky"));
        nacional.anotar( new Alumno("agus", "segura"));
        nacional.anotar( new Alumno("camilo", "ramirez"));
        nacional.anotar( new Alumno("evaluna", "perez"));

        assertEquals(400, nacional.deudaAcumulada());
    }
	
    @Test
    public void conDosAlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Alumno gabi = new Alumno("gabi", "sabatini");
        nacional.anotar(gabi);
        Alumno ova = new Alumno("ova", "sabatini");
        nacional.anotar(ova);


        // Cuando hay dos hermanos, uno de ellos paga 25% menos
        assertEquals(175, nacional.deudaAcumulada());
    }

    @Test
    public void conTresAlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Alumno gabi = new Alumno("gabi", "sabatini");
        Alumno quique = new Alumno("quique", "sabatini");
        Alumno ova = new Alumno("ova", "sabatini");
        nacional.anotar(gabi);
        nacional.anotar(quique);
        nacional.anotar(ova);

        // Cuando hay tres hermanos, uno de ellos no paga
        assertEquals(200, nacional.deudaAcumulada());
    }
    @Test
    public void Con2AlumnosHermanosYUnaMascotaQueNoMordioLaDeudaAcumuladaDeXXXPesos(){
        Colegio nacional = new Colegio();

        Alumno gabi = new Alumno("gabi", "sabatini");
        nacional.anotar(gabi);
        Alumno ova = new Alumno("ova", "sabatini");
        nacional.anotar(ova);
        Mascota rufus = new Mascota("rufus");
        nacional.anotarMascota(rufus);


        // Cuando hay dos hermanos, uno de ellos paga 25% menos
        assertEquals(325, nacional.deudaAcumulada());
    }
    @Test
    public void ConUnAlumnoYUnaMascotaQueMordioLaDeudaAcumuladaDeXXXPesos(){
        Colegio nacional = new Colegio();

        Alumno gabi = new Alumno("gabi", "sabatini");
        nacional.anotar(gabi);
        Mascota rufus = new Mascota("rufus");
        nacional.anotarMascota(rufus);
        rufus.mordioAAlguein();


        // Cuando hay dos hermanos, uno de ellos paga 25% menos
        assertEquals(400, nacional.deudaAcumulada());
    }

    
}
