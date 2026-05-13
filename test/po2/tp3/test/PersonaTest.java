package po2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp3.Persona;

class PersonaTest {
	
	Persona persona;
	Persona persona1; 
	LocalDate fecnac;
	LocalDate fecnac1;
	
	@BeforeEach
	void setUp() { 
		
		fecnac1 = LocalDate.of(2002, 1, 26);
		fecnac = LocalDate.of(1997, 9, 3);
		persona = new Persona("Nico", fecnac);
		persona1 = new Persona("Mili", fecnac1);
	}

	@Test
	void edad() {
		
		assertEquals(persona.getEdad(),28);
		
	}
	
	@Test
	void menorQue() {
		
		assertTrue(persona.menorQue(persona1));
	}

}
