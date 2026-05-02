package unidad9FicherosDeTexto.Pruebas.ListaClientes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que gestione una lista de clientes muy sencilla. De cada
		 * cliente solo se guardará:
		 * 
		 * DNI
		 * 
		 * Nombre
		 * 
		 * Saldo
		 * 
		 * El programa debe mostrar este menú:
		 * 
		 * Código 1. Añadir cliente 2. Eliminar cliente por DNI 3. Mostrar clientes 4.
		 * Salir Requisitos: Los clientes se guardan en un ArrayList.
		 * 
		 * Al añadir un cliente, se inserta ordenado por DNI.
		 * 
		 * Al eliminar, se busca por DNI y se borra.
		 * 
		 * Al mostrar, se imprime DNI, nombre y saldo.
		 * 
		 * Al salir, se guardan los datos en un fichero clientes.txt.
		 * 
		 * Al arrancar, se cargan los datos desde ese fichero.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("1. Añadir cliente\r\n" + "2. Eliminar cliente por DNI\r\n" + "3. Mostrar clientes\r\n"
				+ "4. Salir\r\n" + "");

		BufferedWriter bw = null;
		ArrayList<String> usuario1 = new ArrayList<>();
		int opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			teclado.nextLine();
			System.out.println("Dime el DNI");
			String dni = teclado.nextLine();
			System.out.println("Dime el nombre");
			String nombre = teclado.nextLine();
			System.out.println("Dime el saldo");
			double saldo = teclado.nextDouble();

			String saldoStr = saldo + "";

			String usuario = dni + ";" + nombre + ";" + saldo;
			String[] u = split
			usuario1.add(usuario);
			
			

		}

	}

	private static String[] split(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
