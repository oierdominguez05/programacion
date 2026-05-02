package Unidad10Colecciones.EjerciciosClase.ej12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Academico> academia = new TreeMap<>();

		nuevoAcademico(academia, new Academico("Oier", 2025), 'A');
		nuevoAcademico(academia, new Academico("Oier", 2021), 'T');
		nuevoAcademico(academia, new Academico("Alberto", 2026), 'H');
		nuevoAcademico(academia, new Academico("Ander", 2023), 'k');
		nuevoAcademico(academia, new Academico("Ibai", 2024), 'l');
		
		CompararNombreAnio comparator = new CompararNombreAnio();
		List<Academico> lista1 = academia.values().stream().sorted(comparator).toList();
		System.out.println(lista1);
		for(Entry<Character, Academico> entry : academia.entrySet()) {
			System.out.println("Letra: " + entry.getKey() + " Academico: " + entry.getValue());
		}
	}

	public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {

		if (letra >= 'A' && letra <= 'z') {
			academia.put(letra, nuevo);
			return true;
		}
		System.out.println("El caracter: " + letra + " no es una letra");
		return false;

	}

}
