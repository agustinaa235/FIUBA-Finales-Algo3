package modelo;

public class EfectoPrimeraMinuscula implements Efecto {
    @Override
    public String aplicarEfecto(String unaCadena) {
        return (unaCadena.substring(0, 1).toLowerCase() + unaCadena.substring(1));

    }
}
