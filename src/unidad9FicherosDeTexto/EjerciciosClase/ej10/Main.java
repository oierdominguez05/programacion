package unidad9FicherosDeTexto.EjerciciosClase.ej10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Se va a mostrar un fichero, se mostrarán las primeras 24 y si quieres ver mas lineas pulsa 1");

		int opcion = 0;

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("textoLargo.txt"));
			String linea;
			int contador = 0;

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				contador++;

				if (contador == 24) {
					System.out.println("Se han imprimido 24 lineas pulsa 1 para seguir o 2 para salir");
					opcion = teclado.nextInt();

					if (opcion == 2) {
						System.out.println("Saliendo");
						break;
					}
					contador = 0;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
