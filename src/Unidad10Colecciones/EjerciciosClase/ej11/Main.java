package Unidad10Colecciones.EjerciciosClase.ej11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static HashSet<Automovil> automovil = new HashSet<>();
	static Scanner teclado = new Scanner(System.in);
	static BufferedWriter bw = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		while (opcion != 5) {
			System.out.println("MENÚ " + " 1. Introducir producto " + " 2. Dar de alta producto " + " 3. Dar de baja producto "
					+ " 4. Actualizar stock");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				introducir();
			}
			if (opcion == 2) {
				darAlta();
			}
			if (opcion == 3) {
				darBaja();
			}
			if (opcion == 4) {
				actualizarStock();
			}
		}
		guardar();

	}

	static void introducir() {

		System.out.println("Introduce el codigo");
		double codigo = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce el producto");
		String producto = teclado.nextLine();
		System.out.println("Introduce el true si esta en alta o false si esta en baja");
		boolean estado = teclado.nextBoolean();
		System.out.println("Introduce la cantidad de stock");
		int stock = teclado.nextInt();
	
			automovil.add(new Automovil(codigo, producto, estado, stock));
		

	}

	static void darAlta() {
		System.out.println("Introduce el codigo del producto");
		double codigoAlta = teclado.nextDouble();
		for (Automovil b : automovil) {
			if (b.getCodigo() == codigoAlta) {
				if (b.isEstado()) {
					System.out.println("Este producto ya esta dado de alta");
				} else {
					b.setEstado(false);
					System.out.println("PRODUCTO DADO DE ALTA");
				}
			}

		}
	}

	static void darBaja() {

		System.out.println("Introduce el codigo del producto");
		double codigoBaja = teclado.nextDouble();
		for (Automovil a : automovil) {
			if (a.getCodigo() == codigoBaja) {
				if (!a.isEstado()) {
					System.out.println("Este producto ya esta dado de baja");

				} else {
					a.setEstado(false);
					System.out.println("PRODUCTO DADO DE BAJA");
				}

			}
		}
	}

	static void actualizarStock() {
		System.out.println("Introduce el codigo del producto");
		double codStock = teclado.nextDouble();
		for (Automovil s : automovil) {
			if (s.getCodigo() == codStock) {
				System.out.println("Introduce el stock nuevo");
				int stockNuevo = teclado.nextInt();
				s.setStock(stockNuevo);
			}

		}

	}

	static void guardar() {

		try {
			bw = new BufferedWriter(new FileWriter("productos.txt"));
			for (Automovil g : automovil) {
				bw.write(g.toString());
				bw.newLine();
			}
			System.out.println("Guardando...");
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
