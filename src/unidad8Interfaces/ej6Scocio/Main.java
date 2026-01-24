package unidad8Interfaces.ej6Scocio;

import java.util.ArrayList;
import java.util.Collections;

import unidad8Interfaces.ej6Scocio.modelo.Socio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar la interfaz Comparable en la clase socio para que, por defecto,
		 * se ordene según los números de identificación -id- crecientes.
		 */

		Socio socio = new Socio(345, "Oier");

		ArrayList<Socio> lista = new ArrayList<>();
		lista.add(new Socio(234, "Oier"));
		lista.add(new Socio(3829, "Paco"));
		lista.add(new Socio(567, "Aitor"));

		Collections.sort(lista);
		System.out.println(lista);
	}

}
