package po2.tp6;

public class Cliente {
	
	private String nombre; 
	private String apellido;
	private int edad;
	private double sueldoNetoMensual;
	private double cantDinero;
		
	public Cliente(String nombre, String apellido, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido; 
		this.edad = edad; 
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public void addDinero(double cant) {
		cantDinero += cant;
	}
	
	public double getMontoAnual() {
		return sueldoNetoMensual * 12;
	}
	
	public double getSueldo() {
		return sueldoNetoMensual;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	public double dinero() {
		return cantDinero;
	}

}
