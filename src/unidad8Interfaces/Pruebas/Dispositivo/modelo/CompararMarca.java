package unidad8Interfaces.Pruebas.Dispositivo.modelo;

import java.util.Comparator;

public class CompararMarca implements Comparator<Dispositivo>{

	@Override
	public int compare(Dispositivo o1, Dispositivo o2) {
		return o1.getMarca().compareToIgnoreCase(o2.getMarca());
	}

}
