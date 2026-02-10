package unidad8Interfaces.Pruebas.RefugioAnimales.modelo;

import java.util.Comparator;

public class CompararNombre implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
