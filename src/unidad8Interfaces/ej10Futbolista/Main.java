package unidad8Interfaces.ej10Futbolista;

import java.util.ArrayList;
import java.util.Collections;

import unidad8Interfaces.ej10Futbolista.modelo.Futbolista;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad
		 * y número de goles. Implementar: • Un constructor y los métodos toString() y
		 * equals() (este último basado en el DNI). • La interfaz Comparable con un
		 * criterio de ordenación basado también en el DNI. • Un comparador para hacer
		 * ordenaciones basadas en el nombre y otro basado en la edad. Crear un array
		 * con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
		 */

		
		Futbolista futbolista = new Futbolista("12T", "Oier", 20, 4);
		ArrayList<Futbolista> persona = new ArrayList<>();
		persona.add(new Futbolista("123G", "Manuel", 32, 3));
		persona.add(new Futbolista("1234S", "Miguel", 43, 7));
		persona.add(new Futbolista("123456U", "Aitor", 22, 6));
		
		Collections.sort(persona);
		System.out.println(persona);
		
	}

}
