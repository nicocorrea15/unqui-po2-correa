package po2.tp3;

import java.time.*;

public class Persona {
	
	String nombre; 
	LocalDate fecnac; 
	
	public Persona(String name, LocalDate fecnac) {
		this.nombre = name; 
		this.fecnac = fecnac;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate fecnac() {
		return fecnac;
	}
	
	public int getEdad() {

        LocalDate hoy = LocalDate.now();
        
        return Period.between(fecnac, hoy).getYears();
    }
	
	public boolean menorQue(Persona per) {
		
		return per.getEdad() < this.getEdad();
	}

}
