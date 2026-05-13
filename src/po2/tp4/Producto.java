package po2.tp4;

public class Producto {
	
	String nombre; 
	double precioBase;
	boolean precioCuidado = false;
	double descuento; 
	
	public Producto(String nombre, double precioBase, boolean preciosCuidado, double descuento) {
		this.nombre = nombre; 
		this.precioBase = precioBase;
		this.descuento = descuento;
	}
	
	public double getPrecio() {
		 if (this.esPrecioCuidado()) {
			  return precioBase *= descuento ;
			}
		return precioBase;
	}
	
	public void setPrecio(double precioNuevo) {
		precioBase = precioNuevo;
	}
		
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
		
	public void setPreciosCuidados() {
		this.precioCuidado = true;
	}

}
