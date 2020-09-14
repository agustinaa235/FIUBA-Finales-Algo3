import algoiii.FoolMatic;
import algoiii.PartidoPoR;
import algoiii.PartidoSegura;
import algoiii.PartidoTordos;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoolMaticTest {
    @Test
    public void testContabilizarVotosDeVotantePoR() {
        FoolMatic foolMatic = new FoolMatic();

        //f.votar("PoR");

        foolMatic.votar("PoR", 2);
        int votosParaPoR = 2;

        assertEquals(votosParaPoR, foolMatic.escrutinio("PoR"));
    }

    @Test
    public void testContabilizarVotosDeVotanteTordos() {
        FoolMatic f = new FoolMatic();
        f.AgregarPartido(new PartidoPoR());
        f.AgregarPartido(new PartidoTordos());
        f.votar("Tordos", 1);

        int votosParaPoR = 0;
        int votosParaTordos = 1;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }


    @Test
    public void testDistribuyendoVotosParaEmparejarEleccion() {
        FoolMatic f = new FoolMatic();
        f.AgregarPartido(new PartidoPoR());
        f.AgregarPartido(new PartidoTordos());

        f.votar("PoR", 5);
        f.votar("Tordos", 1000);

        int votosParaPoR = 15;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }
    @Test
    public  void testContabilizarVotosDeVotantesPorConDistintosNombreCoincide(){
        FoolMatic foolMatic = new FoolMatic();
        foolMatic.AgregarPartido(new PartidoPoR());
        foolMatic.AgregarPartido(new PartidoTordos());

        foolMatic.votar("PoR", 2);
        foolMatic.votar("pOr", 3);
        foolMatic.votar("PxR", 3);

        int votosParaPoR = 8;

        assertEquals(votosParaPoR, foolMatic.escrutinio("PoR"));

    }
    @Test
    public void testContabiliazarVotosDeVotantesSeguraPorYTordos(){

        FoolMatic f = new FoolMatic();
        f.AgregarPartido(new PartidoPoR());
        f.AgregarPartido(new PartidoTordos());
        f.AgregarPartido(new PartidoSegura());

        f.votar("PoR", 3);
        f.votar("Tordos", 3);
        f.votar("Segura", 3);
        assertEquals(3,f.escrutinio("Segura"));
        assertEquals(3,f.escrutinio("Tordos"));
        assertEquals(3,f.escrutinio("PoR"));


    }
}
