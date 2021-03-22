package musicos;

import instrumentos.InstrumentoMetal;

public class RobertoPetinatto implements MusicoMetal{
    private static final int COEFICIENTE_METAL = 3;

    @Override
    public int tocarInstrumentoMetal(InstrumentoMetal unInstrumento) {
        return unInstrumento.tocarConMetal(COEFICIENTE_METAL);
    }
}
