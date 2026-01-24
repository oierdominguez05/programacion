package unidad8Interfaces.Ej8SocioDecreciente;

import java.util.ArrayList;
import java.util.Collections;

import unidad8Interfaces.Ej8SocioDecreciente.modelo.SocioEdadDecreciente;
import unidad8Interfaces.Ej9EdadCreciente.modelo.SocioEdadCreciente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A partir del comparador de socios basado en las edades crecientes, obtener
		 * otro que los ordene según edades decrecientes.
		 */

		SocioEdadDecreciente socio1 = new SocioEdadDecreciente(5677, "Oier", 0);

		ArrayList<SocioEdadDecreciente> decreciente = new ArrayList<>();
		decreciente.add(new SocioEdadDecreciente(2455, "Leo", 65));
		decreciente.add(new SocioEdadDecreciente(4849, "Unai", 22));
		decreciente.add(new SocioEdadDecreciente(89, "Ibai", 33));

		Collections.sort(decreciente);
		System.out.println(decreciente);

	}

}
