package Unidad10Colecciones.Pruebas.GestionEstudiantes;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Clase Estudiante Cada estudiante tendrá:
		 * 
		 * dni (String)
		 * 
		 * nombre (String)
		 * 
		 * nota (double)
		 * 
		 * Requisitos:
		 * 
		 * Implementar Comparable<Estudiante> ordenando por nombre.
		 * 
		 * Implementar equals() y hashCode() basados en el dni.
		 * 
		 * Método aprobado() que devuelve true si la nota ≥ 5.
		 * 
		 * 2. Estructuras de datos En el programa principal:
		 * 
		 * Crear un Map<String, Estudiante>, donde la clave es el DNI.
		 * 
		 * Crear 5 estudiantes y añadirlos al mapa mediante un método estático:
		 * 
		 * java static boolean nuevoEstudiante(Map<String, Estudiante> mapa, Estudiante
		 * e) Este método:
		 * 
		 * Devuelve false si el DNI ya existe.
		 * 
		 * Si no existe, lo añade y devuelve true.
		 * 
		 * 3. Listados que debe mostrar el programa A) Listado general (sin DNI)
		 * Convertir los valores del mapa en una lista.
		 * 
		 * Ordenar por nombre (orden natural).
		 * 
		 * Mostrar.
		 * 
		 * B) Listado por nota (de mayor a menor) Ordenar la lista con un Comparator que
		 * compare por nota descendente.
		 * 
		 * Mostrar.
		 * 
		 * C) Listado de aprobados Crear un Set<Estudiante> con solo los aprobados.
		 * 
		 * Mostrar el conjunto.
		 * 
		 * D) Listado con DNI Recorrer el mapa mostrando: DNI → nombre (nota)
		 */

		Map<String, Estudiante> mapa = new HashMap<>();

		Estudiante e1 = new Estudiante("123A", "Oier", 7.5);
		Estudiante e2 = new Estudiante("123A", "Unai", 6.7);
		
		
		nuevoEstudiante(mapa,e1);
		nuevoEstudiante(mapa, e2);
		
		mapa.forEach((dni, nombre) -> System.out.println(dni + ";" + nombre));
		
		
	}

	public static boolean nuevoEstudiante(Map<String, Estudiante> mapa, Estudiante e) {
		
		if(mapa.containsKey(e.getDni())) {
			return false;
		}
		
		mapa.put(e.getDni(), e);
		return true;
	}

}
