package unidad8Interfaces.Pruebas.TallerMecanico.modelo;

import java.util.Comparator;

public class CompararMarca implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return o1.getMarca().compareToIgnoreCase(o2.getMarca());
	}

}
