package unidad8Interfaces.EjRepasoComparableComparator.modelo;

import java.util.Comparator;

public class ComparaFechaNombre implements Comparator<Object>{

	
	
	public int compare(Object o1, Object o2) {
		
int orden = ((Pedidoso)o1).getCliente().compareTo(((Pedido)o2).getCliente());

	if (orden != 0) {
		return orden;
	}
	
		
		
		}
	
	
	
}
