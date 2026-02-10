package Repaso.Interfaces.PruebaComparableComparator;

import java.util.Comparator;

public class ComparatorClienteFecha implements Comparator<Pedidos>{

	@Override
	public int compare(Pedidos o1, Pedidos o2) {
		int resultado = o1.getCliente().compareTo(o2.getCliente());
		if(resultado != 0) return resultado;
		
		double resultado1 = o1.getFechaPedido().compareTo(o2.getFechaPedido());
		return (int) resultado1;
	}

}
