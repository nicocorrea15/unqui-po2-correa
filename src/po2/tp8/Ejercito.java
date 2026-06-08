package po2.tp8;

import java.util.ArrayList;

public class Ejercito implements Personaje {
	
	private ArrayList<Personaje> personajes; 
	
	public Ejercito() {
		this.personajes = new ArrayList<Personaje>();
	}
	
	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}
	
	@Override 
	public void caminar() {
		
		for(Personaje p: personajes) {
			p.caminar();
		}
	}
}