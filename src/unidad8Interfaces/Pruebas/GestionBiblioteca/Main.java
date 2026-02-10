package unidad8Interfaces.Pruebas.GestionBiblioteca;

import java.util.Arrays;

import unidad8Interfaces.GestionBiblioteca.modelo.CompararAnioPublicacion;
import unidad8Interfaces.GestionBiblioteca.modelo.CompararTitulo;
import unidad8Interfaces.GestionBiblioteca.modelo.Libro;
import unidad8Interfaces.GestionBiblioteca.modelo.Publicacion;
import unidad8Interfaces.GestionBiblioteca.modelo.Revista;

public class Main {

	private static Publicacion[] publicaciones;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		publicaciones = new Publicacion[0];
		Revista r1 = new Revista("Revista cientifica 1", 2024, 3);
		Revista r2 = new Revista("Revista cientifica 2", 2021, 2);
		Revista r3 = new Revista("Revista cientifica 3", 2026, 7);
		Libro l1 = new Libro("Libro 1", 2019, "Autor 1");
		Libro l2 = new Libro("Libro 2", 2013, "Autor 1");
		Libro l3 = new Libro("Libro 3", 2023, "Autor 2");
		
		anadirPublicacion(r1);
		anadirPublicacion(r2);
		anadirPublicacion(r3);
		anadirPublicacion(l1);
		anadirPublicacion(l2);
		anadirPublicacion(l3);
		
		for (Publicacion publicacion : publicaciones) {
			
			System.out.println(publicacion.toString());
			//CASTING
			if(publicacion instanceof Libro) {
				Libro libro = (Libro) publicacion;
				System.out.println(libro.toString());
			} else if (publicacion instanceof Revista) {
				Revista revista = (Revista) publicacion;
				System.out.println("Por publicacion");
				System.out.println(revista.toString());
				
			}
		}
		Arrays.sort(publicaciones, new CompararAnioPublicacion());
		System.out.println(Arrays.toString(publicaciones));
		
		Arrays.sort(publicaciones, new CompararTitulo());
		System.out.println(Arrays.toString(publicaciones));
	}

	public static Publicacion[] getPublicaciones() {
		return publicaciones;
	}

	
	public static void anadirPublicacion(Publicacion publicacion) {
		publicaciones = Arrays.copyOf(publicaciones, publicaciones.length + 1);
		publicaciones[publicaciones.length -1] = publicacion;
	}
	
}
