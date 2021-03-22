package comidas;

public class ConGluten implements Estado {
    @Override
    public boolean esSinGluten() {
        return false;
    }

    @Override
    public boolean esConGluten() {
        return true;
    }
}
