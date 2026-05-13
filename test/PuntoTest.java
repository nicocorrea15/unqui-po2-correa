import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp3.Punto;

class PuntoTest {
	
	Punto punto;

	@BeforeEach
	void setUp() throws Exception {
		
		punto = new Punto(0,0);
		
	
	}

	@Test
	void test() {
		
		punto.setX(5);
		
		assertEquals(punto.getX(), 5);
	}

}
