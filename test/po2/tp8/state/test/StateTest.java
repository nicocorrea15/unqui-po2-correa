package po2.tp8.state.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp8.state.*;
import po2.tp8.state.Maquina.DosFichas;
import po2.tp8.state.Maquina.Estado;
import po2.tp8.state.Maquina.JugandoDosJugadores;
import po2.tp8.state.Maquina.JugandoUnJugador;
import po2.tp8.state.Maquina.MaquinaJuego;
import po2.tp8.state.Maquina.SinFichas;
import po2.tp8.state.Maquina.UnaFicha;

class StateTest {
	
	MaquinaJuego maquina;
	Estado unJugador;
	Estado dosJugadores;	
	Estado sinFichas;
	Estado jugando2; 
	Estado jugando1;
	
	@BeforeEach 
	void setUp() {
		
	maquina = new MaquinaJuego();
	unJugador = mock(UnaFicha.class);
	sinFichas = mock(SinFichas.class);
	dosJugadores = mock(DosFichas.class); 
	jugando2 = mock(JugandoDosJugadores.class);
	jugando1 = mock(JugandoUnJugador.class);
	
	}

	@Test
	void comienzaSinFichas() {

	    assertTrue(maquina.getEstado() instanceof SinFichas);
	}
	
	@Test
	void unaFicha() {
		
		maquina.ingresarFicha();
		
		assertTrue(maquina.getEstado() instanceof UnaFicha);
		
	}
	
	@Test
	void dosFichasCambiaEstado() {

	    maquina.ingresarFicha();
	    maquina.ingresarFicha();

	    assertTrue(maquina.getEstado() instanceof DosFichas);
	}
	
	@Test
	void jugandoUnJugador() {
		
		maquina.ingresarFicha();
		maquina.presionarInicio();
		
		assertTrue(maquina.getEstado() instanceof JugandoUnJugador);
	}
	
	@Test
	void jugandoDosJugadores() {
		
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.presionarInicio();
		
		assertTrue(maquina.getEstado() instanceof JugandoDosJugadores);
	}
	
	@Test
	void terminarJuegoo() {
		
		maquina.ingresarFicha();
		maquina.presionarInicio();
		maquina.terminarJuego();
		
		assertTrue(maquina.getEstado() instanceof SinFichas);
	}
}
