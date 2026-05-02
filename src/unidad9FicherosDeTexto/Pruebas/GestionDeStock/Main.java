package unidad9FicherosDeTexto.Pruebas.GestionDeStock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static ArrayList<Producto> productos = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);
	static BufferedReader br = null;
	static BufferedWriter bw = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarInicio();

		int opcion = 0;

		while (opcion != 6) {
			System.out.println("MENÚ: 1Añadir producto\r\n" + "\r\n" + "2Eliminar producto por código\r\n" + "\r\n"
					+ "3Modificar stock de un producto\r\n" + "\r\n" + "4Mostrar productos ordenados por precio\r\n"
					+ "\r\n" + "5Mostrar productos con stock bajo (menos de 5 unidades)\r\n" + "\r\n" + "6Salir");
			System.out.println("Stock actual");
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			if (opcion == 1) {
				anadir();
			}
			if (opcion == 2) {
				eliminar();
			}
			if (opcion == 3) {
				modificarStock();
			}
			if (opcion == 4) {
				ordenado();
			}
			if(opcion == 5) {
				
			}

		}
		salir();
	}

	static void anadir() {
		System.out.println("Dime el codigo");
		String codigo = teclado.nextLine();
		System.out.println("Dime el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Dime el precio");
		double precio = teclado.nextDouble();
		System.out.println("Diem el stock");
		int stock = teclado.nextInt();

		productos.add(new Producto(codigo, nombre, precio, stock));

	}

	static void eliminar() {
		System.out.println("Codigo de producto a eliminar");
		String codigoElim = teclado.nextLine();

		productos.removeIf(r -> r.getCodigo().equals(codigoElim));

	}

	static void modificarStock() {
		System.out.println("Dime el codigo del producto");
		String cod = teclado.nextLine();
		System.out.println("Dime el nuevo stock");
		int nuevoStock = teclado.nextInt();

		for (Producto p : productos) {
			if (p.getCodigo().equals(cod)) {
				p.setStock(nuevoStock);
			}
		}

	}

	static void ordenado() {
		productos.sort(Comparator.comparing(Producto::getPrecio));

	}

	static void salir() {
		try {
			bw = new BufferedWriter(new FileWriter("stock.txt"));
			for(Producto p : productos) {
				bw.write(p.toString());
				bw.newLine();
			}
			System.out.println("Productos guardados, saliendo!");
			
			if (br != null) {
				br.close();
			}
			if (bw != null) {
				bw.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void bajoStock() {
		try {
			br = new BufferedReader(new FileReader("stock.txt"));
			String linea;
			while((linea = br.readLine())!= null) {
				String[] p = linea.split(";");
				productos.removeIf(r -> r.getStock() <= 5);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	static void mostrarInicio() {
		try {
			br = new BufferedReader(new FileReader("stock.txt"));
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] p = linea.split(";");
				productos.add(new Producto(p[0], p[1], Double.parseDouble(p[2]), Integer.parseInt(p[3])));
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
