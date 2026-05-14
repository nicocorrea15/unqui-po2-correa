package po2.tp5;

public abstract class Producto {
	
	private double precioBase ; 
	private String nombre;
	private int stock; 
	
	public Producto(double precioBase , String nombre, int stock) {
		this.precioBase  = precioBase ; 
		this.nombre = nombre;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precioBase;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void disminuirStock() { 
		stock--;
	}
	
	
	

}
