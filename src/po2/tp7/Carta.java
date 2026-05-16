package po2.tp7;

public class Carta {

	private int valor;
	private String palo;

	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	public boolean esMayorQue(Carta otraCarta) {
		return this.valor > otraCarta.getValor();
	}

	public boolean mismoPalo(Carta otraCarta) {
		return this.palo.equals(otraCarta.getPalo());
	}
}