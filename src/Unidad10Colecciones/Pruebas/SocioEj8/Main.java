package Unidad10Colecciones.Pruebas.SocioEj8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static TreeMap<String, Socio> socios = new TreeMap<>();
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		while (opcion != 6) {

			System.out.println(
					"1. Alta; 2. Baja; 3. Modificación; 4. Listado por DNI; 5. Listado por antigüedad, 6. Salir. ");
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
			if (opcion == 5) {
				ordenar();
			}

		}
		salir();

	}

	public static void alta() {
		System.out.println("Introduce el dni");
		String dni = teclado.nextLine();
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la fecha");
		String fecha = teclado.next();

		Socio s = new Socio(dni, nombre, fecha);
		socios.put(dni, s);
	}

	public static void baja() {
		System.out.println("Introduce el dni:");
		String dniBaja = teclado.nextLine();
		if (socios.containsKey(dniBaja)) {
			socios.remove(dniBaja);
			System.out.println("Usuario eliminado");
		} else {
			System.out.println("Usuario no encontrado");
		}

	}

	public static void modificar() {

		System.out.println("Introduce el dni a modificar");

	}

	public static void ordenar() {
		System.out.println("Ordenado por dni");
		for (String n : socios.keySet()) {
			System.out.println(n);
		}

	}

	public static void salir() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("socios.txt"));
			for (String n : socios.keySet()) {
				bw.write(n);
				bw.newLine();
			}
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
