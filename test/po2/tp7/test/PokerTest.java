package po2.tp7.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp7.Carta;
import po2.tp7.Color;
import po2.tp7.Jugada;
import po2.tp7.Nada;
import po2.tp7.Poker;
import po2.tp7.PokerStatus;
import po2.tp7.Trio;

class PokerTest {

	private PokerStatus poker;

	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;

	@BeforeEach
	void setUp() {

		poker = new PokerStatus();

		c1 = mock(Carta.class);
		c2 = mock(Carta.class);
		c3 = mock(Carta.class);
		c4 = mock(Carta.class);
		c5 = mock(Carta.class);
	}

	@Test
	void testPoker() {

		when(c1.getValor()).thenReturn(2);
		when(c2.getValor()).thenReturn(2);
		when(c3.getValor()).thenReturn(2);
		when(c4.getValor()).thenReturn(2);
		when(c5.getValor()).thenReturn(3);

		when(c1.getPalo()).thenReturn("A");
		when(c2.getPalo()).thenReturn("B");
		when(c3.getPalo()).thenReturn("C");
		when(c4.getPalo()).thenReturn("D");
		when(c5.getPalo()).thenReturn("A");

		Jugada jugada =
				poker.verificar(c1, c2, c3, c4, c5);

		assertTrue(jugada instanceof Poker);
	}

	@Test
	void testTrio() {

		when(c1.getValor()).thenReturn(2);
		when(c2.getValor()).thenReturn(2);
		when(c3.getValor()).thenReturn(2);
		when(c4.getValor()).thenReturn(3);
		when(c5.getValor()).thenReturn(4);

		when(c1.getPalo()).thenReturn("A");
		when(c2.getPalo()).thenReturn("B");
		when(c3.getPalo()).thenReturn("C");
		when(c4.getPalo()).thenReturn("D");
		when(c5.getPalo()).thenReturn("A");

		Jugada jugada =
				poker.verificar(c1, c2, c3, c4, c5);

		assertTrue(jugada instanceof Trio);
	}

	@Test
	void testColor() {

		when(c1.getValor()).thenReturn(2);
		when(c2.getValor()).thenReturn(5);
		when(c3.getValor()).thenReturn(7);
		when(c4.getValor()).thenReturn(10);
		when(c5.getValor()).thenReturn(13);

		when(c1.getPalo()).thenReturn("A");
		when(c2.getPalo()).thenReturn("A");
		when(c3.getPalo()).thenReturn("A");
		when(c4.getPalo()).thenReturn("A");
		when(c5.getPalo()).thenReturn("A");

		Jugada jugada =
				poker.verificar(c1, c2, c3, c4, c5);

		assertTrue(jugada instanceof Color);
	}

	@Test
	void testNada() {

		when(c1.getValor()).thenReturn(2);
		when(c2.getValor()).thenReturn(4);
		when(c3.getValor()).thenReturn(6);
		when(c4.getValor()).thenReturn(8);
		when(c5.getValor()).thenReturn(10);

		when(c1.getPalo()).thenReturn("A");
		when(c2.getPalo()).thenReturn("B");
		when(c3.getPalo()).thenReturn("C");
		when(c4.getPalo()).thenReturn("D");
		when(c5.getPalo()).thenReturn("A");

		Jugada jugada =
				poker.verificar(c1, c2, c3, c4, c5);

		assertTrue(jugada instanceof Nada);
	}

	@Test
	void testPokerLeGanaATrio() {

		Jugada poker = new Poker(10);
		Jugada trio = new Trio(14);

		assertTrue(poker.leGanaA(trio));
	}

	@Test
	void testColorLeGanaATrio() {

		Jugada color = new Color(12);
		Jugada trio = new Trio(14);

		assertTrue(color.leGanaA(trio));
	}

	@Test
	void testPokerLeGanaAColor() {

		Jugada poker = new Poker(5);
		Jugada color = new Color(14);

		assertTrue(poker.leGanaA(color));
	}

	@Test
	void testTrioMayorLeGanaATrioMenor() {

		Jugada trioAses = new Trio(14);
		Jugada trioReyes = new Trio(13);

		assertTrue(trioAses.leGanaA(trioReyes));
	}
}
