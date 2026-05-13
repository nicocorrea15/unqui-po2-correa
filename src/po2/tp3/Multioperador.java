package po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	ArrayList<Integer> numeros;
	
	public Multioperador(ArrayList<Integer> numeros) {
		this.numeros = numeros;
		
	}
		
	public int sumar() {
		
		int total = 0;
		
		for (int num : numeros) {
			total += num;
		}
		
		return total;
	}
	
    public int restar() {
		
		int total = 0;
		
		for (int num : numeros) {
			total -= num;
		}
		
		return total;
	}
    
    public int multiplicar() {
		
		int total = 1;
		
		for (int num : numeros) {
			total *= num;
		}
		
		return total;
	}

}
