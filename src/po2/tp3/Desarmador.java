package po2.tp3;

import java.util.ArrayList;

public class Desarmador {
	
	public int cantidadDigitosPares(int num) {

        int contador = 0;

        while (num > 0) {

            int digito = num % 10;

            if (digito % 2 == 0) {
                contador++;
            }

            num = num / 10;
        }

        return contador;
    }
	
	public int ganadorCantPares(ArrayList<Integer> numeros) {

	    int numConMaxPares = numeros.get(0);
	    int maxPares = cantidadDigitosPares(numeros.get(0));

	    for (Integer num : numeros) {

	        int pares = cantidadDigitosPares(num);

	        if (pares > maxPares) {

	            maxPares = pares;
	            numConMaxPares = num;
	        }
	    }

	    return numConMaxPares;
	}
	
	public int multiploMayor(int x, int y) {

	    for (int i = 1000; i >= 0; i--) {

	        if (i % x == 0 && i % y == 0) {
	            return i;
	        }

	    }

	    return -1;
	}
	
}
