package Unidad10Colecciones.EjerciciosClase.ej10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Temperatura> temperaturas = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar una aplicación que simula el registro de las temperaturas, a lo
		 * largo de un día, en una estación meteorológica. La aplicación mostrará un
		 * menú con las opciones: 1. Nuevo registro (que introduciremos manualmente,
		 * aunque se supone que, en el sistema original, estaría controlado por un
		 * reloj). 2. Listar registros. 3. Mostrar estadística (con los valores máximo,
		 * mínimo y promedio de las temperaturas registradas hasta el momento desde la
		 * primera lectura del día). 4. Salir.
		 */

		int opcion = 0;

		while (opcion != 4) {
			System.out.println("MENÚ" + "1. Nuevo registro .\r\n" + "2. Listar registros.\r\n"
					+ "3. Mostrar estadística (con los valores máximo, mínimo y promedio de las\r\n"
					+ "temperaturas registradas hasta el momento desde la primera lectura\r\n" + "del día).\r\n"
					+ "4. Salir.");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				registro();

			}

		}

	}

	static void registro() {
		System.out.println("Introduce la temperatura");
		double temp = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce la hora");
		LocalTime hora = LocalTime.now();
		temperaturas.add(new Temperatura(temp, hora));

	}

}
