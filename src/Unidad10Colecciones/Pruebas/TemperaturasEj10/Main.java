package Unidad10Colecciones.Pruebas.TemperaturasEj10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Temperatura> temperaturas = new ArrayList<>();

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		while (opcion != 4) {
			System.out.println("1. Nuevo registro .\r\n" + "2. Listar registros.\r\n"
					+ "3. Mostrar estadística (con los valores máximo, mínimo y promedio de las\r\n"
					+ "temperaturas registradas hasta el momento desde la primera lectura\r\n" + "del día).\r\n"
					+ "4. Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			if (opcion == 1) {
				añadir();
			}
			if (opcion == 2) {
				listar();
			}
			if (opcion == 3) {
				estadistica();
			}
		}
		salir();

	}

	public static void añadir() {
		System.out.println("Introduce la temperatura");
		double temperatura = teclado.nextDouble();
		Temperatura t = new Temperatura(temperatura, LocalTime.now());
		temperaturas.add(t);
	}

	public static void listar() {
		for (Temperatura s : temperaturas) {
			System.out.println(s);
		}

	}

	public static void estadistica() {

		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double suma = 0;

		for (Temperatura d : temperaturas) {
			if (d.getTemperatura() < min) {
				min = d.getTemperatura();
			}

		}
		System.out.println("Temperatura minima: " + min);

		for (Temperatura m : temperaturas) {
			if (m.getTemperatura() > max) {
				max = m.getTemperatura();
			}
		}
		System.out.println("Temperatura maxima: " + max);

		for (Temperatura s : temperaturas) {
			suma += s.getTemperatura();
		}
		double resultadoMedia = suma / temperaturas.size();
		System.out.println("La media es: " + resultadoMedia);
	}

	public static void salir() {

		try {

			String fecha = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd"));

			String nombreArchivo = "registros" + fecha + ".dat";

			java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(
					new java.io.FileOutputStream(nombreArchivo));

			oos.writeObject(temperaturas);

			oos.close();

			System.out.println("Datos guardados en el archivo: " + nombreArchivo);

		} catch (Exception e) {
			System.out.println("Error al guardar el archivo: " + e.getMessage());
		}
	}

}
