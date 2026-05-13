package po2.tp3;

import java.util.ArrayList;
import java.util.List;


public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>(); 
	
	public int getCantPares() {
		
		int cantPares = 0;
	
		for (Integer num : numeros ) {
			if (num % 2 == 0) {
			   cantPares++;
			}
				
		}
		return cantPares;
	}
	
	public void addNumber(int n) {
		numeros.add(n);
	}
	
    public int getCantImpares() {
		
		int cantImpares = 0;
	
		for (Integer num : numeros ) {
			if (num % 2 != 0) {
				cantImpares++;
			}
				
		}
		return cantImpares;
	}
    
    public int cantidadMultiplos(int multiplo) {
        int contador = 0;

        for (Integer num : numeros) {
            if (num % multiplo == 0) {
                contador++;
            }
        }

        return contador;
    }
    
}
