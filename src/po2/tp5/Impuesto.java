package po2.tp5;

public class Impuesto implements Factura {
	
	private double tasaServicio;
	private Agencia agencia; 
	
	public Impuesto(double tasaServicio, Agencia agencia) {
		this.tasaServicio = tasaServicio;
		this.agencia = agencia;
	}
	
	public double getTasaServicio() {
		return tasaServicio;
	}

	@Override
	public double montoAPagar() {
		return this.getTasaServicio();
	}
	
	@Override
    public void registrarPago() {
        agencia.registrarPago(this);
    }
} 