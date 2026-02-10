package unidad8Interfaces.Pruebas.ComparableComparator.modelo;

import java.util.Comparator;

public class CompararFechaPedido implements Comparator<Pedido>{

	@Override
	public int compare(Pedido o1, Pedido o2) {
		return o1.getFechaPedido().compareTo(o2.getFechaPedido());
		
	}

}
