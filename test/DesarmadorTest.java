import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp3.Desarmador;

class DesarmadorTest {
	
	private Desarmador desarmador;
	private ArrayList<Integer> numeros;

	
	@BeforeEach 
	void setUp() {
		
		desarmador = new Desarmador();
		
		numeros = new ArrayList<Integer>();
		numeros.add(5000);
		numeros.add(52004);
		numeros.add(6882);
		numeros.add(1215);
		numeros.add(5394128);
		
	}
	
	
	@Test
	void test() {
				
		assertEquals(desarmador.cantidadDigitosPares(5000), 3);
		assertEquals(desarmador.cantidadDigitosPares(5394128), 3);
		
		assertEquals(desarmador.ganadorCantPares(numeros), 52004);
		
	}

}
