package unidad9FicherosDeTexto.Pruebas.BancoEj9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Cliente> clientes = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		while (opcion != 4) {
			System.out
					.println("1. Alta cliente.\r\n" + "2. Baja cliente.\r\n" + "3. Listar clientes.\r\n" + "4. Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				alta();
			}
			if (opcion == 2) {
				baja();
			}
			if (opcion == 3) {
				listar();
			}

		}
		salir();

	}

	public static void alta() {
		System.out.println("Introduce el dni");
		String dni = teclado.nextLine();
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Introduce la fecha de nacimiento");
		String fecha = teclado.nextLine();
		System.out.println("Introduce el saldo");
		double saldo = teclado.nextDouble();

		Cliente c = new Cliente(dni, nombre, fecha, saldo);
		clientes.add(c);
	}

	public static void baja() {
		System.out.println("introduce el dni");
		String bajaDNI = teclado.nextLine();
		clientes.removeIf(r -> r.getDni().equals(bajaDNI));

	}

	public static void listar() {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double suma = 0;
		for (Cliente c : clientes) {
			
			System.out.println(c);
			if(c.getSaldo() < min) {
				min = c.getSaldo();
			}
			if(c.getSaldo() > max) {
				max = c.getSaldo();
			}
			suma += c.getSaldo();
			
			
		}
		System.out.println("Saldo maximo: " + max);
		System.out.println("Saldo minimo: " + min);
		System.out.println("Media: " + (suma / clientes.size()));

	}
	
	public static void salir() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.txt"));
			
			for(Cliente s : clientes) {
				bw.write(s.toString());
				bw.newLine();
			}
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
