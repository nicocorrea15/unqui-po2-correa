package po2.tp8.state.Reproductor;

public class Reproduciendo implements EstadoReproductor {
	
	private Reproductor repro;
	
	public Reproduciendo(Reproductor repo) {
		this.repro = repo;
	}

	@Override
	public void play() {
		// no se puede reproducir algo ya reproducido	
	}

	@Override
	public void pause() {
		repro.getSong().pause();
		repro.setEstado(new Pause(repro));
	}

	@Override
	public void stop() {
		repro.getSong().stop();
		repro.setEstado(new Stop(repro));		
	}
}