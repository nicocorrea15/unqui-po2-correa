package po2.tp5;

public class Caja {
	
	private double montoTotal = 0;
	
	public Caja() {
		
	}
	
	public void registrarMontoProducto(Factura factura) {
		
		montoTotal += factura.montoAPagar();
	}
	
	public void cobrar(Factura factura) {

        montoTotal += factura.montoAPagar();

        factura.registrarPago();
    }
	
	public double getMontoTotal() { 
		return montoTotal;
	}
}