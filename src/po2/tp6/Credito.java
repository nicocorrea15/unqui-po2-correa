package po2.tp6;

public abstract class Credito {
	
	private double monto; 
	private int cantCuotas;
	private Cliente cliente;
	
	 public Credito(double monto, int cantCuotas, Cliente cliente) {
	 	this.monto = monto;
	 	this.cantCuotas = cantCuotas;
	 	this.cliente = cliente;
	 }
		
	public double montoPorMes() {
		return monto / cantCuotas;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public int cantCuotas() {
		return cantCuotas;
	}

	public abstract boolean evaluarSolicitud();
	
}
