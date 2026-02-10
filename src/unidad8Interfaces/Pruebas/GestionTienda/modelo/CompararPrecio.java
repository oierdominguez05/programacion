package unidad8Interfaces.Pruebas.GestionTienda.modelo;

import java.util.Comparator;

public class CompararPrecio implements Comparator<Producto>{

	
	
	
	
	
	@Override
	public int compare(Producto o1, Producto o2) {
		return Double.compare(o2.getPrecio(), o1.getPrecio());
	}

}
