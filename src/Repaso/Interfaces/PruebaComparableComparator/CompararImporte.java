package Repaso.Interfaces.PruebaComparableComparator;

import java.util.Comparator;

public class CompararImporte implements Comparator<Pedidos> {

	
	
	@Override
	public int compare(Pedidos o1, Pedidos o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getImporteTotal(),o1.getImporteTotal());
	}

}
