package po2.tp7;

public class Trio extends Jugada {

	private int valor;

	public Trio(int valor) {
		this.valor = valor;
	}

	@Override
	public int prioridad() {
		return 1;
	}

	@Override
	public int valor() {
		return valor;
	}
}
