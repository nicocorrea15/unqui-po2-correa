package po2.tp8.state.Reproductor;

public class Pause implements EstadoReproductor {
	
	private Reproductor repro;
	
	public Pause(Reproductor repo) {
		this.repro = repo;
	}

	@Override
	public void play() {
		// error
	}

	@Override
	public void pause() {
		repro.setEstado(new Reproduciendo(repro));

	}

	@Override
	public void stop() {
		repro.getSong().stop();
		repro.setEstado(new Stop(repro));	

	}

}
