package Unidad10Colecciones.EjerciciosClase.ej10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Temperatura> temperaturas = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);
	static BufferedWriter bw = null;
	static BufferedReader br = null;

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
			System.out.println("MENÚ" + ""
					+ "1. Nuevo registro .\r\n" + "2. Listar registros.\r\n"
					+ "3. Mostrar estadística (con los valores máximo, mínimo y promedio de las\r\n"
					+ "temperaturas registradas hasta el momento desde la primera lectura\r\n" + "del día).\r\n"
					+ "4. Salir.");
			opcion = teclado.nextInt();
			teclado.nextLine();
			if (opcion == 1) {
				registro();
			}
			if (opcion == 2) {
				listar();
			}
			if(opcion == 3) {
				estadistica();
			}

		}
		guardar();
		cerrar();
	}

	static void registro() {
		System.out.println("Introduce la temperatura");
		double temp = teclado.nextDouble();
		teclado.nextLine();
		LocalTime hora = LocalTime.now();
		temperaturas.add(new Temperatura(temp, hora));

	}

	static void listar() {
		
		if(temperaturas.isEmpty()) {
			System.out.println("No hay temperaturas regitradas");
		}
		
		for(Temperatura p : temperaturas) {
			System.out.println(p);
		}
		
		
		
	}
	static void estadistica() {
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double suma = 0;
		double contadorValores = 0;
		double valor;
		for(Temperatura t : temperaturas) {
			 valor = t.getTemp();
			if(valor > max) {
				max = valor;
			}
			if(valor < min) {
				min = valor;
			}
			suma += valor;
			contadorValores++;
		}
		System.out.println("Valor maximo: " + max);
		System.out.println("Valor minimo: " + min);
		System.out.println("Media: " + (suma / contadorValores) );
	}

	static void guardar() {
		try {
			bw = new BufferedWriter(new FileWriter("temperatura.txt"));
			for (Temperatura t : temperaturas) {
				bw.write(t.toString());
				bw.newLine();
			}
			System.out.println("Datos guardados");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	static void cerrar() {
	
			try {
				if(br != null) {
				br.close();
				}
				if(bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}


