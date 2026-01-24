package unidad8Interfaces.ej7SocioNombre;

import java.util.ArrayList;
import java.util.Collections;


import unidad8Interfaces.ej7SocioNombre.modelo.SocioNombre;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Cambiar la implementación de la clase Socio para que su criterio de
		 * ordenación natural sea por orden alfabético creciente de nombres.
		 */
		
		
		SocioNombre socio = new SocioNombre(345, "Oier");

		ArrayList<SocioNombre> nom = new ArrayList<>();
		nom.add(new SocioNombre(234, "Oier"));
		nom.add(new SocioNombre(3829, "Paco"));
		nom.add(new SocioNombre(567, "Aitor"));

		Collections.sort(nom);
		System.out.println(nom);

	}

}
