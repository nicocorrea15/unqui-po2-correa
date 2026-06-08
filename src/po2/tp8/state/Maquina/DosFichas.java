package po2.tp8.state.Maquina;

public class DosFichas implements Estado {

    private MaquinaJuego maquina;

    public DosFichas(MaquinaJuego maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ingresarFicha() {
        // no acepta más fichas
    }

    @Override
    public void presionarInicio() {
        maquina.setEstado(new JugandoDosJugadores(maquina));
    }

    @Override
    public void terminarJuego() {
    }
}