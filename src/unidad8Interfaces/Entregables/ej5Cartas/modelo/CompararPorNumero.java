package unidad8Interfaces.Entregables.ej5Cartas.modelo;

import java.util.Comparator;

public class CompararPorNumero implements Comparator<Carta> {

	@Override
	public int compare(Carta c1, Carta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}
