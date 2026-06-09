package po2.tp8.state.Reproductor;

public class Reproductor {
	
	private EstadoReproductor estado; 
	private Song song;
	
	public Reproductor(Song song) {
	    this.song = song;
	    this.estado = new Stop(this);
	}
	
	public EstadoReproductor getEstado() {
		return estado;
	}
	
	public Song getSong() {
		return song;
	}
	
	public void play() {
		estado.play();
	}
	
	public void pause() {
		estado.pause();
	}
	
	public void stop() {
		estado.stop();
	}
	
	public void setEstado(EstadoReproductor nuevoEstado) {
		estado = nuevoEstado;
	}

}
