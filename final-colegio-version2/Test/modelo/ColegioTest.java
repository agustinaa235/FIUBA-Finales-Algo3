package modelo;

import main.java.ar.uba.fi.algo3.modelo.deudor.Alumno;
import main.java.ar.uba.fi.algo3.modelo.institucion.Colegio;
import main.java.ar.uba.fi.algo3.modelo.deudor.Familia;
import main.java.ar.uba.fi.algo3.modelo.deudor.Mascota;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ColegioTest {

	@Test
    public void conCuatroAlumnosNoHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        nacional.anotar( new Alumno("Gabi"));
        nacional.anotar( new Alumno("Pepe"));
        nacional.anotar( new Alumno("Robert"));
        nacional.anotar( new Alumno("Augusto"));

        assertEquals(400, nacional.deudaAcumulada());
    }

    @Test

    public void conTresAlumnosHermanisLaDeudaAcumuladaEsDeXXXPesos(){

	    Colegio nacinal = new Colegio();
        Familia sabatini = new Familia("sabatini");
        sabatini.agregarMiembro(new Alumno("gabi"));
        sabatini.agregarMiembro(new Alumno("quico"));
        sabatini.agregarMiembro(new Alumno("ova"));

        nacinal.anotar(sabatini);
        assertEquals(200.0, nacinal.deudaAcumulada());
    }
    @Test

    public void con2AlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos(){

        Colegio nacinal = new Colegio();
        Familia sabatini = new Familia("sabatini");
        sabatini.agregarMiembro(new Alumno("gabi"));
        sabatini.agregarMiembro(new Alumno("quico"));

        nacinal.anotar(sabatini);
        assertEquals(175.0, nacinal.deudaAcumulada());

    }
    @Test

    public void con1AlumnoLaDEudaAcumuladaEsDeXXXPesos(){

	    Colegio nacional = new Colegio();
	    Familia gomez = new Familia("Gomez");
	    gomez.agregarMiembro(new Alumno("ramiro"));
	    nacional.anotar(gomez);

	    assertEquals(100.0, nacional.deudaAcumulada());
    }

    @Test

    public void conUnaMascotaQueMordioUnaVezLaDeudaAcumuladaEsDeXXXPesos(){
	    Colegio naciona = new Colegio();
	    Mascota gato = new Mascota("rufus");
	    naciona.anotar(gato);
	    gato.morder();
	    assertEquals(300.0, naciona.deudaAcumulada());
	    assertEquals(1, naciona.mordeduras());
    }

    @Test

    public void conDosMascotasEnDondeUnaSolaMordioLaDeudaAcumuladaEsCorreca(){
        Colegio naciona = new Colegio();
        Mascota gato = new Mascota("rufus");
        Mascota perro = new Mascota("morita");
        naciona.anotar(gato);
        naciona.anotar(perro);
        gato.morder();
        assertEquals(450.0, naciona.deudaAcumulada());
        assertEquals(1, naciona.mordeduras());

    }

    
}
