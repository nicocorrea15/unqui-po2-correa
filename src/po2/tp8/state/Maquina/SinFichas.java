package po2.tp8.state.Maquina;

public class SinFichas implements Estado {

    private MaquinaJuego maquina;

    public SinFichas(MaquinaJuego maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ingresarFicha() {
        maquina.setEstado(new UnaFicha(maquina));
    }

    @Override
    public void presionarInicio() {
        // mostrar mensaje "Ingrese fichas"
    }

    @Override
    public void terminarJuego() {
    }
}