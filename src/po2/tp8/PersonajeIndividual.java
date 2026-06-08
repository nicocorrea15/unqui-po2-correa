package po2.tp8;

public abstract class PersonajeIndividual implements Personaje {

    public void caminar() {
        avanzar();
        accionAlCaminar();
    }

    protected abstract void avanzar();

    protected abstract void accionAlCaminar();

    protected abstract boolean hayCamino();
}