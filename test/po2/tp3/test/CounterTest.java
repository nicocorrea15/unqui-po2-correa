package po2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp3.Counter;

class CounterTest {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp() {
		
	counter = new Counter(); 
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
		
	}

	@Test
	public void counterClass() {
		
		int cantPares = counter.getCantPares();
		int cantImpares = counter.getCantImpares();
		int cantMultiplesDeTres = counter.cantidadMultiplos(3);
		
		assertEquals(cantPares, 1) ;
		assertEquals(cantImpares, 9);
		assertEquals(cantMultiplesDeTres, 2);
		
	}

}
