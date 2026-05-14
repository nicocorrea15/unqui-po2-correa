package po2.tp5;


public class Caja {
	
	private double montoTotal = 0;
	
	public Caja() {
		
	}
	
	public void registrarMontoProducto(Producto producto) {
		montoTotal += producto.getPrecio(); 
		producto.disminuirStock(); 
	}
	
	public double getMontoTotal() { 
		return montoTotal;
	}


}
