package unidad8Interfaces.Pruebas.TallerMecanico.modelo;

import java.util.Comparator;

public class CompararPrecio implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return Double.compare(o1.getPrecio() + o1.combustible.getCosteExtra(), o2.getPrecio() + o2.combustible.getCosteExtra());
	}

}
