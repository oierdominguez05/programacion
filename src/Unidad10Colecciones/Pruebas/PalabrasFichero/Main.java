package Unidad10Colecciones.Pruebas.PalabrasFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static BufferedReader br = null;
	static Scanner teclado = new Scanner(System.in);
	static BufferedWriter bw = null;
	static ArrayList<String> palabras = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 📘 Ejercicio: Gestión de una lista de palabras desde un fichero 🎯 Objetivo
		 * Crear un programa en Java que:
		 * 
		 * Lea un fichero de texto llamado palabras.txt.
		 * 
		 * Guarde cada línea en un ArrayList<String>.
		 * 
		 * Permita:
		 * 
		 * Eliminar una palabra concreta (remove)
		 * 
		 * Eliminar todas las palabras que cumplan una condición (removeIf)
		 * 
		 * Comprobar si una palabra existe (contains)
		 * 
		 * Guarde el resultado final en un fichero nuevo llamado resultado.txt.
		 */

		try {
			br = new BufferedReader(new FileReader("palabra.txt"));
			String linea = br.readLine();
			if (linea == null) {
				System.out.println("El archivo esta vacio");
				return;
			} else {
				System.out.println("El archivo no esta vacio");

			}
			palabras.add(linea);

			while ((linea = br.readLine()) != null) {
				palabras.add(linea);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		int opcion = 0;

		while (opcion != 4) {

			System.out.println("1 Eliminar una palabra concreta (remove)\r\n" + "		 * \r\n"
					+ "		 * 2 Eliminar todas las palabras que cumplan una condición (removeIf)\r\n" + "		 * \r\n"
					+ "		 * 3 Comprobar si una palabra existe (contains)\r\n" + "		 * \r\n"
					+ "		 * 4 Guarde el resultado final en un fichero nuevo llamado resultado.txt.");
			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				eliminarPalabra();
			}
			if (opcion == 2) {
				comprobarPalabra();
			}

		}
		guardar();

	}

	public static void eliminarPalabra() {

		System.out.println("Introduce la palabra a eliminar");
		String eliminar = teclado.nextLine();
		String linea;
		if (palabras.remove(eliminar)) {
			System.out.println("Palabra eliminada.");
		} else {
			System.out.println("La palabra no estaba en la lista.");
		}

	}

	public static void comprobarPalabra() {
		System.out.println("Introduce la palabra para ver si existe");
		String palabraExiste = teclado.nextLine();

		if (palabras.contains(palabraExiste)) {
			System.out.println("La palabra si existe");
		} else {
			System.out.println("La palabra no existe");
		}

	}

	public static void guardar() {

		try {
			bw = new BufferedWriter(new FileWriter("resultadoPalabra.txt", true));

			for (String s : palabras) {
				bw.write(s);
				bw.newLine();
			}

			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
