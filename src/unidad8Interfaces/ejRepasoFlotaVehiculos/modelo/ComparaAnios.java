package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

import java.util.Comparator;

public class ComparaAnios implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((Vehiculo)o1).getAnioFabricacion() - ((Vehiculo)o2).getAnioFabricacion();
	}
}
