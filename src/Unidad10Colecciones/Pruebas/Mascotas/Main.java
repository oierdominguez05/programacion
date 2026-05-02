package Unidad10Colecciones.Pruebas.Mascotas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static TreeSet<Mascota> mascota = new TreeSet<>();
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Gestión de un censo de mascotas Crea un programa que permita registrar
		 * mascotas con estos datos:
		 * 
		 * nombre
		 * 
		 * especie
		 * 
		 * edad
		 * 
		 * El usuario podrá:
		 * 
		 * Añadir mascota
		 * 
		 * Eliminar mascota
		 * 
		 * Buscar mascotas por especie
		 * 
		 * Mostrar todas ordenadas por edad
		 * 
		 * Mostrar cuántas mascotas hay de cada especie
		 */

		int opcion = 0;

		while (opcion != 6) {
			System.out.println("1 Añadir mascota\r\n" + "\r\n" + "2 Eliminar mascota\r\n" + "\r\n"
					+ "3 Buscar mascotas por especie\r\n" + "\r\n" + "4 Mostrar todas ordenadas por edad\r\n" + "\r\n"
					+ "5 Mostrar cuántas mascotas hay de cada especie" + "6 Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				añadir();
			} 
			if(opcion == 2) {
				eliminar();
			}
			if(opcion == 3) {
				buscarEspecie();
			}
			if(opcion == 4) {
				ordenado();
			}
		}

	}

	public static void añadir() {
		System.out.println("Dime el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Dime la especie");
		String especie = teclado.nextLine();
		System.out.println("Dime la edad");
		int edad = teclado.nextInt();
		Mascota m = new Mascota(nombre, especie, edad);
		mascota.add(m);
		System.out.println("Mascota añadida");
	}

	public static void eliminar() {
		System.out.println("Introduce el nombre de la mascota");
		String eliminarMasc = teclado.nextLine();
		mascota.removeIf(m -> m.getNombre().equals(eliminarMasc));
		System.out.println("BORRADO");
	}
	
	public static void buscarEspecie() {
		System.out.println("Introduce el nombre de la especie");
		String nomEspecie = teclado.nextLine();
		for(Mascota a : mascota) {
			if(a.getEspecie().equals(nomEspecie)) {
				System.out.println("Especies encontradas: " + a);
			}
		}
		
	}
	
	public static void ordenado() {
		System.out.println("Ordenado por edad");
		for(Mascota mas : mascota) {
		
		System.out.println(mas);
		}
		
	}
	
	
}
