package po2.tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp6.*;

class BancoTest {
	
	Banco banco; 
	Credito credito1; 
	Credito credito2; 
	Credito credito3; 
	Cliente c1; 
	Cliente c2; 
	Propiedad prop;
	
	@BeforeEach
	void setUp() {
		
		banco = new Banco();
		
		c1 = new Cliente("nico", "correa", 28, 1250); 
		c2 = new Cliente("mili", "correa", 24, 15000); 
		
		credito1 = new CreditoPersonal(10000, 24, c1);
		credito2 = new CreditoPersonal(50000, 12, c2);
		
		prop = new Propiedad("Casa", "Calle 803 1936", 1000000);
		
		credito3 = new CreditoHipotecario(500000, 72, c2, prop);
		
	}

	@Test
	void creditoAprobado() {
		
		assertTrue(banco.estadoSolicitud(credito1));
		assertTrue(banco.estadoSolicitud(credito2));
		assertTrue(banco.estadoSolicitud(credito3));
	}
	
	@Test 
	void montoTotal() {
		
		banco.registrarCredito(credito1);
		banco.registrarCredito(credito2);
		banco.registrarCredito(credito3);
		
		assertEquals(banco.montoTotalDeTodasLasSolicitudesAceptadas(), 560000);
	}
	
	@Test 
	void estadoDinero() {
		
		banco.otorgarCredito(credito1);
		
		assertEquals(c1.dinero(), 10000);
	}

}
