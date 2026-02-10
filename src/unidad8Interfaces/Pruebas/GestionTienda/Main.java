package unidad8Interfaces.Pruebas.GestionTienda;

import java.time.LocalDate;
import java.util.Arrays;

import unidad8Interfaces.Pruebas.GestionTienda.modelo.Categoria;
import unidad8Interfaces.Pruebas.GestionTienda.modelo.Producto;
import unidad8Interfaces.Pruebas.GestionTienda.modelo.CompararCategoriaNombre;
import unidad8Interfaces.Pruebas.GestionTienda.modelo.CompararPrecio;

public class Main {

	private static Producto[] producto = new Producto[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto(3, "Camiseta", 15.00, Categoria.ROPA, LocalDate.of(2022, 11, 20));
		Producto p2 = new Producto(1, "Televisor", 499.99, Categoria.ELECTRONICA, LocalDate.of(2023, 5, 10));
		Producto p3 = new Producto(2, "Manzanas", 2.99, Categoria.ALIMENTACION, LocalDate.of(2024, 1, 5));

		aniadir(p1);
		aniadir(p2);
		aniadir(p3);

	 Arrays.sort(producto, new CompararCategoriaNombre());
	 System.out.println("Orden por producto");
		mostrar();
		
		Arrays.sort(producto, new CompararPrecio());
		System.out.println("Orden por precio");
		mostrar();
	}

	public static void aniadir(Producto n) {
		producto = Arrays.copyOf(producto, producto.length + 1);
		producto[producto.length - 1] = n;
	}

	public static void mostrar() {
		for (Producto p : producto) {
			System.out.println(p);
		}
	}

}
