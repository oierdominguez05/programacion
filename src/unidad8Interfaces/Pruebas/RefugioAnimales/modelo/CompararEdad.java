package unidad8Interfaces.Pruebas.RefugioAnimales.modelo;

import java.util.Comparator;

public class CompararEdad implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		return  Integer.compare(o1.getEdad(), o2.getEdad());
	}

	
	
	
	
}
