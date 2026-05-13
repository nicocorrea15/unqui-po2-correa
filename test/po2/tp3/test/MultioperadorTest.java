package po2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp3.Multioperador;

class MultioperadorTest {
	
	ArrayList<Integer> numeros;
	Multioperador multioperador;

	@BeforeEach
	void setUp() throws Exception {
		
	numeros = new ArrayList<Integer>();
	
	multioperador = new Multioperador(numeros);
	
	numeros.add(50);	
	numeros.add(100);	
	numeros.add(250);	
	numeros.add(300);	
	}

	@Test
	void sumar() {
		
		assertEquals(multioperador.sumar(), 700);
	}
	
	@Test 
	void restar() {
		assertEquals(multioperador.restar(), -700);
	}
	
	@Test 
	void multiplicar() {
		
			
		assertEquals(multioperador.multiplicar(), 375000000);
	}

}
