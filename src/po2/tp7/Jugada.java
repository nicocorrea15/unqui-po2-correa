package po2.tp7;

public abstract class Jugada {

	public abstract int prioridad();

	public abstract int valor();

	public boolean leGanaA(Jugada otra) {

		if (this.prioridad() > otra.prioridad()) {
			return true;
		}

		if (this.prioridad() == otra.prioridad()) {
			return this.valor() > otra.valor();
		}

		return false;
	}
}