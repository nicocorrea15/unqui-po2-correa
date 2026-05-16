package po2.tp7;

public class Color extends Jugada {

	private int valor;

	public Color(int valor) {
		this.valor = valor;
	}

	@Override
	public int prioridad() {
		return 2;
	}

	@Override
	public int valor() {
		return valor;
	}
}