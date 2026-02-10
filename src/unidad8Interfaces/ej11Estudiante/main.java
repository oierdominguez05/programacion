package unidad8Interfaces.ej11Estudiante;

import java.util.Arrays;

import unidad8Interfaces.ej11Estudiante.modelo.Estudiante;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una clase Estudiante con atributos nombre y promedio. Implementa la
		 * interfaz Comparable para ordenar a los estudiantes por su promedio. Crea un
		 * array de estudiantes y ordénalos usando Arrays.sort().
		 */

		Estudiante[] estudiantes = { new Estudiante("Oier", 17.2), new Estudiante("Paco", 4.2),
				new Estudiante("Juan", 18.9), new Estudiante("Pepe", 22.8) };

		Arrays.sort(estudiantes);

		System.out.println("Orden por promedio" + Arrays.toString(estudiantes));
	}

}
