package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

import java.util.Comparator;

public class ComparaAlquileres implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		return (int) (((Vehiculo)o1).getAlquilerBase() - ((Vehiculo)o2).getAlquilerBase());
	}
}
