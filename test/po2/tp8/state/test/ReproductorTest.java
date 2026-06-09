package po2.tp8.state.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import po2.tp8.state.Reproductor.*;

public class ReproductorTest {

    private Reproductor reproductor;
    private Song song;

    @BeforeEach
    void setUp() {

        song = mock(Song.class);
        reproductor = new Reproductor(song);
    }

    @Test
    void comienzaEnEstadoStop() {

        assertTrue(reproductor.getEstado() instanceof Stop);
    }

    @Test
    void playDesdeStopPasaAReproduciendo() {

        reproductor.play();

        assertTrue(reproductor.getEstado() instanceof Reproduciendo);
        verify(song, times(1)).play();
    }

    @Test
    void pauseDesdeReproduciendoPasaAPause() {

        reproductor.play();
        reproductor.pause();

        assertTrue(reproductor.getEstado() instanceof Pause);

        verify(song).play();
        verify(song).pause();
    }

    @Test
    void pauseDesdePauseRetomaLaReproduccion() {

        reproductor.play();
        reproductor.pause();
        reproductor.pause();

        assertTrue(reproductor.getEstado() instanceof Reproduciendo);

        verify(song).play();
        verify(song).pause();
    }

    @Test
    void stopDesdeReproduciendoVuelveAStop() {

        reproductor.play();
        reproductor.stop();

        assertTrue(reproductor.getEstado() instanceof Stop);

        verify(song).play();
        verify(song).stop();
    }

    @Test
    void stopDesdePauseVuelveAStop() {

        reproductor.play();
        reproductor.pause();
        reproductor.stop();

        assertTrue(reproductor.getEstado() instanceof Stop);

        verify(song).play();
        verify(song).pause();
        verify(song).stop();
    }
}