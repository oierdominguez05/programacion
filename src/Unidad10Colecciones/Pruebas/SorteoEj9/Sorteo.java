package Unidad10Colecciones.Pruebas.SorteoEj9;

import java.util.HashSet;
import java.util.Set;

public class Sorteo<T> {

	private Set<T> elementos = new HashSet<>();

	public boolean add(T elemento) {
		return elementos.add(elemento);
	}

	public Set<T> premiados(int numPremiados) {
		if (numPremiados > elementos.size()) {
			throw new IllegalArgumentException("No hay suficientes elementos.");
		}

		Set<T> resultado = new HashSet<>();
		Object[] array = elementos.toArray();

		while (resultado.size() < numPremiados) {
			int pos = (int) (Math.random() * array.length);
			resultado.add((T) array[pos]);
		}

		return resultado;
	}
}
