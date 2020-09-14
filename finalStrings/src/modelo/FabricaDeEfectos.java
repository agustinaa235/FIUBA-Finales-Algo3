package modelo;

public class FabricaDeEfectos {

    public static ContenedorDeEfectos CrearEfectoAgregarCincoAlFinal() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoAgregarUnNumeroAlFinal(5));
        return contenedorDeEfectos;
    }

    public static ContenedorDeEfectos CrearEfectoAgregarOchoAlFinal() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoAgregarUnNumeroAlFinal(8));
        return contenedorDeEfectos;
    }

    public static ContenedorDeEfectos CrearEfectoDarVueltaYPrimeraMayuscula() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoDarVuelta());
        contenedorDeEfectos.agregarEfecto(new EfectoPrimeraMayuscula());
        return contenedorDeEfectos;

    }

    public static ContenedorDeEfectos CrearEfectoPrimeraMayuscula() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoPrimeraMayuscula());
        return contenedorDeEfectos;
    }

    public static ContenedorDeEfectos CrearEfectoPrimeraMayusculaYAgregarOcho() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoPrimeraMayuscula());
        contenedorDeEfectos.agregarEfecto(new EfectoAgregarUnNumeroAlFinal(8));
        return contenedorDeEfectos;
    }

    public static ContenedorDeEfectos CrearEfectoAgregar3AlFinalDELaCdenaYPrimeraLetraEnMinuscula() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoPrimeraMinuscula());
        contenedorDeEfectos.agregarEfecto(new EfectoAgregarUnNumeroAlFinal(3));
        return contenedorDeEfectos;
    }

    public static ContenedorDeEfectos CrearEfectoDarVueltaLaCadenaAgregarUn4AlFinalYPonerLaPrimerLetraEnMinuscula() {
        ContenedorDeEfectos contenedorDeEfectos = new ContenedorDeEfectos();
        contenedorDeEfectos.agregarEfecto(new EfectoDarVuelta());
        contenedorDeEfectos.agregarEfecto(new EfectoAgregarUnNumeroAlFinal(4));
        contenedorDeEfectos.agregarEfecto(new EfectoPrimeraMinuscula());

        return contenedorDeEfectos;
    }
}
