package po2.tp7;

public class Poker extends Jugada {

	private int valor;

	public Poker(int valor) {
		this.valor = valor;
	}

	@Override
	public int prioridad() {
		return 3;
	}

	@Override
	public int valor() {
		return valor;
	}
}
