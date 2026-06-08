package po2.tp8;

public class Ingeniero extends PersonajeIndividual {
	
	private int lajas;
	
	public Ingeniero(int cant) {
		this.lajas = cant;
	}
	
	@Override
	public void avanzar() {
		if (this.hayCamino()) {
		System.out.println("Avanza un paso hacia delante");
		}
	}
	
	public void setLajas(int cant) {
		this.lajas = cant;
	}

	@Override
    protected void accionAlCaminar() {
        if(lajas > 0 && !hayLajaAca()) {
            dejarLaja();
        }
    }
	
	public void dejarLaja() {
		// printOut(" agacharse y dejar laja");
	}
	
	public boolean hayLajaAca() {
		return true;
	}
	
	public boolean hayCamino() {
		return true;
	}
}
