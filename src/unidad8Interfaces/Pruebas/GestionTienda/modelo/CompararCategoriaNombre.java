package unidad8Interfaces.Pruebas.GestionTienda.modelo;

import java.util.Comparator;

public class CompararCategoriaNombre implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		int categoria = o1.categoria.compareTo(o2.getCategoria());
		if(categoria != 0) {
			return categoria;
		}
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}
	
	

	
	
	
	
	
	
}
