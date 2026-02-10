package unidad8Interfaces.Pruebas.GestionBiblioteca.modelo;

import java.util.Comparator;

public class CompararAnioPublicacion implements Comparator<Publicacion> {

	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		return Integer.compare(o1.getAñoPublicacion(), o2.getAñoPublicacion());
	}

}
