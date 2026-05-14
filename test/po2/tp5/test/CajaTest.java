package po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp5.*;

class CajaTest {
	
	Caja caja; 
	Producto p1; 
	Producto p2; 
	Producto p3;
	
	@BeforeEach 
	void setUp() {
		
		caja = new Caja();
		
		p1 = new ProductoCooperativo(500, "fideos", 50);
		p2 = new ProductoTradicional(1500, "aceite", 20); 
		p3 = new ProductoCooperativo(300, "leche", 30);
	}

	@Test
	void agregarProducto() {
		
		caja.registrarMontoProducto(p1);
		caja.registrarMontoProducto(p2);
		caja.registrarMontoProducto(p3);
		
		assertEquals(caja.getMontoTotal(),450+270+1500);
	}

}
