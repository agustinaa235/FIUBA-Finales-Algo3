package modelo;

public class EfectoDarVuelta implements Efecto {
    @Override
    public String aplicarEfecto(String unaCadena) {
        String nuevoString = new StringBuffer(unaCadena).reverse().toString();
        return  nuevoString;
    }
}
