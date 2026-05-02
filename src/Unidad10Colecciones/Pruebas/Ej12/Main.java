package Unidad10Colecciones.Pruebas.Ej12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static TreeMap<Character, Academico> academico = new TreeMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nuevoAcademico(academico, new Academico("Oier", 2005), 'O');
		nuevoAcademico(academico, new Academico("Alberto", 2014), 'P');
		nuevoAcademico(academico, new Academico("Iker", 2018), 'L');
		nuevoAcademico(academico, new Academico("Asier", 2024), 'R');

		System.out.println("Listado ordenado por nombre");
		academico.values().stream().sorted().forEach(System.out::println);

		System.out.println("Listado sin letra, ordenado por nombre y año");
		academico.values().stream().sorted(new ComparatorNombreAño()).forEach(System.out::println);

		System.out.println("Ordenado por letra");
		for (Character a : academico.keySet()) {
			System.out.println(a + " -> " + academico.get(a));
		}

	}

	public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {

		if (!Character.isLetter(letra)) {

			return false;
		}
		if (academico.containsKey(letra)) {
			return false;
		}
		academico.put(letra, nuevo);
		return true;

	}

}
