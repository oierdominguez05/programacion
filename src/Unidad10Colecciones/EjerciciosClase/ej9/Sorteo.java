package Unidad10Colecciones.EjerciciosClase.ej9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo<T> {
	private Set<T> elementos = new HashSet<>();

	public boolean add(T elemento) {
		return elementos.add(elemento);
	}

	public Set<T> premiados(int cantPremiados) {
		ArrayList<T> lista = new ArrayList<>(elementos);
		Collections.shuffle(lista);
		Set<T> resultado = new HashSet<>();
		for (int i = 0; i < cantPremiados && i < lista.size(); i++) {
			resultado.add(lista.get(i));
		}
		return resultado;

	}
	
	
}
