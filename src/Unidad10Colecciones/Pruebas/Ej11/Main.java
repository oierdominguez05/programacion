package Unidad10Colecciones.Pruebas.Ej11;

import java.io.*;
import java.util.*;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static TreeMap<String, Producto> inventario = new TreeMap<>();

	public static void main(String[] args) {

		cargarFichero();

		int opcion;
		do {
			System.out.println("GESTION DE TIENDA");
			System.out.println("1. Alta producto");
			System.out.println("2. Baja producto");
			System.out.println("3. Actualizar stock");
			System.out.println("4. Mostrar inventario");
			System.out.println("5. Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1 -> altaProducto();
			case 2 -> bajaProducto();
			case 3 -> actualizarStock();
			case 4 -> mostrarInventario();
			case 5 -> guardarFichero();
			default -> System.out.println("Opción no válida");
			}

		} while (opcion != 5);
	}

	static void altaProducto() {
		System.out.print("Codigo: ");
		String codigo = teclado.nextLine();

		if (inventario.containsKey(codigo)) {
			System.out.println("Ya existe un producto con ese codigo.");
			return;
		}

		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Stock inicial: ");
		int stock = Integer.parseInt(teclado.nextLine());

		inventario.put(codigo, new Producto(codigo, nombre, stock));
		System.out.println("Producto añadido.");
	}

	static void bajaProducto() {
		System.out.print("Codigo del producto a eliminar: ");
		String codigo = teclado.nextLine();

		if (inventario.remove(codigo) != null) {
			System.out.println("Producto eliminado.");
		} else {
			System.out.println("No existe ese producto.");
		}
	}

	static void actualizarStock() {
		System.out.print("Codigo del producto: ");
		String codigo = teclado.nextLine();

		Producto p = inventario.get(codigo);
		if (p == null) {
			System.out.println("No existe ese producto.");
			return;
		}

		System.out.print("Nuevo stock: ");
		int nuevoStock = Integer.parseInt(teclado.nextLine());
		p.setStock(nuevoStock);

		System.out.println("Stock actualizado.");
	}

	static void mostrarInventario() {
		System.out.println("INVENTARIO");
		for (Producto p : inventario.values()) {
			System.out.println(p);
		}
	}

	static void cargarFichero() {
		try (BufferedReader br = new BufferedReader(new FileReader("inventario.txt"))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				String codigo = partes[0];
				String nombre = partes[1];
				int stock = Integer.parseInt(partes[2]);

				inventario.put(codigo, new Producto(codigo, nombre, stock));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	static void guardarFichero() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.txt"))) {
			for (Producto p : inventario.values()) {
				bw.write(p.getCodigo() + ";" + p.getNombre() + ";" + p.getStock());
				bw.newLine();
			}
			System.out.println("Inventario guardado. Saliendo...");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
