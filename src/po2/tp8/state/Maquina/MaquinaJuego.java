package po2.tp8.state.Maquina;

public class MaquinaJuego {

    private Estado estado;

    public MaquinaJuego() {
        estado = new SinFichas(this);
    }

    public void ingresarFicha() {
        estado.ingresarFicha();
    }

    public void presionarInicio() {
        estado.presionarInicio();
    }

    public void terminarJuego() {
        estado.terminarJuego();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}