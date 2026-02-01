package unidad8Interfaces.GestionBiblioteca.modelo;

import java.util.Comparator;

public class CompararAnioPublicacion implements Comparator<Publicacion> {

	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		// TODO Auto-generated method stub
		return o1.getAnio();
	}

}
