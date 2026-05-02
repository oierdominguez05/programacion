package unidad9FicherosDeTexto.Pruebas.ListaBasicaClientes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Cliente> clientes = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);
	static BufferedWriter bw = null;
	static BufferedReader br = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que gestione una lista de clientes. Cada cliente tendrá:
		 * 
		 * DNI
		 * 
		 * Nombre
		 * 
		 * Saldo
		 * 
		 * El programa mostrará este menú:
		 * 
		 * Código 1. Añadir cliente 2. Eliminar cliente por DNI 3. Mostrar clientes 4.
		 * Salir Los clientes se guardarán en un fichero llamado clientes.txt. Al
		 * arrancar, el programa cargará los clientes del fichero. Al salir, guardará
		 * los clientes actualizados.
		 */

		int opcion = 0;

		while (opcion != 4) {
			System.out.println("MENÚ 1. Añadir cliente\r\n" + "2. Eliminar cliente por DNI\r\n"
					+ "3. Mostrar clientes\r\n" + "4. Salir\r\n" + "");

			opcion = teclado.nextInt();
			teclado.nextLine();
			if (opcion == 1)
				cargar();
			if (opcion == 2)
				eliminar();
			if (opcion == 3)
				mostrar();
		}

		guardar();

	}

	static void cargar() {
		System.out.println("Dime el dni");
		String dni = teclado.nextLine();
		System.out.println("Dime el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Dime el saldo");
		double saldo = teclado.nextDouble();

		clientes.add(new Cliente(dni, nombre, saldo));
	}

	static void guardar() {
		try {
			bw = new BufferedWriter(new FileWriter("usuarios.txt"));
			for (Cliente c : clientes) {
				bw.write(c.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	static void eliminar() {
		System.out.println("DNI a eliminar");
		String dniElim = teclado.nextLine();
		clientes.removeIf(c -> c.dni.equals(dniElim));

	}

	static void mostrar() {

		for (Cliente e : clientes) {
			System.out.println(e.dni + "," + e.nombre + "," + e.saldo);
		}

	}

	static void cargarFichero() {
		try {
			br = new BufferedReader(new FileReader("usuarios.txt"));
			String linea;

			while ((linea = br.readLine()) != null) {
				String[] d = linea.split(";");
				clientes.add(new Cliente(d[0], d[1], Double.parseDouble(d[2])));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
