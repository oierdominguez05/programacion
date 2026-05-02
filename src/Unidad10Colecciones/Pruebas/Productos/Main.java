package Unidad10Colecciones.Pruebas.Productos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static ArrayList<Producto> productos = new ArrayList<>();

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Leer el fichero productos.txt línea a línea.
		 * 
		 * Por cada línea, crear un objeto Producto con sus atributos.
		 * 
		 * Guardar todos los productos en una colección, preferiblemente un
		 * ArrayList<Producto>.
		 * 
		 * Una vez cargados:
		 * 
		 * Mostrar todos los productos.
		 * 
		 * Mostrar solo los productos de una categoría concreta (por ejemplo, "Fruta").
		 * 
		 * Calcular el precio medio de todos los productos.
		 * 
		 * Ordenar los productos por precio de menor a mayor y mostrarlos.
		 */

		try {
			BufferedReader br = new BufferedReader(new FileReader("productos.txt"));

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] prod = linea.split(";");
				Producto p = new Producto(prod[0], prod[1], prod[2]);
				productos.add(p);
			}

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Introduce la categoria");
		String categoria = teclado.nextLine();
		for (Producto pr : productos) {
			if (pr.getCategoria().equals(categoria)) {
				System.out.println(pr);
			}
		}

		System.out.println("Precio medio de los productos");
		double suma = 0;
		for (Producto s : productos) {
			double num = Double.parseDouble(s.getPrecio());
			suma += num;
		}
		System.out.println("Resultado: " + suma / productos.size());

		
		
		Collections.sort(productos);
		for(Producto i : productos) {
			System.out.println(i);
		}
		
	}
	
	
}
