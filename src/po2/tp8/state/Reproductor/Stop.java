package po2.tp8.state.Reproductor;

public class Stop implements EstadoReproductor {
	
	private Reproductor repro;
	
	public Stop(Reproductor repo) {
		this.repro = repo;
	}
	
	public Reproductor getReproductor() {
		return repro;
	}

	@Override
	public void play() {
		repro.getSong().play();
		repro.setEstado(new Reproduciendo(repro));
	}

	@Override
	public void pause() {
		// error no hay musica reproduciendose
	}

	@Override
	public void stop() {
	    repro.getSong().stop();
	    repro.setEstado(new Stop(repro));
	}

}
