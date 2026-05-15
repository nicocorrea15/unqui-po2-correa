package po2.tp6;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Propiedad(String desc, String dir, double monto) {
		this.descripcion = desc;
		this.direccion = dir; 
		this.valorFiscal = monto;
	}
	
	public double getValorFiscal() {
		return valorFiscal;
	}
	
	public String getDir() {
		return direccion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}


