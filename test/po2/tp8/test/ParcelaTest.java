package po2.tp8.test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

import po2.tp8.*;

class ParcelaTest {
	
	ArrayList<Cultivo> cultivos;
	
	private Cultivo c1;
	private Cultivo c2;
	private Cultivo c3;
	private Cultivo c4;
	private Cultivo c5;
	private Cultivo cmixto1;
	private Cultivo cmixto2;
	private Cultivo cmixto3;
	private Cultivo cmixto4;
	
	Parcela parcela;
	
	@BeforeEach
	void setUp() { 
		
		parcela = new Parcela(cultivos);
		
		c1 = mock(Cultivo.class);
		c2 = mock(Cultivo.class);
		c3 = mock(Cultivo.class);
		c4 = mock(Cultivo.class);
		
		cmixto1 = mock(Cultivo.class);
		cmixto2 = mock(Cultivo.class);
		cmixto3 = mock(Cultivo.class);
		cmixto4 = mock(Cultivo.class);
		
		c5 = new PorcionMixta(cmixto1,cmixto2,cmixto3,cmixto4); 
		
		parcela.agregarCultivo(c1);
		parcela.agregarCultivo(c2);
		parcela.agregarCultivo(c3);
		parcela.agregarCultivo(c4);
		parcela.agregarCultivo(c5);	
	}

	@Test
	void cantDeCultivos() {

		assertTrue(parcela.cantCultivos() == 5);
	}

	@Test
	void totalTest() {
		
		when(c1.getGanancia()).thenReturn((double) 300);
		when(c2.getGanancia()).thenReturn((double) 500);
		when(c3.getGanancia()).thenReturn((double) 500);
		when(c4.getGanancia()).thenReturn((double) 500);
		when(cmixto1.getGanancia()).thenReturn((double) 300);
		when(cmixto2.getGanancia()).thenReturn((double) 500);
		when(cmixto3.getGanancia()).thenReturn((double) 300);
		when(cmixto4.getGanancia()).thenReturn((double) 500);
		
		assertEquals(parcela.getGananciaTotal(), 2200);
	}
	
	@Test
	void nose() {
				
		when(cmixto1.getGanancia()).thenReturn((double) 300);
		when(cmixto2.getGanancia()).thenReturn((double) 500);
		when(cmixto3.getGanancia()).thenReturn((double) 300);
		when(cmixto4.getGanancia()).thenReturn((double) 500);
		
		assertEquals(parcela.getGananciaTotal(), 400);
		
	}

}
