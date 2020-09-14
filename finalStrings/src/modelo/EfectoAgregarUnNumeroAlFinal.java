package modelo;

public class EfectoAgregarUnNumeroAlFinal implements Efecto {
    private int numero;
    public EfectoAgregarUnNumeroAlFinal(int numero) {
        this.numero = numero;
    }

    @Override
    public String aplicarEfecto(String unaCadena) {
        return  (unaCadena + this.numero);
    }
}
