package po2.tp7;

import java.util.HashMap;
import java.util.Map;

public class PokerStatus {

	public Jugada verificar(
			Carta c1,
			Carta c2,
			Carta c3,
			Carta c4,
			Carta c5) {

		Carta[] cartas = {c1, c2, c3, c4, c5};

		Map<Integer, Integer> contador = new HashMap<>();

		boolean mismoPalo = true;
		String palo = cartas[0].getPalo();

		int mayorValor = 0;

		for (Carta carta : cartas) {

			int valor = carta.getValor();

			contador.put(valor,
					contador.getOrDefault(valor, 0) + 1);

			if (valor > mayorValor) {
				mayorValor = valor;
			}

			if (!carta.getPalo().equals(palo)) {
				mismoPalo = false;
			}
		}

		for (Integer valor : contador.keySet()) {

			int cantidad = contador.get(valor);

			if (cantidad == 4) {
				return new Poker(valor);
			}

			if (cantidad == 3) {
				return new Trio(valor);
			}
		}

		if (mismoPalo) {
			return new Color(mayorValor);
		}

		return new Nada();
	}
}