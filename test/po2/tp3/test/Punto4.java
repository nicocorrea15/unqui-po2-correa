package po2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Punto4 {
	
	private String a = "abc";
	private String s = a; 
	private String t;

	@BeforeEach
	void setUp() throws Exception {
	 
	}

	@Test
	void test() {
		
		assertEquals(s.length(), 3);
		
		// assertEquals(t.length(), 0); no se puede porque t no esta definido
		
		a.toUpperCase();
		
		assertEquals(s.length(), 3);
			
		assertEquals("Libertad".indexOf("r"),4); // return primera vez que "r" aparece
		
		assertEquals("Universidad".lastIndexOf('i'),7); // return ultima vez que aparece "i"
		
		assertEquals("Quilmes".substring(2,4),"il"); // devuelve entre los string desde el 2 hasta el 4
		
		boolean pregunta = (a.length() + a).startsWith("a");
		// 3 + "abc" 
		
		assertFalse(pregunta);
		
		assertTrue(s == a);
				
	}
	
	@Test
	void nose() {
		a.substring(1,3).equals("bc");
		
		assertTrue(a.substring(1,3).equals("bc")); 
		
		assertFalse(a.substring(1,3).equals("abc"));
	}

}

// ● s.length(); -- devuelve 3 
// ● t.length();
// ● 1 + a;    -- no se puede sumar un numero a un string
// ● a.toUpperCase();    -- devuelve 3 solo pasa las minusculas a mayusculas 
// ● "Libertad".indexOf("r");
// ● "Universidad".lastIndexOf('i');
// ● "Quilmes".substring(2,4);
// ● (a.length() + a).startsWith("a");
// ● s == a;
// ● a.substring(1,3).equals("bc")