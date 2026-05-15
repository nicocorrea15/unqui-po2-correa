package po2.tp5;

public class Servicio implements Factura {
	
	private double costoPorUnidad;
	private int cantConsumidas;
	private Agencia agencia;
	
	public Servicio(double costoPorUnidad, int cantConsumidas, Agencia agencia) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantConsumidas = cantConsumidas;
		this.agencia = agencia;
	}

	@Override
	public double montoAPagar() {
		return costoPorUnidad * cantConsumidas;
	}

	@Override
	public void registrarPago() {
		agencia.registrarPago(this);
	}
}