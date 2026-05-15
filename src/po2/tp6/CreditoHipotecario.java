package po2.tp6;

public class CreditoHipotecario extends Credito{
	
	private Propiedad propiedad;

	public CreditoHipotecario(double monto, int cantCuotas, Cliente cliente, Propiedad prop) {
		super(monto, cantCuotas, cliente);
		this.propiedad = prop;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean evaluarSolicitud() {
		
		Cliente c = this.getCliente();
	
		return this.montoPorMes() <= (c.getSueldo() * 0.5) 
				&& this.getMonto() <= (propiedad.getValorFiscal() * 0.7) 
				&& c.getEdad() + (this.cantCuotas() / 12) <= 65;
				 
	}

}
