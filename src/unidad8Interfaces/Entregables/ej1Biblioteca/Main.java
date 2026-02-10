package unidad8Interfaces.Entregables.ej1Biblioteca;

import unidad8Interfaces.ej1Biblioteca.modelo.Libro;
import unidad8Interfaces.ej1Biblioteca.modelo.Revista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se quiere informatizar una biblioteca. Crea las clases Publicación, Libro y
		 * Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
		 * características comunes de las revistas y de los libros son el código ISBN,
		 * el título, y el año de publicación. Los libros tienen además un atributo
		 * prestado. Cuando se crean los libros, no están prestados. Las revistas tienen
		 * un número. La clase Libro debe implementar la interfaz Prestable que tiene
		 * los métodos presta, devuelve y estaPrestado.
		 */
		
		Libro libro = new Libro(123456, "Lenguaje de Marcas", 2019);
		
		Revista revista = new Revista(45678, "Programacion", 0, 2);

		libro.presta();
		System.out.println("Libro prestado? " + libro.estaPrestado());
		libro.devuelve();
		
		
	}

}
