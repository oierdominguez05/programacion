package unidad8Interfaces.Pruebas.Dispositivo.modelo;

import java.util.Comparator;

public class CompararPrecio implements Comparator<Dispositivo>{

	@Override
	public int compare(Dispositivo o1, Dispositivo o2) {
		return Double.compare(o1.getPrecio(), o2.getPrecio());
	}

}
