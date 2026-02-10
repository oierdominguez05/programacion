package unidad8Interfaces.Pruebas.GestionBiblioteca.modelo;

import java.util.Comparator;

public class CompararTitulo implements Comparator<Publicacion> {

	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
