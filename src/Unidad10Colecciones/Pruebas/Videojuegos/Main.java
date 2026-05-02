package Unidad10Colecciones.Pruebas.Videojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {

	static TreeMap<String, Double> videojuego = new TreeMap<>();
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El usuario introduce pares:
		 * 
		 * Código nombreVideojuego
		 *
		 * puntuación Hasta escribir FIN.
		 * 
		 * Luego el programa debe:
		 * 
		 * Mostrar los juegos ordenados por puntuación
		 * 
		 * Mostrar el juego con mejor puntuación
		 * 
		 * Mostrar cuántos juegos tienen más de 8 puntos
		 * 
		 * Permitir buscar un juego por nombre
		 */

		int opcion = 0;

		while (opcion != 5) {

			System.out.println("1 Añadir juego " + "2Mostrar los juegos ordenados por puntuación\r\n" + "\r\n"
					+ "3 Mostrar el juego con mejor puntuación\r\n" + "\r\n"
					+ "4 Mostrar cuántos juegos tienen más de 8 puntos\r\n" + "\r\n"
					+ " 5 Permitir buscar un juego por nombre" + "6 Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				añadir();
			}

		}

	}

	public static void añadir() {
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la puntuacion");
		double puntuacion = teclado.nextDouble();
		videojuego.put(nombre, puntuacion);

	}
	public static void ordenado() {
		List<String> juego = new ArrayList<>(videojuego.keySet());
		
	}

}
