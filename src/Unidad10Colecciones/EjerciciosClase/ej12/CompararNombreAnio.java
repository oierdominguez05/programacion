package Unidad10Colecciones.EjerciciosClase.ej12;

import java.util.Comparator;

public class CompararNombreAnio implements Comparator<Academico> {

	@Override
	public int compare(Academico o1, Academico o2) {
		int resultado1 = o1.getNombre().compareToIgnoreCase(o2.getNombre());
		if (resultado1 == 0) {
			return o1.getAnioIngreso() - o2.getAnioIngreso();
		}
		return resultado1;
	}

}
