package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

import java.util.Comparator;

public class ComparaAnios implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return Integer.compare(o1.getAnioFabricacion(), o2.getAnioFabricacion());
	}

	
	

}
