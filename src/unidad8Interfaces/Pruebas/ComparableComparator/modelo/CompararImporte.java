package unidad8Interfaces.Pruebas.ComparableComparator.modelo;

import java.util.Comparator;

public class CompararImporte implements Comparator<Pedido> {

	@Override
	public int compare(Pedido o1, Pedido o2) {
		return Double.compare(o1.getImporteTotal(), o2.getImporteTotal());
	}

}
