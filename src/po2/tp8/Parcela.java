package po2.tp8;

import java.util.ArrayList;

public class Parcela {
	
	public ArrayList<Cultivo> cultivos; 
	
	public Parcela(ArrayList<Cultivo> cultivos) {
		this.cultivos = new ArrayList<Cultivo>();
	}
	
	public void agregarCultivo(Cultivo c) {
		cultivos.add(c);
	}
	
	public void eliminarCultivo(Cultivo c) {
		cultivos.remove(c);
	}
	
	public double getGananciaTotal() {
		
		double total = 0;
		
		for(Cultivo c: cultivos) { 
			total += c.getGanancia();
		}
		
	 return total;
	}
	
	public int cantCultivos() {
		return cultivos.size();
	}
}

