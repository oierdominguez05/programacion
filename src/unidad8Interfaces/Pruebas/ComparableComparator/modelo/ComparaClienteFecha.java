package unidad8Interfaces.Pruebas.ComparableComparator.modelo;

import java.util.Comparator;

public class ComparaClienteFecha implements Comparator<Pedido> {

	@Override
	public int compare(Pedido o1, Pedido o2) {
		int opcion1 = o1.getCliente().compareToIgnoreCase(o2.getCliente());

		if (opcion1 != 0) {
			return opcion1;
		}
		return o1.getFechaPedido().compareTo(o2.getFechaPedido());
	}

}
