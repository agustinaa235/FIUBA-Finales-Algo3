package comidas;

public class SinGluten implements Estado {
    @Override
    public boolean esSinGluten() {
        return true;
    }

    @Override
    public boolean esConGluten() {
        return false;
    }
}
