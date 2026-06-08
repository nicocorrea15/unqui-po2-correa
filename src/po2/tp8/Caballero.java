package po2.tp8;

public class Caballero extends PersonajeIndividual{

	public Caballero() {
		
	}
	
	@Override
    public void avanzar() {
        if(hayCamino()) {
            // avanzar zigzag
        }
    }

    @Override
    public void accionAlCaminar() {
            // vigilar enemigos
    }

	@Override
	public boolean hayCamino() {
		return true;
	}
}