package Unidad10Colecciones.EjerciciosClase.ej8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Socio> socio = new ArrayList<>();
	static BufferedWriter bw = null;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que
		 * deberá incluir el método equals(), la interfaz Comparable basada en el dni y
		 * el método antiguedad() . Implementar un programa que gestione los socios de
		 * un club guardando los datos en el fichero socios.dat. Al arrancar la
		 * aplicación, se leen los datos del fichero y se abre un menú con las opciones:
		 * 1. Alta; 2. Baja; 3. Modificación; 4. Listado por DNI; 5. Listado por
		 * antigüedad, y 6. Salir. Al salir de la aplicación se guardan en el fichero
		 * los datos actualizados.
		 */

		System.out.println("MENÚ: " + " 1. Alta " + " 2. Baja " + "3. Modificación " + "4. Listado por DNI "
				+ " 5. Listado por antigüedad " + "6. Salir");

		int opcion = 0;
		while (opcion != 6) {

			opcion = teclado.nextInt();
			teclado.nextLine();
			if (opcion == 1) {
				alta();
			}
			if (opcion == 2) {
				baja();
			}
			if (opcion == 3) {
				modificar();
			}
			if (opcion == 4) {
				listadoDNI();
			}
			if (opcion == 5) {
				listadoAntiguedad();
			}

		}
		guardarFichero();
		salir();
	}

	static void alta() {
		System.out.println("Dime el dni");
		String dni = teclado.nextLine();
		System.out.println("Dime el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Dime la fecha de alta");
		LocalDate fechaAlta = LocalDate.parse(teclado.nextLine());
		socio.add(new Socio(dni, nombre, fechaAlta));

	}

	static void baja() {
		System.out.println("DNI a eliminar");
		String dniElim = teclado.nextLine();

		socio.removeIf(r -> r.getDni().equals(dniElim));

	}

	static void modificar() {
		System.out.println("Dime el dni de usuario para modificar");
		String dni = teclado.nextLine();
		for (Socio s : socio) {
			if (s.getDni().equals(dni)) {
				System.out.println("Dime el nombre nuevo");
				String nombreNuevo = teclado.nextLine();
				s.setNombre(nombreNuevo);
				System.out.println("Dime fecha nueva");
				LocalDate fechaNueva = LocalDate.parse(teclado.nextLine());
				s.setFechaAlta(fechaNueva);
			}
		}

	}

	static void listadoDNI() {
		socio.sort(null);
		for (Socio s : socio) {
			System.out.println(s);
		}

	}

	static void listadoAntiguedad() {
		socio.sort((a, b) -> b.antiguedad() - a.antiguedad());
		for (Socio s : socio) {
			System.out.println(s);
		}

	}

	static void guardarFichero() {
		try {
			bw = new BufferedWriter(new FileWriter("socios.dat"));
			for (Socio s : socio) {
				bw.write(s.toString());
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	static void salir() {
		try {
			
			if(bw != null) {
				bw.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
