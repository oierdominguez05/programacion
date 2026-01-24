package unidad8Interfaces.Ej9EdadCreciente;

import java.util.ArrayList;
import java.util.Collections;

import unidad8Interfaces.Ej9EdadCreciente.modelo.SocioEdadCreciente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar la interfaz Comparable en la clase Socio para que el criterio de
		 * ordenación natural sea de menor a mayor edad.
		 */
		SocioEdadCreciente socio = new SocioEdadCreciente(345, "Oier", 0);

		ArrayList<SocioEdadCreciente> creciente = new ArrayList<>();
		creciente.add(new SocioEdadCreciente(234, "Oier", 20));
		creciente.add(new SocioEdadCreciente(3829, "Paco", 45));
		creciente.add(new SocioEdadCreciente(567, "Aitor", 21));

		Collections.sort(creciente);
		System.out.println(creciente);

	}

}
