package po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	ArrayList<Persona> equipo;
	String nombre;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> equipo) { 
		this.nombre = nombre;
		this.equipo = equipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int promedioEdad() {
		
		int cantIntegrantes = equipo.size();
		int edadesTotal = 0;
		
		for (Persona per : equipo) {
			edadesTotal += per.getEdad();
		}
		return edadesTotal / cantIntegrantes;
	}

}
