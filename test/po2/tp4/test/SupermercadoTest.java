package po2.tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp4.Producto;
import po2.tp4.Supermercado;

class SupermercadoTest {
	
	Supermercado mercado;
	ArrayList<Producto> catalogo;
	Producto arroz; 
	Producto fideos; 
	Producto aceite;
	Producto leche;
	
	@BeforeEach
	void setUp() {
		
	catalogo = new ArrayList<Producto>();
	
	mercado = new Supermercado(catalogo, "Roque Saenz Peña 392");
	
	arroz = new Producto("arroz", 500, true, 0.9);
	fideos = new Producto("fideos", 700, false, 1.0);
	aceite = new Producto("aceite", 1500, false, 0);
	leche = new Producto("leche", 300, true, 0.89);
	
	mercado.addProducto(aceite);
	mercado.addProducto(arroz);
	mercado.addProducto(fideos);
	mercado.addProducto(leche);
	}
	
	@Test
	void cantProductos() {
		
		assertEquals(mercado.cantProductos(), 4);
	}
	
	void precioDeCadaProducto() {
		
		assertEquals(arroz.getPrecio(), 450);
		assertEquals(leche.getPrecio(), 267);
		assertEquals(fideos.getPrecio(), 700);
		assertEquals(aceite.getPrecio(), 1500);
		
	}
}
