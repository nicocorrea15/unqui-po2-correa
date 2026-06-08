package po2.tp8.state.Maquina;

public class UnaFicha implements Estado {

    private MaquinaJuego maquina;

    public UnaFicha(MaquinaJuego maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ingresarFicha() {
        maquina.setEstado(new DosFichas(maquina));
    }

    @Override
    public void presionarInicio() {
        maquina.setEstado(new JugandoUnJugador(maquina));
    }

    @Override
    public void terminarJuego() {
    }
}