package unidad9FicherosDeTexto.Entregables.ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<String> contactos = new ArrayList<>();

		int numPersonas = 0;
		BufferedWriter bw = null;
		BufferedReader br = null;
		boolean salir = false;

		try {
			br = new BufferedReader(new FileReader("contactos.txt"));
			String linea2;
			while ((linea2 = br.readLine()) != null) {
				contactos.add(linea2);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		while (!salir) {
			System.out.println(
					"1. Nuevo contacto.\r\n" + "2. Buscar por nombre.\r\n" + "3. Mostrar todos.\r\n" + "4. Salir");
			int opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {

			case 1:
				if (contactos.size() >= 20) {
					System.out.println("Agenda llena.");
					break;
				}
				System.out.println("Dime el nombre:");
				String nombre = teclado.nextLine();
				boolean existe = false;
				for (String c : contactos) {
					if (c.toLowerCase().startsWith(nombre.toLowerCase() + ":")) {
						existe = true;
						break;
					}
				}
				if (existe) {
					System.out.println("Ese nombre ya existe.");
					break;
				}
				System.out.println("Dime el telefono");
				String telefono = teclado.nextLine();

				contactos.add(nombre + ":" + telefono);
				System.out.println("CONTACTO AÑADIDO");
				break;
			case 2:
				System.out.print("Introduce texto a buscar: ");
				String buscar = teclado.nextLine().toLowerCase();
				boolean encontrado = false;
				for (String c : contactos) {
					String nombreC = c.split(":")[0].toLowerCase();
					if (nombreC.contains(buscar)) {
						System.out.println(c);
						encontrado = true;
					}
				}
				if (!encontrado) {
					System.out.println("No se encontraron coincidencias.");
				}
				break;
			case 3:
				System.out.println("Se mostrarán todos los nombres y telefonos ordenados alfabeticamente");
				try {
					BufferedReader leerTodo = new BufferedReader(new FileReader("contactos.txt"));
					String linea1;

					while ((linea1 = leerTodo.readLine()) != null) {
						contactos.add(linea1);
					}
					leerTodo.close();

					Collections.sort(contactos);
					for (String c : contactos) {
						System.out.println(c);

					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try (BufferedWriter bw1 = new BufferedWriter(new FileWriter("contactos.txt"))) {
					for (String c : contactos) {
						bw1.write(c);
						bw1.newLine();
					}
				} catch (IOException e) {
					System.out.println("Error al guardar.");
				}
				System.out.println("Saliendo");
				salir = true;
				break;
			}

		}
	}
}
