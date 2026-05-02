package Unidad10Colecciones.Pruebas.Ej12;

import java.util.Comparator;

public class ComparatorNombreAño implements Comparator<Academico> {

	@Override
	public int compare(Academico o1, Academico o2) {
		int resultado = o1.getNombre().compareTo(o2.getNombre());
		if (resultado == 0) {
			return o1.getAñoIngreso() - o2.getAñoIngreso();
		}
		return resultado;
	}

}
