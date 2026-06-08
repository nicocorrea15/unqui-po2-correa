package po2.tp8.state.Maquina;

public class JugandoUnJugador implements Estado {

    private MaquinaJuego maquina;

    public JugandoUnJugador(MaquinaJuego maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ingresarFicha() {
    }

    @Override
    public void presionarInicio() {
    }

    @Override
    public void terminarJuego() {
        maquina.setEstado(new SinFichas(maquina));
    }
}