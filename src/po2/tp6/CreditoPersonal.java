package po2.tp6;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(double monto, int cantCuotas, Cliente cliente) {
		super(monto, cantCuotas, cliente);
	}

	@Override
	public boolean evaluarSolicitud() {
		
		Cliente c = this.getCliente();
	
		return c.getMontoAnual() > 15000 && this.montoPorMes() < (c.getSueldo() * 0.7);
	}

}
