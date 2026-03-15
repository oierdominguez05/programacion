package unidad9FicherosDeTexto.Entregables.ej5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("MENÚ" + " \n1. Registrar nueva temperatura.\r\n" + "2. Mostrar historial de registros.\r\n"
				+ "3. Salir");
		int opcion = teclado.nextInt();

		do {
			switch (opcion) {

			case 1:
				registrar(teclado);

				break;
			case 2:
				mostrar();
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 3);
	}

	public static void registrar(Scanner teclado) {
		try {
			File archivo = new File("temperaturas.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter("temperaturas.txt", true));

			if (archivo.length() == 0) {
				bw.write("Fecha TemperaturaMaxima TemperaturaMinima");
				bw.newLine();
			}

			teclado.nextLine(); //

			System.out.println("Dime la fecha");
			String fecha = teclado.nextLine();

			System.out.println("Dime la temperatura maxima");
			double tempMax = teclado.nextDouble();

			System.out.println("Dime la temperatura minima");
			double tempMin = teclado.nextDouble();

			bw.write(fecha + " " + tempMax + " " + tempMin);
			bw.newLine();

			System.out.println("Registro guardado");
			bw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void mostrar() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("temperaturas.txt"));
			String linea;
			double max = 0;
			double min = 0;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);

				max = Double.MIN_VALUE;
				min = Double.MAX_VALUE;
				double num = Double.parseDouble(linea);
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}

			}
			System.out.println("Numero mas alto" + max);
			System.out.println("Numero mas bajo" + min);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
