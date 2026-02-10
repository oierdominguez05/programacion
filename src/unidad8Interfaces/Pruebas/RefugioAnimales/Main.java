package unidad8Interfaces.Pruebas.RefugioAnimales;

import java.util.Arrays;

import unidad8Interfaces.Pruebas.RefugioAnimales.modelo.Animal;
import unidad8Interfaces.Pruebas.RefugioAnimales.modelo.CompararEdad;
import unidad8Interfaces.Pruebas.RefugioAnimales.modelo.CompararNombre;
import unidad8Interfaces.Pruebas.RefugioAnimales.modelo.Gato;
import unidad8Interfaces.Pruebas.RefugioAnimales.modelo.Perro;

public class Main {

	private static Animal[] animal = new Animal[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * EJERCICIO: Gestión de Animales en un Refugio Un refugio quiere gestionar los
		 * animales que tiene. Hay distintos tipos, pero todos comparten características
		 * comunes.
		 * 
		 * 🟩 1. Clase base: Animal Todos los animales tienen:
		 * 
		 * nombre (String)
		 * 
		 * edad (int)
		 * 
		 * peso (double)
		 * 
		 * Y deben poder mostrarse por pantalla (toString()).
		 * 
		 * 🟩 2. Tipos de animales 🐶 Perro Además de lo común:
		 * 
		 * raza (String)
		 * 
		 * método ladrar()
		 * 
		 * 🐱 Gato Además de lo común:
		 * 
		 * color (String)
		 * 
		 * método maullar()
		 * 
		 * 🟩 3. Interfaz: Adoptable Algunos animales pueden ser adoptados.
		 * 
		 * java public interface Adoptable { void adoptar(); } Los perros implementan
		 * Adoptable
		 * 
		 * Los gatos también implementan Adoptable
		 * 
		 * 🟩 4. Comparadores Crear dos comparadores:
		 * 
		 * CompararEdad → ordena por edad (menor a mayor)
		 * 
		 * CompararNombre → ordena alfabéticamente por nombre
		 * 
		 * 🟩 5. Requisitos del programa (main) En el main:
		 * 
		 * Crear un array fijo de tamaño 0 e ir ampliándolo con Arrays.copyOf().
		 * 
		 * Añadir varios perros y gatos.
		 * 
		 * Mostrar todos los animales.
		 * 
		 * Llamar a métodos específicos según el tipo:
		 * 
		 * si es Perro → ladrar()
		 * 
		 * si es Gato → maullar()
		 * 
		 * Llamar a adoptar() en todos los que implementen Adoptable.
		 * 
		 * Ordenar por edad y mostrar.
		 * 
		 * Ordenar por nombre y mostrar.
		 */

		Gato gato = new Gato("Pepe", 6, 23, "Marron");
		Gato gato1 = new Gato("Firulais", 2, 27, "Amarillo");
		Gato gato2 = new Gato("Chispas", 8, 33, "Negro");

		Perro perro = new Perro("Paco", 4, 12, "Pequeño");
		Perro perro1 = new Perro("Firulais", 4, 10, "Grande");
		Perro perro2 = new Perro("Oier", 4, 12, "Mediano");

		aniadir(gato);
		aniadir(gato1);
		aniadir(gato2);
		aniadir(perro);
		aniadir(perro1);
		aniadir(perro2);

		for (Animal a : animal) {
			if (a instanceof Gato) {
				((Gato) a).maullar();
			}
			if (a instanceof Perro) {
				((Perro) a).ladrar();
			}
		}
		System.out.println("Comparar por edad");
		Arrays.sort(animal, new CompararEdad());
		mostrar();
		System.out.println("Comparar por nombre");
		Arrays.sort(animal, new CompararNombre());
		mostrar();
	}

	public static void aniadir(Animal a) {
		animal = Arrays.copyOf(animal, animal.length + 1);
		animal[animal.length - 1] = a;

	}

	public static void mostrar() {
		for (Animal i : animal) {
			System.out.println(i);
		}
	}

}
