package po2.tp8.state.Maquina;

public class JugandoDosJugadores implements Estado {

    private MaquinaJuego maquina;

    public JugandoDosJugadores(MaquinaJuego maquina) {
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